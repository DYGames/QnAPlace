package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import com.qnaplace.qnaplace.qnaplace.domain.member.Member
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Answer(
    @OneToMany
    @JoinColumn(name = "ANSWER_ID")
    val questionBodies: List<QuestionBody>,

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    val author: Member
) : BaseEntity()
