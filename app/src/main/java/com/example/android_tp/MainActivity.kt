package com.example.android_tp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_tp.ui.theme.Android_TPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val tvRegister = findViewById<TextView>(R.id.tvRegister)

        //quand on clique j'ouvre une page
        tvRegister.setOnClickListener {

            //ouvrir la page inscription
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }

        val tvResetPassword = findViewById<TextView>(R.id.tvResetPasword)

        //quand on clique j'ouvre une page
        tvResetPassword.setOnClickListener {

            //ouvrir la page inscription
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)

        }

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener{

            //Affichage d'une pop up succès + log

            Log.i("AndroidTP3", "Connexion succès")

            //utilisation de l'utilitaire créé
            DialogHelper.showDialog(this, "Vous êtes connecté(e) avec succès")
        }

    }
}