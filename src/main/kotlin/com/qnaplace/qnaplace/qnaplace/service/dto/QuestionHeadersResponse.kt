package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeaders

data class QuestionHeadersResponse(
    val questionHeaders: List<QuestionHeaderResponse>,
) {
    companion object {
        fun of(questionHeaders: QuestionHeaders) = QuestionHeadersResponse(questionHeaders.questionHeaders.map {
            QuestionHeaderResponse.of(it)
        })
    }
}

