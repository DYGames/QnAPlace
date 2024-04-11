package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.Article
import java.time.LocalDateTime

data class ArticleResponse(
    val id: Long,
    val author: String,
    val date: LocalDateTime,
    val title: String,
    val body: String,
    val questionHeaders: QuestionHeadersResponse,
    val answers: AnswersResponse?,
) {
    companion object {
        fun of(article: Article) = ArticleResponse(
            article.id,
            article.author.name,
            article.date,
            article.title,
            article.body,
            QuestionHeadersResponse.of(article.questionHeaders),
            AnswersResponse.of(article.answers)
        )
    }
}
