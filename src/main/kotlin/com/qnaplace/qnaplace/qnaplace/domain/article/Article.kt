package com.qnaplace.qnaplace.qnaplace.domain.article

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import com.qnaplace.qnaplace.qnaplace.domain.article.question.header.QuestionHeaders
import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import jakarta.persistence.CascadeType
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

    @ManyToOne
    val category: Category,

    @OneToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "QUESTION_HEADERS_ID")
    val questionHeaders: QuestionHeaders,
) : BaseEntity()
