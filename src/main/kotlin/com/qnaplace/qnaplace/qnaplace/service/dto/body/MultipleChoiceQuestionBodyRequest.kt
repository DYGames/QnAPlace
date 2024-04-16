package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.MultipleChoiceQuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import com.qnaplace.qnaplace.qnaplace.service.dto.header.QuestionHeaderRequest

class MultipleChoiceQuestionBodyRequest(
    questionHeaderRequest: QuestionHeaderRequest,
    private val choice: Int
) : QuestionBodyRequest(questionHeaderRequest) {
    override fun toDomain(): QuestionBody = MultipleChoiceQuestionBody(
        questionHeaderRequest.toDomain() as MultipleChoiceQuestionHeader,
        choice
    )
}
