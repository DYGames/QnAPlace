package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answer
import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import com.qnaplace.qnaplace.qnaplace.service.dto.body.QuestionBodyRequest

data class AnswerRequest(
    val questionBodies: List<QuestionBodyRequest> = emptyList(),
) {
    companion object {
        fun toDomain(author: Member, answerRequest: AnswerRequest) = Answer(
            questionBodies = answerRequest.questionBodies.map {
                it.toDomain()
            }, author
        )
    }
}
