package com.qnaplace.qnaplace.qnaplace.service.dto.header

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader

class ShortQuestionHeaderRequest(
    title: String,
    description: String,
    private val hint: String
) : QuestionHeaderRequest(title, description) {
    override fun toDomain(): QuestionHeader = ShortQuestionHeader(
        title,
        description,
        hint
    )
}
