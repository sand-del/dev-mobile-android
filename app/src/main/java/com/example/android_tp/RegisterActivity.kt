package com.example.android_tp

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.setOnClickListener {

            //Afficher la saisie dans un log

            //1-- récupérer l'édit text, le champ
            val edtPseudo = findViewById<EditText>(R.id.edtPseudo)
            val edtEmail = findViewById<EditText>(R.id.edtEmail)
            val edtPassword = findViewById<EditText>(R.id.edtPassword)
            val edtCityCode = findViewById<EditText>(R.id.edtCityCode)
            val edtCity = findViewById<EditText>(R.id.edtCity)
            val edtPhone = findViewById<EditText>(R.id.edtPhone)

            //2-- récupération de la valeur du champ
            val valueTest =
                edtPseudo.text.toString() + " " + edtEmail.text.toString() + " " + edtPassword.text.toString() + " " + edtCityCode.text.toString() + " " + edtCity.text.toString() + " " + edtPhone.text.toString()

            //version  optimisé du code ci dessus
//            val editTextIds = listOf(
//                R.id.edtPseudo,
//                R.id.edtEmail,
//                R.id.edtPassword,
//                R.id.edtCityCode,
//                R.id.edtCity,
//                R.id.edtPhone
//            )
//            val valueTest = editTextIds
//                .map { findViewById<EditText>(it).text.toString() }
//                .joinToString(" ")


            // BONUS
            //v3 for each correction
            /*
            val parent = findViewById<LinearLayout>(R.id.layoutForm);
            var message = "";
            for (i in 0 until parent.childCount){
                // récuperer le composant par son index
                val view = parent.getChildAt(i);

                // tester le cast en toute sécurité et en plus dans le if le view devient un type EditText
                if (view is EditText) {
                    message += "${view.text.toString()}\n";
                }
            }
            // afficher la popup
            DialogHelper.showDialog(this, message);
            */
            Log.i("AndroidTP3", "Les valeurs saisies sont : ${valueTest}")

            //afficher une pop.up
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Information") //définition du titre de la popup
            builder.setMessage("Les valeurs saisies sont : ${valueTest}") //le message de la popup
            builder.show() //affiche dans l'écran la popup
        }

    }
}