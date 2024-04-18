package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answers

data class AnswersResponse(
    val answers: List<AnswerResponse>
) {
    companion object {
        fun of(answers: Answers) =
            AnswersResponse(answers.values.map { AnswerResponse.of(it) })
    }
}
