package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "QUESTION_HEADER_TYPE")
abstract class QuestionHeader(
    open val title: String = "",
    open val description: String = "",
) : BaseEntity()
