package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader

data class QuestionHeaderResponse(
    val content: String
) {
    companion object {
        fun of(questionHeader: QuestionHeader) = QuestionHeaderResponse(
            when (questionHeader) {
                is LongQuestionHeader -> questionHeader.hint
                is ShortQuestionHeader -> questionHeader.hint
                is MultipleChoiceQuestionHeader -> questionHeader.choices.joinToString { it.choice }
                else -> ""
            }
        )
    }
}
