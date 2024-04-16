package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.LongQuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.service.dto.header.QuestionHeaderRequest

class LongQuestionBodyRequest(
    questionHeaderRequest: QuestionHeaderRequest,
    private val body: String
) : QuestionBodyRequest(questionHeaderRequest) {
    override fun toDomain(): QuestionBody = LongQuestionBody(
        questionHeaderRequest.toDomain() as LongQuestionHeader,
        body
    )
}
