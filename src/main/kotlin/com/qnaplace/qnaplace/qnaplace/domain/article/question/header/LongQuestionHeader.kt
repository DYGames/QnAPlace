package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("LONG")
class LongQuestionHeader(
    title: String,
    description: String,
    val hint: String
) : QuestionHeader(title, description)
