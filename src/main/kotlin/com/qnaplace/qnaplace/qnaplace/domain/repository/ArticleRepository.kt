package com.qnaplace.qnaplace.qnaplace.domain.repository

import com.qnaplace.qnaplace.qnaplace.domain.article.Article

interface ArticleRepository : BaseRepository<Article, Long> {
    fun findByCategoryId(categoryId: Long): List<Article>
    fun findByTitleOrBodyContainingIgnoreCase(title: String, body: String): List<Article>
    fun findAllByOrderByDateDesc(): List<Article>
}
