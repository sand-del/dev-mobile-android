package com.example.android_tp.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var person = MutableLiveData<Person>(Person());

}