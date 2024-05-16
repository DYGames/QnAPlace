package com.qnaplace.qnaplace.qnaplace.controller

import com.qnaplace.qnaplace.qnaplace.service.MemberService
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberEditRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberJoinRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberJoinResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberLoginRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberLoginResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.MemberResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("member")
class MemberController(
    private val memberService: MemberService
) {
    @PostMapping("/join")
    fun join(
        @RequestBody request: MemberJoinRequest
    ): ResponseEntity<MemberJoinResponse> {
        val response = memberService.join(request)

        return ResponseEntity.status(HttpStatus.CREATED).body(response)
    }

    @PostMapping("/login")
    fun login(
        @RequestBody request: MemberLoginRequest
    ): ResponseEntity<MemberLoginResponse> {
        val response = memberService.login(request)

        return ResponseEntity.ok().body(response)
    }

    @PutMapping
    fun edit(
        @RequestBody request: MemberEditRequest
    ): ResponseEntity<MemberResponse> {
        val response = memberService.edit(request)

        return ResponseEntity.ok().body(response)
    }
}
