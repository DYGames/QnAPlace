package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import jakarta.persistence.Embeddable
import jakarta.persistence.OneToMany

@Embeddable
class QuestionHeaders(
    @OneToMany
    val questionHeaders: List<QuestionHeader>
)
