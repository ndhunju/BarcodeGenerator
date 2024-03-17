package com.ndhunju.barcodegenerator

import androidx.lifecycle.ViewModel

const val DEFAULT_QR_CODE_CONTENT = "https://github.com/ndhunju"

class ViewModel: ViewModel() {

    fun getQrCodeContent(): String {
        return DEFAULT_QR_CODE_CONTENT
    }

    fun getBodyText(): String {
        return DEFAULT_QR_CODE_CONTENT
    }

}