package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.Article
import java.util.Date

data class ArticleResponse(
    val id: Long,
    val author: String,
    val date: Date,
    val questionHeaders: QuestionHeadersResponse,
    val answers: AnswersResponse?,
) {
    companion object {
        fun of(article: Article) = ArticleResponse(
            article.id,
            article.author.name,
            article.date,
            QuestionHeadersResponse.of(article.questionHeaders),
            AnswersResponse.of(article.answers)
        )
    }
}
