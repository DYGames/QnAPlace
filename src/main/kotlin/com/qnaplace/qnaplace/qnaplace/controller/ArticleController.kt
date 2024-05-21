package com.qnaplace.qnaplace.qnaplace.controller

import com.qnaplace.qnaplace.qnaplace.service.ArticleService
import com.qnaplace.qnaplace.qnaplace.service.dto.AnswerRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleRequest
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleResponse
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticlesResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("articles")
class ArticleController(
    private val articleService: ArticleService
) {
    @GetMapping
    fun findByDateDescending(
        @RequestParam("count") count: Int
    ): ResponseEntity<ArticlesResponse> {
        val articles = articleService.findByDateDescending(count)

        return ResponseEntity.ok().body(articles)
    }

    @GetMapping("/{articleId}")
    fun findById(
        @PathVariable articleId: Long
    ): ResponseEntity<ArticleResponse> {
        val article = articleService.findById(
            articleId
        )

        return ResponseEntity.ok().body(article)
    }

    @GetMapping("/category/{categoryId}")
    fun findByCategoryId(
        @PathVariable categoryId: Long,
    ): ResponseEntity<ArticlesResponse> {
        val articles = articleService.findByCategoryId(
            categoryId
        )

        return ResponseEntity.ok().body(articles)
    }

    @GetMapping("/search")
    fun search(
        @RequestParam("query") query: String,
    ): ResponseEntity<ArticlesResponse> {
        val articles = articleService.search(
            query
        )

        return ResponseEntity.ok().body(articles)
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
        val article = articleService.createAnswer(
            memberId,
            articleId,
            request
        )

        return ResponseEntity.status(HttpStatus.CREATED).body(article)
    }
}
