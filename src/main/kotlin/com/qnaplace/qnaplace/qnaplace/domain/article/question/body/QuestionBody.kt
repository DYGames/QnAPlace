package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.ManyToOne

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "QUESTION_BODY_TYPE")
abstract class QuestionBody(
    @ManyToOne
    open val questionHeader: QuestionHeader
) : BaseEntity() {
    abstract fun normalizeBody(): String
}
