package com.rsupport.qrreader

import android.app.Application
import com.rsupport.qrreader.ayhan.util.MyPreference

/**
 * Created by HanAYeon on 2019. 3. 18..
 */


class App : Application() {

    companion object {

        lateinit var prefs : MyPreference
    }

    override fun onCreate() {
        prefs = MyPreference(applicationContext)
        super.onCreate()
    }
}