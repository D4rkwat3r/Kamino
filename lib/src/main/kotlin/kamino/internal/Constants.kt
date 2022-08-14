package kamino.internal

import java.util.*

object Constants {
    const val webUserAgent: String = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36 Edg/101.0.1210.53"
    const val mobileUserAgent: String = "Dalvik/2.1.0 (Linux; U; Android 7.1.2; SM-G977N Build/beyond1qlteue-user 7; com.narvii.amino.master/3.4.33597)"
    val decoder = Base64.getDecoder()
    val encoder = Base64.getEncoder()
    val ndcPrefix: ByteArray = decoder.decode("Qg==")
    val ndcSigKey: ByteArray = decoder.decode("+OemGsP3JZQeOsfK4taIvpfzC5M=")
    val ndcDeviceKey: ByteArray = decoder.decode("ArJYxjVZ2IBDIcXVBlrzIDWNNm8=")
}
