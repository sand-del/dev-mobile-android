package com.example.android_tp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.android_tp.auth.ResetPasswordViewModel
import com.example.android_tp.databinding.ActivityPasswordBinding

class PasswordActivity : ComponentActivity(){

    lateinit var viewBinding : ActivityPasswordBinding
    lateinit var passwordViewModel: ResetPasswordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_password)

        passwordViewModel = ResetPasswordViewModel()
        viewBinding.resetPasswordViewModel = passwordViewModel


        viewBinding.btnSubmitPassword.setOnClickListener{

            val email = viewBinding.edtEmailReset.text.toString()

            //utilisation de l'utilitaire créé
            DialogHelper.showDialog(this, "Email : ${passwordViewModel.email.value!!}")
        }


    }
}