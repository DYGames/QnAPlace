package com.qnaplace.qnaplace.qnaplace.domain.article.question.body

import com.qnaplace.qnaplace.qnaplace.domain.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

@Entity
class Answers(
    @OneToMany
    @JoinColumn(name = "ANSWERS_ID")
    val answers: List<Answer>
) : BaseEntity() {
    fun addAnswer(answer: Answer): Answers {
        val answers = Answers(
            answers = answers.plus(answer)
        )

        return answers
    }
}
