package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeaders
import com.qnaplace.qnaplace.qnaplace.service.dto.header.QuestionHeaderRequest

data class QuestionHeadersRequest(
    val values: List<QuestionHeaderRequest> = emptyList()
) {
    companion object {
        fun toDomain(questionHeadersRequest: QuestionHeadersRequest) = QuestionHeaders(
            questionHeadersRequest.values.map {
                LongQuestionHeader(
                    it.title,
                    it.description,
                    ""
                )
            }
        )
    }
}
