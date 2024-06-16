package com.qnaplace.qnaplace.qnaplace.domain.repository

import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import java.util.Optional

interface MemberRepository : BaseRepository<Member, Long> {
    fun findByNameAndPassword(name: String, password: String): Optional<Member>
    fun findAllByName(name: String): List<Member>
}
