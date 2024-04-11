package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

@Entity
@DiscriminatorValue("MULTIPLE_CHOICE")
class MultipleChoiceQuestionHeader(
    title: String,
    description: String,
    @OneToMany
    @JoinColumn(name = "QUESTION_HEADER_ID")
    val choices: List<Choice>
) : QuestionHeader(title, description)
