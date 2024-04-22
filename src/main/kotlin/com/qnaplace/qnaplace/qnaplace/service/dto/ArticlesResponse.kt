package com.qnaplace.qnaplace.qnaplace.service.dto

import com.qnaplace.qnaplace.qnaplace.domain.article.Article
import com.qnaplace.qnaplace.qnaplace.domain.article.question.body.Answers

data class ArticlesResponse(
    val articles: List<ArticleResponse>
) {
    companion object {
        fun of(articles: List<Article>, articleAnswers: List<Answers>) = ArticlesResponse(
            articles = articles.zip(articleAnswers) { article, answers ->
                ArticleResponse.of(article, answers)
            }
        )
    }
}
