package com.example.android_tp.compose

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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Icon
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

class ResetPasswordComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_TPTheme {
                ResetPasswordContentPage()
            }
        }
    }
}

@Composable
fun ResetPasswordContentPage() {

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
            AuthIcon(imageVector = Icons.Default.LockOpen)
            Text(
                text = "Reset Password",
                fontSize = 40.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            Spacer(modifier = Modifier.padding(vertical = 60.dp))
            ENITextField(labelText = "Email")
            GradientButton(modifier = Modifier.padding(top = 10.dp), labelText = "Send Link")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ResetPasswordComposePreview() {
    Android_TPTheme {
        ResetPasswordContentPage()
    }
}