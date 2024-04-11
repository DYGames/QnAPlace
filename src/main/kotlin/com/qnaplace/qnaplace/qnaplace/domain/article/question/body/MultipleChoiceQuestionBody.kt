package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("MULTIPLE_CHOICE")
class MultipleChoiceQuestionBody(
    multipleChoiceQuestionHeader: MultipleChoiceQuestionHeader,

    val body: Int
) : QuestionBody(multipleChoiceQuestionHeader) {
    override fun normalizeBody(): String = body.toString()
}
