package kamino

enum class MessageType(val identifier: Int) {
    DEFAULT(0),
    AUDIO(2),
    STICKER(3),
    UNSUPPORTED(51),
    SYSTEM(109)
}
