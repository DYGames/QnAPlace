package com.qnaplace.qnaplace.qnaplace.service

import com.qnaplace.qnaplace.qnaplace.domain.repository.ArticleRepository
import com.qnaplace.qnaplace.qnaplace.service.dto.ArticleResponse
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class ArticleService(
    private val articleRepository: ArticleRepository
) {

    @Transactional
    fun findById(articleId: Long): ArticleResponse {
        val article = articleRepository.findById(articleId).get()
        return ArticleResponse.of(article)
    }
}
