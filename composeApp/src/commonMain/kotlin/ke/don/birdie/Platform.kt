package ke.don.birdie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform