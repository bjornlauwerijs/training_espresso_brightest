package com.example.brghtest.ui.send

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "If you want to contact us, please fill in this contact form."
    }
    val text: LiveData<String> = _text
}