package com.daon.compose_pra.news_app

import com.daon.compose_pra.R

data class NewsData(
    val id: Int,
    val image: Int = R.drawable.breaking_news,
    val author: String,
    val title: String,
    val description: String,
    val publishedAt: String
)