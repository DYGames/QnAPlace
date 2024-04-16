package com.qnaplace.qnaplace.qnaplace.domain.article

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answer
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answers
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeaders
import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne
import java.time.LocalDateTime

@Entity
class Article(
    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    val author: Member,

    val date: LocalDateTime,

    val title: String,

    val body: String,

    @Embedded
    @JoinColumn(name = "QUESTION_HEADERS_ID")
    val questionHeaders: QuestionHeaders,

    @OneToOne
    @JoinColumn(name = "ANSWERS_ID")
    val answers: Answers?,
) : BaseEntity() {
    fun addAnswer(answer: Answer): Article {
        val article = Article(
            author = author,
            date = date,
            title = title,
            body = body,
            questionHeaders = questionHeaders,
            answers = answers?.addAnswer(answer),
        )

        return article
    }
}
