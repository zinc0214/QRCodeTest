package com.rsupport.qrreader.ayhan.view

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.rsupport.qrreader.App
import com.rsupport.qrreader.App.Companion.prefs

import com.rsupport.qrreader.R
import com.rsupport.qrreader.ayhan.util.MyPreference
import com.rsupport.qrreader.databinding.QrcreateFragmentBinding

class QRCreateFragment : Fragment() {

    companion object {
        fun newInstance() = QRCreateFragment()
    }

    private var viewModel = QRCreateViewModel()
    private lateinit var binding: QrcreateFragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<QrcreateFragmentBinding>(inflater, R.layout.qrcreate_fragment, container, false)
                .apply {

                    manageNumEditer.setText(getManageNum())
                    qrCodeCreateBtn.setOnClickListener(qrCreateOnClickListener())


                }

        return binding.root
    }


    private fun qrCreateOnClickListener(): View.OnClickListener {
        return View.OnClickListener {
            setManageNum()
            binding.qrImg.setImageBitmap(viewModel.makeQRCOde(getQRCodeCreateInfo()))
        }
    }

    private fun getQRCodeCreateInfo() : String {

        val info = "${getManageNum()}\n${Build.VERSION.RELEASE}"
        return info
    }

    private fun setManageNum() {
        App.prefs.manageCode = binding.manageNumEditer.text.toString()

    }

    private fun getManageNum(): String {

        return App.prefs.manageCode

    }

}
