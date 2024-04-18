package com.qnaplace.qnaplace.qnaplace.domain.repository

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answer

interface AnswerRepository : BaseRepository<Answer, Long> {
    fun findByArticleId(articleId: Long): List<Answer>
}
