package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

@Entity
class QuestionHeaders(
    @OneToMany(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "QUESTION_HEADERS_ID")
    val questionHeaders: List<QuestionHeader>
) : BaseEntity()
