package com.nubari.composablesandmodifiers.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nubari.composablesandmodifiers.R

@Composable
fun Login() {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(top = 40.dp, start = 20.dp, end = 20.dp, bottom = 10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.bubble_gum_body_with_phone),
            contentDescription = "Login Illustration"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Welcome back!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "You've been missed",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.icons8_google),
                    contentDescription = "Google Login"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Sign In With Google",
                    fontSize = 20.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Divider(
                modifier = Modifier
                    .height(1.dp)
                    .width(150.dp), color = Color.Gray
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "or", color = Color.LightGray)
            Spacer(modifier = Modifier.width(15.dp))
            Divider(
                modifier = Modifier
                    .height(1.dp)
                    .width(150.dp), color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = username.value,
            onValueChange = { newValue -> username.value = newValue },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(text = "Username")
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password.value,
            onValueChange = { newValue -> password.value = newValue },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(text = "Password")
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                    contentDescription = "Toggle Passowrd"
                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(20)
        ) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Don't have an account? ", fontSize = 16.sp)
            Text(text = "Sign up here", color = Color.Blue, fontSize = 16.sp)
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLogin() {
    Login()
}