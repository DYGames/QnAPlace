package com.qnaplace.qnaplace.qnaplace.domain.repository

import com.qnaplace.qnaplace.qnaplace.domain.article.Article

interface ArticleRepository : BaseRepository<Article, Long> {
    fun findByCategoryId(categoryId: Long): List<Article>
}
