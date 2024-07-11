package com.example.android_tp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class PasswordActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_password)


        val btnSubmit = findViewById<Button>(R.id.btnSubmitPassword)
        btnSubmit.setOnClickListener{

            val email = findViewById<EditText>(R.id.edtEmailReset).text.toString()

            //utilisation de l'utilitaire créé
            DialogHelper.showDialog(this, "Email : ${email}")
        }


    }
}