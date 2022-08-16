package kamino

enum class MediaType(val identifier: Int, val mimeString: String?) {
    DEFAULT(0, null),
    IMAGE(100, "image/jpeg"),
    IMAGE_PNG(100, "image/png"),
    AUDIO(110, "audio/aac"),
    GIF(110, "image/gif"),
}
