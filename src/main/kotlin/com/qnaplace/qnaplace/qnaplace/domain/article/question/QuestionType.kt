package com.qnaplace.qnaplace.qnaplace.domain.article.question

sealed interface QuestionType {
    interface Short : QuestionType
    interface Long : QuestionType
    interface MultipleChoice : QuestionType
}
