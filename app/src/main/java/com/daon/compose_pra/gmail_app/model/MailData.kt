package com.daon.compose_pra.gmail_app.model

data class MailData(
    val mailId:Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timeStamp: String = ""
)
