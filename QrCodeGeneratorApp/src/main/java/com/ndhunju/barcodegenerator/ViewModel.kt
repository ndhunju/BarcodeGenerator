package com.ndhunju.barcodegenerator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

const val DEFAULT_QR_CODE_CONTENT = "https://github.com/ndhunju"

class ViewModel: ViewModel() {

    suspend fun getQrCodeContent(): String {
        return withContext(Dispatchers.IO) {
            delay(3000) // Mimic network call
            DEFAULT_QR_CODE_CONTENT
        }
    }

    fun getBodyText(): String {
        return DEFAULT_QR_CODE_CONTENT
    }

}