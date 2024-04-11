package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answers

data class AnswersResponse(
    val answers: List<AnswerResponse>
) {
    companion object {
        fun of(answers: Answers?) =
            if (answers == null) null else AnswersResponse(answers.answers.map { AnswerResponse.of(it) })
    }
}
