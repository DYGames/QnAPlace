package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Answer(
    val articleId: Long,

    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
    val questionBodies: List<QuestionBody>,

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    val author: Member
) : BaseEntity()
