package com.qnaplace.qnaplace.qnaplace.service.dto.header

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader

class LongQuestionHeaderRequest(
    title: String,
    description: String,
    private val hint: String
) : QuestionHeaderRequest(title, description) {
    override fun toDomain(): QuestionHeader = LongQuestionHeader(
        title,
        description,
        hint
    )
}
