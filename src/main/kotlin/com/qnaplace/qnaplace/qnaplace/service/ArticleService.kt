package com.qnaplace.qnaplace.qnaplace.service

import com.qnaplace.qnaplace.qnaplace.domain.article.Article
import com.qnaplace.qnaplace.qnaplace.domain.repository.ArticleRepository
import com.qnaplace.qnaplace.qnaplace.domain.repository.MemberRepository
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.QuestionHeadersRequest
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Transactional
@Service
class ArticleService(
    private val articleRepository: ArticleRepository,
    private val memberRepository: MemberRepository
) {

    @Transactional
    fun findById(articleId: Long): ArticleResponse {
        val article = articleRepository.findById(articleId).get()

        return ArticleResponse.of(article)
    }

    @Transactional
    fun create(memberId: Long, articleRequest: ArticleRequest): ArticleResponse {
        val author = memberRepository.findById(memberId).get()

        val article = Article(
            author = author,
            date = LocalDateTime.now(),
            articleRequest.title,
            articleRequest.body,
            QuestionHeadersRequest.toDomain(articleRequest.questionHeaders),
            null
        )

        return ArticleResponse.of(article)
    }
}
