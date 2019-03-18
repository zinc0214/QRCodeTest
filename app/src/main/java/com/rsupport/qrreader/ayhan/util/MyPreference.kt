package com.rsupport.qrreader.ayhan.util

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by HanAYeon on 2019. 3. 18..
 */
class MyPreference(context: Context?) {

    val PREFS_FILENAME = "prefs"
    val MANAGE_CODE = ""

    val prefs : SharedPreferences = context!!.getSharedPreferences(PREFS_FILENAME, 0)

    var manageCode : String
    get() = prefs.getString(MANAGE_CODE, "")
    set(value) = prefs.edit().putString(MANAGE_CODE, value).apply()



}