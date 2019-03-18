package com.rsupport.qrreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsupport.qrreader.ayhan.view.AyhanActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        QRReaderBtn.setOnClickListener {
            startActivity(Intent(this, QRReadActivity::class.java))
        }

        QRGeneratorBtn.setOnClickListener {
            startActivity(Intent(this, QRGenActivity::class.java))
        }

        ayhanView.setOnClickListener {
            startActivity(Intent(this, AyhanActivity::class.java))
        }

    }
}
