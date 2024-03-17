package com.ndhunju.barcodegenerator

import android.os.Bundle
import androidx.activity.viewModels
import com.ndhunju.barcodegeneratorlibrary.BarcodeGeneratorActivity

class QrCodeGeneratorActivity : BarcodeGeneratorActivity() {

    private val viewModel by viewModels<ViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setQrCodeContent(viewModel.getQrCodeContent())
        setBodyText(viewModel.getBodyText())
    }


}