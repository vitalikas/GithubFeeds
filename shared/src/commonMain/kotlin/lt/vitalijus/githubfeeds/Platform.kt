package lt.vitalijus.githubfeeds

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform