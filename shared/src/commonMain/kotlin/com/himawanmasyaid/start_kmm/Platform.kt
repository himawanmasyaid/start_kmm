package com.himawanmasyaid.start_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform