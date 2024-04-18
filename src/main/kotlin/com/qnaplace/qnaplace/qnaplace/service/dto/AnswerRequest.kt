package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.service.dto.body.QuestionBodyRequest

data class AnswerRequest(
    val id: Long,
    val questionBodies: List<QuestionBodyRequest> = emptyList(),
)
