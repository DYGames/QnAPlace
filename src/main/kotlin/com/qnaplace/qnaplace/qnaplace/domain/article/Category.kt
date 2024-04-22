package com.qnaplace.qnaplace.qnaplace.domain.article

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.Entity

@Entity
class Category(
    val name: String
) : BaseEntity()
