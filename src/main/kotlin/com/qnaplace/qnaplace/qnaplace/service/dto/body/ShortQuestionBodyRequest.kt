package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.ShortQuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader
import com.qnaplace.qnaplace.qnaplace.service.dto.header.QuestionHeaderRequest

class ShortQuestionBodyRequest(
    questionHeaderRequest: QuestionHeaderRequest,
    private val body: String
) : QuestionBodyRequest(questionHeaderRequest) {
    override fun toDomain(): QuestionBody = ShortQuestionBody(
        questionHeaderRequest.toDomain() as ShortQuestionHeader,
        body
    )
}
