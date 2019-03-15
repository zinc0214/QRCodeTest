package com.rsupport.qrreader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_qr_gen.*

class QRGenActivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_gen)
        runOnUiThread {
            var bitmap = QRGenerator.generateRQCode("TEST QR CODE GEN")
            QRImageView.setImageBitmap(bitmap)
        }
    }

    override fun onResume() {
        super.onResume()
    }
}