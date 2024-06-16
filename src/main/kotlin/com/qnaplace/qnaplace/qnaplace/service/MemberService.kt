package com.qnaplace.qnaplace.qnaplace.service

import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import com.qnaplace.qnaplace.qnaplace.domain.repository.MemberRepository
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberEditRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberJoinRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberJoinResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberLoginRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberLoginResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberResponse
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository, private val entityManager: EntityManager
) {

    @Transactional
    fun join(memberJoinRequest: MemberJoinRequest): MemberJoinResponse {
        val member = Member(
            memberJoinRequest.name,
            memberJoinRequest.email,
            memberJoinRequest.password,
        )

        val savedMember = memberRepository.save(member)

        return MemberJoinResponse.of(savedMember)
    }

    @Transactional
    fun login(memberLoginRequest: MemberLoginRequest): MemberLoginResponse {
        val member = memberRepository.findByNameAndPassword(memberLoginRequest.name, memberLoginRequest.password).get()

        return MemberLoginResponse.of(member)
    }

    @Transactional
    fun edit(memberEditRequest: MemberEditRequest): MemberResponse {
        val member = memberRepository.findById(memberEditRequest.memberId).get()

        val editedMember = member.edit(
            memberEditRequest.name, memberEditRequest.email
        )

        val mergedMember = entityManager.merge(
            editedMember
        )

        return MemberResponse.of(mergedMember)
    }

    @Transactional
    fun isDuplicatedName(memberName: String): Boolean {
        val members = memberRepository.findAllByName(memberName)

        return members.isNotEmpty()
    }
}
