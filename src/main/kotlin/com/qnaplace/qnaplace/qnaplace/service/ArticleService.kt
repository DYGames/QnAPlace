package com.qnaplace.qnaplace.qnaplace.service

import com.qnaplace.qnaplace.qnaplace.domain.article.Article
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answer
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answers
import com.qnaplace.qnaplace.qnaplace.domain.repository.AnswerRepository
import com.qnaplace.qnaplace.qnaplace.domain.repository.ArticleRepository
import com.qnaplace.qnaplace.qnaplace.domain.repository.CategoryRepository
import com.qnaplace.qnaplace.qnaplace.domain.repository.MemberRepository
import com.qnaplace.qnaplace.qnaplace.service.dto.AnswerRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticlesResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.QuestionHeadersRequest
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Transactional
@Service
class ArticleService(
    private val articleRepository: ArticleRepository,
    private val answerRepository: AnswerRepository,
    private val memberRepository: MemberRepository,
    private val categoryRepository: CategoryRepository,
) {
    @Transactional
    fun findById(articleId: Long): ArticleResponse {
        val article = articleRepository.findById(articleId).get()
        val answers = Answers(answerRepository.findByArticleId(articleId))

        return ArticleResponse.of(article, answers)
    }

    @Transactional
    fun findByCategoryId(categoryId: Long): ArticlesResponse {
        val articles = articleRepository.findByCategoryId(categoryId)
        val articleAnswers = articles.map {
            Answers(answerRepository.findByArticleId(it.id))
        }

        return ArticlesResponse.of(articles, articleAnswers)
    }

    @Transactional
    fun search(query: String): ArticlesResponse {
        val articles = articleRepository.findByTitleOrBodyContainingIgnoreCase(query, query)
        val articleAnswers = articles.map {
            Answers(answerRepository.findByArticleId(it.id))
        }

        return ArticlesResponse.of(articles, articleAnswers)
    }

    @Transactional
    fun create(memberId: Long, articleRequest: ArticleRequest): ArticleResponse {
        val author = memberRepository.findById(memberId).get()
        val category = categoryRepository.findById(articleRequest.categoryId).get()

        val article = Article(
            author = author,
            date = LocalDateTime.now(),
            title = articleRequest.title,
            body = articleRequest.body,
            category = category,
            questionHeaders = QuestionHeadersRequest.toDomain(articleRequest.questionHeaders),
        )

        return ArticleResponse.of(articleRepository.save(article), Answers())
    }

    @Transactional
    fun createAnswer(memberId: Long, articleId: Long, request: AnswerRequest): ArticleResponse {
        val author = memberRepository.findById(memberId).get()
        val article = articleRepository.findById(articleId).get()
        val questionHeaders = article.questionHeaders.questionHeaders

        val answer = Answer(
            articleId = articleId,
            questionBodies = request.questionBodies.map { questionBody ->
                questionBody.toDomain(
                    questionHeaders.first { it.id == questionBody.questionHeaderId }
                )
            },
            author = author,
        )

        answerRepository.save(answer)

        val answers = answerRepository.findByArticleId(articleId)

        return ArticleResponse.of(article, Answers(answers))
    }
}
