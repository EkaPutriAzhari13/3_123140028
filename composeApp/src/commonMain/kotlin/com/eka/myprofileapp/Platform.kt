package com.eka.myprofileapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform