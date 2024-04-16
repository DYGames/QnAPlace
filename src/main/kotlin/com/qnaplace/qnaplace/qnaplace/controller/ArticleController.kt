package com.qnaplace.qnaplace.qnaplace.controller

import com.qnaplace.qnaplace.qnaplace.service.ArticleService
import com.qnaplace.qnaplace.qnaplace.service.dto.AnswerRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("article")
class ArticleController(
    private val articleService: ArticleService
) {
    @GetMapping("/{articleId}")
    fun findById(
        @PathVariable articleId: Long
    ): ResponseEntity<ArticleResponse> {
        val article = articleService.findById(
            articleId
        )

        return ResponseEntity.ok().body(article)
    }

    @PostMapping
    fun create(
        @RequestHeader(value = "Authorization") memberId: Long,
        @RequestBody request: ArticleRequest
    ): ResponseEntity<ArticleResponse> {
        val article = articleService.create(
            memberId,
            request
        )

        return ResponseEntity.status(HttpStatus.CREATED).body(article)
    }

    @PostMapping("/{articleId}/answers")
    fun createAnswer(
        @RequestHeader(value = "Authorization") memberId: Long,
        @PathVariable articleId: Long,
        @RequestBody request: AnswerRequest
    ): ResponseEntity<ArticleResponse> {
        print(request)
        val article = articleService.createAnswer(
            memberId,
            articleId,
            request
        )
        print(article)
        return ResponseEntity.status(HttpStatus.CREATED).body(article)
    }
}
