package ke.don.ibisian

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform