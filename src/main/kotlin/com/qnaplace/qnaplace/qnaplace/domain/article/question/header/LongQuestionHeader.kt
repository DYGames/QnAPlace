package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("LONG")
class LongQuestionHeader(
    val hint: String
) : QuestionHeader()
