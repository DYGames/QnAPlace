package com.qnaplace.qnaplace.qnaplace.domain.member

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member(
    @Column(unique = true)
    val name: String,
    val email: String,
    val password: String,
    id: Long = 0
) : BaseEntity(id) {
    fun edit(
        name: String = this.name,
        email: String = this.email
    ) = Member(
        name,
        email,
        password,
        id
    )
}
