package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeaders

data class QuestionHeadersResponse(
    val titles: List<String>,
    val descriptions: List<String>,
    val headers: List<QuestionHeaderResponse>
) {
    companion object {
        fun of(questionHeaders: QuestionHeaders) =
            QuestionHeadersResponse(
                questionHeaders.questionHeaders.map { it.title },
                questionHeaders.questionHeaders.map { it.description },
                questionHeaders.questionHeaders.map { QuestionHeaderResponse.of(it) })

    }
}

