package com.qnaplace.qnaplace.qnaplace.service

import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import com.qnaplace.qnaplace.qnaplace.domain.repository.MemberRepository
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberJoinRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberLoginRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberLoginResponse
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

    @Transactional
    fun join(memberJoinRequest: MemberJoinRequest) {
        val member = Member(
            memberJoinRequest.name,
            memberJoinRequest.email,
            memberJoinRequest.password,
        )

        memberRepository.save(member)
    }

    @Transactional
    fun login(memberLoginRequest: MemberLoginRequest): MemberLoginResponse {
        val member = memberRepository.findByNameAndPassword(memberLoginRequest.name, memberLoginRequest.password).get()

        return MemberLoginResponse.of(member)
    }
}
