package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.QuestionType
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("LONG")
class LongQuestionBody(
    longQuestionHeader: LongQuestionHeader,
    val body: String
) : QuestionBody(longQuestionHeader), QuestionType.Long {
    override fun normalizeBody(): String = body
}
