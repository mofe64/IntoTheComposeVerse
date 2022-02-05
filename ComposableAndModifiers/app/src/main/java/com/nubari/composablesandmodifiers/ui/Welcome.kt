package com.nubari.composablesandmodifiers.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nubari.composablesandmodifiers.R
import com.nubari.composablesandmodifiers.ui.theme.highlightColor

@Composable
fun Welcome() {
    Column(
        modifier = Modifier
            .padding(top = 40.dp, start = 20.dp, end = 20.dp, bottom = 10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.bubble_gum_body_with_phone),
            contentDescription = "Welcome Illustration"
        )
        Spacer(modifier = Modifier.height(30.dp))
        val textSize = 30.sp
        Text(
            text = "Growing your",
            fontSize = textSize,
        )
        Row {
            Text(
                text = "business is ",
                fontSize = textSize,
            )
            Text(
                text = "easier",
                fontSize = textSize,
                color = Color.Blue
            )
        }
        Text(
            text = "than you think!",
            fontSize = textSize
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Sign up takes only 2 minutes")
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(20)
        ) {
            Text(text = "Get Started")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20)

        ) {
            Text(text = "Sign in")
        }
    }
}

@Preview(showBackground = true,)
@Composable
fun WelcomePreview() {
    Welcome()
}