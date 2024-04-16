package com.qnaplace.qnaplace.qnaplace.service.dto.header

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.Choice
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader

class MultipleChoiceQuestionHeaderRequest(
    title: String,
    description: String,
    private val choices: List<String>
) : QuestionHeaderRequest(title, description) {
    override fun toDomain(): QuestionHeader = MultipleChoiceQuestionHeader(
        title,
        description,
        choices.map { Choice(it) }
    )
}
