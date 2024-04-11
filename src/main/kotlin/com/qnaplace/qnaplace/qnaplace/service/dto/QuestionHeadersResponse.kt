package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeaders
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader

data class QuestionHeadersResponse(
    val titles: List<String>,
    val descriptions: List<String>,
    val headers: List<QuestionHeaderResponse>
) {
    companion object {
        fun of(questionHeaders: QuestionHeaders) =
            QuestionHeadersResponse(
                questionHeaders.questionHeaders.map { it.title },
                questionHeaders.questionHeaders.map { it.description },
                questionHeaders.questionHeaders.map { QuestionHeaderResponse.of(it) })

    }
}

