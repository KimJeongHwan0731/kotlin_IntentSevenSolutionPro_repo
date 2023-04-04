package com.example.intentsevensolutionpro

import java.io.Serializable

// Serializable : 데이터를 하나씩 나열
data class LoginData(val id: String, val pwd: String) : Serializable
