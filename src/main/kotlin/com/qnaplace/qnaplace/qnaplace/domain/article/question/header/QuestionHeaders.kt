package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

@Entity
class QuestionHeaders(
    @OneToMany
    @JoinColumn(name = "QUESTION_HEADERS_ID")
    val questionHeaders: List<QuestionHeader>
) : BaseEntity()
