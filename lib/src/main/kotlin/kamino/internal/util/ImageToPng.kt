package kamino.internal.util

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import javax.imageio.ImageIO

class ImageToPng(image: ByteArray) {

    private val image = ImageIO.read(ByteArrayInputStream(image))

    fun get(): ByteArray {
        val stream = ByteArrayOutputStream()
        ImageIO.write(image, "png", stream)
        return stream.toByteArray()
    }
}
