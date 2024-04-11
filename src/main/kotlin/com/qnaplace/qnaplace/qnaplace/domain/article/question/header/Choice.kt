package com.qnaplace.qnaplace.qnaplace.domain.article.question.header

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.Entity

@Entity
class Choice(
    val choice: String
) : BaseEntity()
