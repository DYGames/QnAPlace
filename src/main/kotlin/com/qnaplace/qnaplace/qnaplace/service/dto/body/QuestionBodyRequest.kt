package com.qnaplace.qnaplace.qnaplace.service.dto.body

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.QuestionBody
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "@type"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = LongQuestionBodyRequest::class, name = "LongQuestionBodyRequest"),
    JsonSubTypes.Type(value = ShortQuestionBodyRequest::class, name = "ShortQuestionBodyRequest"),
    JsonSubTypes.Type(value = MultipleChoiceQuestionBodyRequest::class, name = "MultipleChoiceQuestionBodyRequest"),
)
abstract class QuestionBodyRequest(
    val questionHeaderId: Long
) {
    abstract fun toDomain(questionHeader: QuestionHeader): QuestionBody
}
