package com.qnaplace.qnaplace.qnaplace.domain.member

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.Entity

@Entity
class Member(
    val name: String,
    val email: String
) : BaseEntity()
