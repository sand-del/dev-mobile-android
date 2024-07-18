package com.example.android_tp.compose.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_tp.R
import com.example.android_tp.ui.theme.Android_TPTheme
import com.example.android_tp.ui.theme.AuthIcon
import com.example.android_tp.ui.theme.ENITextField
import com.example.android_tp.ui.theme.GradientButton

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_TPTheme {
                LoginContentPage()
            }
        }
    }
}


@Composable
fun LoginContentPage() {

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = with(Modifier) {
                fillMaxSize().paint(
                    painterResource(id = R.drawable.background),
                    contentScale = ContentScale.Crop
                )
            })
        Column(
            modifier = Modifier
                .padding(innerPadding.calculateTopPadding() + 40.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AuthIcon(imageVector = Icons.Default.AccountCircle)
            Text(text = "Login", fontSize = 40.sp, modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.padding(vertical = 40.dp))
            ENITextField(labelText = "Email")
            ENITextField(labelText = "Password")
            GradientButton(modifier = Modifier.padding(top = 10.dp), labelText = "Login")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun LoginComposePreview() {
    Android_TPTheme {
        LoginContentPage()
    }
}