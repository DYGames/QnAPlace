package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.member.Member

data class MemberJoinResponse(
    val memberId: Long
) {
    companion object {
        fun of(member: Member) = MemberJoinResponse(
            memberId = member.id
        )
    }
}
