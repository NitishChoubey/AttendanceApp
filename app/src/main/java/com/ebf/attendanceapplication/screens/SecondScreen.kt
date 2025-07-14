package com.ebf.attendanceapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable

fun SecondScreen(modifier: Modifier){
    Column(modifier = Modifier.fillMaxSize() , horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center ) {
        TextButton(onClick = {} ,  colors = ButtonDefaults.textButtonColors(containerColor = Color.Yellow ,
            contentColor = Color.Red ,
            disabledContainerColor = Color.Gray ,
            disabledContentColor = Color.Magenta ,

            ) , modifier = Modifier.fillMaxWidth(fraction = 0.5f) ,

            ) {
            Text("Admin")

        }

        TextButton(onClick = {} ,  colors = ButtonDefaults.textButtonColors(containerColor = Color.Yellow ,
            contentColor = Color.Red ,
            disabledContainerColor = Color.Gray ,
            disabledContentColor = Color.Magenta ,

            ) , modifier = Modifier.fillMaxWidth(fraction = 0.5f) ,

            ) {
            Text("Professor")

        }
        TextButton(onClick = {} ,  colors = ButtonDefaults.textButtonColors(containerColor = Color.Yellow ,
            contentColor = Color.Red ,
            disabledContainerColor = Color.Gray ,
            disabledContentColor = Color.Magenta ,

            ) , modifier = Modifier.fillMaxWidth(fraction = 0.5f) ,

            ) {
            Text("Student")

        }

        Spacer(modifier = Modifier.height(16.dp))






    }
    Box(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.align(Alignment.BottomCenter).padding(40.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Don't have an account?")
            Text(text = " Signup" ,
                color = Color.Blue ,
                fontWeight = FontWeight.Bold ,
                modifier = Modifier.clickable {  })

        }

    }
}