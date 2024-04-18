package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.LongQuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader

class LongQuestionBodyRequest(
    questionHeaderId: Long,
    private val body: String
) : QuestionBodyRequest(questionHeaderId) {
    override fun toDomain(questionHeader: QuestionHeader): QuestionBody = LongQuestionBody(
        questionHeader as LongQuestionHeader,
        body
    )
}
