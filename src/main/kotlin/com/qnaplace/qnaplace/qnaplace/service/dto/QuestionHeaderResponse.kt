package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.question.QuestionType
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.LongQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.MultipleChoiceQuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.ShortQuestionHeader

data class QuestionHeaderResponse(
    val id: Long,
    val title: String,
    val description: String,
    val content: String,
    val type: String
) {
    companion object {
        fun of(questionHeader: QuestionHeader) = QuestionHeaderResponse(
            questionHeader.id,
            questionHeader.title,
            questionHeader.description,
            when (questionHeader as QuestionType) {
                is QuestionType.Long -> (questionHeader as LongQuestionHeader).hint
                is QuestionType.Short -> (questionHeader as ShortQuestionHeader).hint
                is QuestionType.MultipleChoice -> (questionHeader as MultipleChoiceQuestionHeader).choices.joinToString { it.choice }
            },
            questionHeader::class.java.simpleName)
    }
}
