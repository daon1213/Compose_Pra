package com.daon.compose_pra.gmail_app.model

//Todo 1:create an account data class
data class Account(
    val icon: Int? = null,
    val userName: String,
    val email: String,
    val unReadMails: Int
)