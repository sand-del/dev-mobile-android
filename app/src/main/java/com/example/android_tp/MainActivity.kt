package com.example.android_tp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.android_tp.auth.LoginViewModel
import com.example.android_tp.databinding.ActivityLoginBinding

class MainActivity : ComponentActivity() {

    lateinit var viewBinding: ActivityLoginBinding
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //charger la vue en data binding
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        //association view model xml
        loginViewModel = LoginViewModel()
        viewBinding.loginViewModel = loginViewModel


//        val tvRegister = findViewById<TextView>(R.id.tvRegister)
//        avec le DataBinding
        val tvRegister = viewBinding.tvRegister

        //quand on clique j'ouvre une page
        tvRegister.setOnClickListener {

            //ouvrir la page inscription
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }

        //quand on clique j'ouvre une page
        viewBinding.tvResetPasword.setOnClickListener {

            //ouvrir la page inscription
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)

        }

        viewBinding.btnSubmit.setOnClickListener{

            //Affichage d'une pop up succès + log

            Log.i("AndroidTP3", "Connexion succès")

            //utilisation de l'utilitaire créé
            DialogHelper.showDialog(this, "Vous êtes connecté(e) avec succès")
        }

    }
}