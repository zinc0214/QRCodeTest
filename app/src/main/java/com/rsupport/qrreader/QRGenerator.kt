package com.rsupport.qrreader

import android.graphics.Bitmap
import android.graphics.Color
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter


class QRGenerator {

    companion object {
        fun generateRQCode(contents: String) : Bitmap? {
            var qrCodeWriter = QRCodeWriter()
            var bitmap : Bitmap? = null
            try {
                bitmap = toBitmap(qrCodeWriter.encode(contents, BarcodeFormat.QR_CODE, 100, 100))
            } catch (e: WriterException) {
                e.printStackTrace()
            }

            return bitmap
        }

        private fun toBitmap(matrix: BitMatrix): Bitmap {
            val height = matrix.getHeight()
            val width = matrix.getWidth()
            val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)

            for (x in 0 until width) {
                for (y in 0 until height) {
                    bmp.setPixel(
                        x, y,
                        if (matrix.get(x, y)) Color.BLACK else Color.WHITE
                    )
                }
            }

            return bmp
        }
    }

}