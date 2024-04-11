package com.qnaplace.qnaplace.qnaplace.service.dto

import java.time.LocalDateTime

data class ArticleRequest(
    val memberId: Long,
    val date: LocalDateTime,
    val title: String,
    val body: String,
    val questionHeaders: QuestionHeadersRequest,
)
