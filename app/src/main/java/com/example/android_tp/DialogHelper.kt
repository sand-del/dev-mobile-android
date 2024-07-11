package com.example.android_tp

import android.app.AlertDialog
import android.content.Context

class DialogHelper {

    //équivalent à static dans Java
    companion object {

        fun showDialog(context: Context, message: String) {
            val builder = AlertDialog.Builder(context)
            builder.setTitle("Information")
            builder.setMessage(message)
            builder.show()
        }
    }

}