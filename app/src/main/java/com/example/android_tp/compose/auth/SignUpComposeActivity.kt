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
import androidx.compose.material.icons.filled.AppRegistration
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

class SignUpComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_TPTheme {
                SignUpContentPage()
            }
        }
    }
}

@Composable
fun SignUpContentPage() {

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = with(Modifier) {
                fillMaxSize().paint(
                    painterResource(id = R.drawable.background),
                    contentScale = ContentScale.FillBounds
                )
            })
        Column(
            modifier = Modifier
                .padding(innerPadding.calculateTopPadding() + 40.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AuthIcon(imageVector = Icons.Default.AppRegistration)
            Text(
                text = "Sign Up",
                fontSize = 40.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            Spacer(modifier = Modifier.padding(vertical = 20.dp))
            ENITextField(
                labelText = "Pseudo")
            ENITextField(
                labelText = "Email")
            ENITextField(
                labelText = "Password")
            ENITextField(
                labelText = "Password confirmation")
            ENITextField(
                labelText = "City")
            ENITextField(
                labelText = "City Code")
            ENITextField(
                labelText = "Phone")
            GradientButton(modifier = Modifier.padding(top = 10.dp), labelText = "Sign Up")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpComposePreview() {
    Android_TPTheme {
        SignUpContentPage()
    }
}