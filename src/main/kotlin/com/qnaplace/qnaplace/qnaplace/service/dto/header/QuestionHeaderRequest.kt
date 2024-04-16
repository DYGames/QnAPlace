package com.qnaplace.qnaplace.qnaplace.service.dto.header

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeader

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "@type"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = LongQuestionHeaderRequest::class, name = "LongQuestionHeaderRequest"),
    JsonSubTypes.Type(value = ShortQuestionHeaderRequest::class, name = "ShortQuestionHeaderRequest"),
    JsonSubTypes.Type(value = MultipleChoiceQuestionHeaderRequest::class, name = "MultipleChoiceQuestionHeaderRequest"),
)
abstract class QuestionHeaderRequest(
    val title: String, val description: String
) {
    abstract fun toDomain(): QuestionHeader
}
