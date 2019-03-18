package com.rsupport.qrreader.ayhan.util

import android.graphics.Bitmap
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.journeyapps.barcodescanner.BarcodeEncoder
import java.util.*

/**
 * Created by HanAYeon on 2019. 3. 15..
 */

class CreateQRCode() {

    fun create() : Bitmap {

        var bitmap : Bitmap ?= null

        val multiFormatWriter = MultiFormatWriter()

        try {

            val hint = Hashtable<EncodeHintType, String>()
            hint.put(EncodeHintType.CHARACTER_SET, "utf-8")

            val bitMatrix = multiFormatWriter.encode("ayhan", BarcodeFormat.QR_CODE, 300, 300, hint)
            val barcodeEncoder = BarcodeEncoder()
            bitmap = barcodeEncoder.createBitmap(bitMatrix)
        } catch (e : WriterException) {
            e.printStackTrace()
        }

        return bitmap!!
    }
}