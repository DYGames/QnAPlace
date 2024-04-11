package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answer

data class AnswerResponse(
    val id: Long,
    val author: String,
    val bodies: List<String>
) {
    companion object {
        fun of(answer: Answer) =
            AnswerResponse(answer.id, answer.author.name, answer.questionBodies.map { it.normalizeBody() })
    }
}
