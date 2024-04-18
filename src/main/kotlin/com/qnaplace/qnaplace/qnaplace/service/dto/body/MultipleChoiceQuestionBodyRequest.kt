package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.MultipleChoiceQuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader

class MultipleChoiceQuestionBodyRequest(
    questionHeaderId: Long,
    private val choice: Int
) : QuestionBodyRequest(questionHeaderId) {
    override fun toDomain(questionHeader: QuestionHeader): QuestionBody = MultipleChoiceQuestionBody(
        questionHeader as MultipleChoiceQuestionHeader,
        choice
    )
}
