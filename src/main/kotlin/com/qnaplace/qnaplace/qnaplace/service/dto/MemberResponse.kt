package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.member.Member

data class MemberResponse(
    val id: Long,
    val name: String,
    val email: String
) {
    companion object {
        fun of(member: Member) = MemberResponse(
            id = member.id,
            name = member.name,
            email = member.email
        )
    }
}
