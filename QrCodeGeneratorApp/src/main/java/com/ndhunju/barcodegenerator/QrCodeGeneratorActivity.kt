package com.ndhunju.barcodegenerator

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.ndhunju.barcodegeneratorlibrary.BarcodeGeneratorActivity
import kotlinx.coroutines.launch

class QrCodeGeneratorActivity : BarcodeGeneratorActivity() {

    private val viewModel by viewModels<ViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBodyText(viewModel.getBodyText())
        lifecycleScope.launch { setQrCodeContent(viewModel.getQrCodeContent()) }
    }


}