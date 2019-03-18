package com.rsupport.qrreader.ayhan.view

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel;
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.journeyapps.barcodescanner.BarcodeEncoder
import java.util.*

class QRCreateViewModel : ViewModel() {

    fun makeQRCOde(managerNum: String): Bitmap? {

        var bitmap: Bitmap? = null
        var multiFormatWriter = MultiFormatWriter()

        try {

            val hints = Hashtable<EncodeHintType, String>()
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8")

            val bitMatrix = multiFormatWriter.encode(managerNum, BarcodeFormat.QR_CODE, 300, 300, hints)
            val barcodeEncoder = BarcodeEncoder()
            bitmap = barcodeEncoder.createBitmap(bitMatrix)
        } catch (e: WriterException) {
            e.printStackTrace()
        }

        return bitmap
    }


}
