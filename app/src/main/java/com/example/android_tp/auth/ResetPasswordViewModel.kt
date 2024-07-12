package com.example.android_tp.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResetPasswordViewModel : ViewModel() {
    var email = MutableLiveData<String>("");

}