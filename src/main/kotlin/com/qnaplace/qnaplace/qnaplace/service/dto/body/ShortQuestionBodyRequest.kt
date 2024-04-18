package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.ShortQuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader

class ShortQuestionBodyRequest(
    questionHeaderId: Long,
    private val body: String
) : QuestionBodyRequest(questionHeaderId) {
    override fun toDomain(questionHeader: QuestionHeader): QuestionBody = ShortQuestionBody(
        questionHeader as ShortQuestionHeader,
        body
    )
}
