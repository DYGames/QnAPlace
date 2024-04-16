package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import com.qnaplace.qnaplace.qnaplace.domain.article.question.QuestionType
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("SHORT")
class ShortQuestionHeader(
    title: String,
    description: String,
    val hint: String
) : QuestionHeader(title, description), QuestionType.Short
