package kamino.exception

class AminoException(val apiCode: Int,
                     val apiMessage: String) : Exception(apiMessage)
