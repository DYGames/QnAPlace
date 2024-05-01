package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.member.Member

data class MemberLoginResponse(
    val id: Long
) {
    companion object {
        fun of(member: Member) = MemberLoginResponse(member.id)
    }
}
