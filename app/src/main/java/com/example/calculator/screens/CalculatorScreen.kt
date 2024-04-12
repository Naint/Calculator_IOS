package com.example.calculator.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation.weight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CalculatorScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                CalculatorButton(text = "AC", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp, start = 5.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff7d7a7a),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "/", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff7d7a7a),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "%", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff7d7a7a),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "%", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffFFA500),
                    contentColor = Color.White
                ) )
            }
            Row(
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                CalculatorButton(text = "7", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp, start = 5.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "8", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "9", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "x", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffFFA500),
                    contentColor = Color.White
                ) )
            }
            Row(
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                CalculatorButton(text = "4", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp, start = 5.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "5", modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "6", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "-", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffFFA500),
                    contentColor = Color.White
                ) )
            }
            Row(
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                CalculatorButton(text = "1", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp, start = 5.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "2", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "3", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "+", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffFFA500),
                    contentColor = Color.White
                ) )
            }

            Row(
                modifier = Modifier.padding(bottom = 10.dp)
            ){
                CalculatorButton(text = "0", modifier = Modifier
                    .weight(2f)
                    .padding(end = 10.dp, start = 5.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = ",", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff333131),
                    contentColor = Color.White
                ) )
                CalculatorButton(text = "=", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFFA500),
                        contentColor = Color.White
                    )

                )
            }
        }
    }
}




@Composable
fun CalculatorButton(text: String,
                     modifier: Modifier,
                    colors: ButtonColors
                     ){
        Button(onClick = { /*TODO*/ },
            modifier = modifier.size(92.dp),
            colors = colors
            ) {
            Text(text = text, fontSize = 26.sp, fontFamily = FontFamily.SansSerif)
        }
}
