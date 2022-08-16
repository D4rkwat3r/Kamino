package kamino.internal.util

import kamino.model.MediaObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.serialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*

class MediaObjectSerializer : KSerializer<MediaObject> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("MediaList") {
        element("type", serialDescriptor<Int>())
        element("url", serialDescriptor<String>())
        element("identifier", serialDescriptor<String?>())
    }

    override fun deserialize(decoder: Decoder): MediaObject {
        val baseJsonArray = decoder.decodeSerializableValue(JsonArray.serializer())
        return MediaObject(
            baseJsonArray[0].jsonPrimitive.int,
            baseJsonArray[1].jsonPrimitive.content,
            baseJsonArray.getOrNull(3)?.jsonPrimitive?.content
        )
    }

    override fun serialize(encoder: Encoder, value: MediaObject) {
        val jsonArray = buildJsonArray {
            add(value.type as Number)
            add(value.url)
            add(JsonNull)
            if (value.identifier != null) add(value.identifier)
        }
        return encoder.encodeSerializableValue(JsonArray.serializer(), jsonArray)
    }

}
