package com.rsupport.qrreader.ayhan.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.rsupport.qrreader.R
import com.rsupport.qrreader.databinding.ActivityAyhanBinding

/**
 * Created by HanAYeon on 2019. 3. 18..
 */

class AyhanActivity : AppCompatActivity() {


    lateinit var binding: ActivityAyhanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayhan)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_ayhan)

        binding.apply {
            val fm = supportFragmentManager
            val fragmentTransaction = fm.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, QRCreateFragment.newInstance(), "")
            fragmentTransaction.commit()
        }

    }
}