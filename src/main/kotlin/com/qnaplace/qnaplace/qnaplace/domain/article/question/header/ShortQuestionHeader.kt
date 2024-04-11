package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("SHORT")
class ShortQuestionHeader(
    val hint: String
) : QuestionHeader()
