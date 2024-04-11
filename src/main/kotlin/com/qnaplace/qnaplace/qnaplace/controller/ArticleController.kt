package com.qnaplace.qnaplace.qnaplace.controller

import com.qnaplace.qnaplace.qnaplace.service.ArticleService
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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
        val article = articleService.findById(articleId)
        return ResponseEntity.ok().body(article)
    }
}
