package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.QuestionType
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("SHORT")
class ShortQuestionBody(
    shortQuestionHeader: ShortQuestionHeader,

    val body: String
) : QuestionBody(shortQuestionHeader), QuestionType.Short {
    override fun normalizeBody(): String = body
}
