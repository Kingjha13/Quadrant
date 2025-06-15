package com.example.cquadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cquadrant.ui.theme.CQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "I am Avanish Jha very happy \uD83D\uDE03\uD83D\uDE0D that you visited my application",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Top) {
    Box {
        Text(
            text = "\tYOU ALL ARE HEARTILY \u2764 WELCOME.\n\t$name!",
            fontSize = 18.sp,
            color = Color.Yellow,
            modifier = Modifier
                //.padding(4.dp, 10.dp, 10.dp, 20.dp)
                .padding(start = 5.dp, top = 35.dp, end = 0.1.dp)
                //.padding(1.dp)
                .background(color = Color.Black)
                .fillMaxWidth() //ye use karte h puri screen occupie ke liye if ham hello likhte h to
            //jitne area me hello ayega uthna hi occupies karega agar ye us karte h to puri occupies karega
        )
    }
    }
    Row (horizontalArrangement = Arrangement.Start){
        Text(
            text = "\n\n\n\n\n\n\t\tText composable\n" +
                    "Displays text and follows the recommended Material Design guidelines.\n",
            fontSize = 12.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(start = 5.dp, top = 105.dp, bottom = 427.dp, end = 0.dp)
                .weight(1f)
                .background(color = Color.Yellow)
              //  .background(Color(0xFFEADDFF))
                .size(width = 100.dp, height = 590.dp)
        )
        Text(

            text = "\n\n\n\n\n\n\t\tImage composable\n" +
                    "Creates a composable that lays out and draws a given Painter class object.\n",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(start = 0.000000000000001.dp, top = 105.dp, end =0.1.dp, bottom = 427.dp)
                .weight(1f)
                .background(Color(0xFFD0BCFF))
                  //  Text("Example", color = Color(0xFFD0BCFF)) remaning exprement  for this
                .size(width = 100.dp, height = 590.dp)
        )



    }
Column(verticalArrangement = Arrangement.Bottom) {
    Row (horizontalArrangement = Arrangement.End){
        Text(text = "\n\n\n\n\n\n\n\t\tRow composable\n" +
                "A layout composable that places its children in a horizontal sequence.",
            fontSize = 12.sp,
            modifier= Modifier
                .padding(start = 5.dp, bottom = 10.dp, end = 0.000000000000001.dp, top = 427.dp)
                .weight(1f)
                .background((Color(0xFFB69DF8)))
                .size(width = 100.dp, height = 590.dp)

        )
        Text(text = "\n\n\n\n\n\n\n\t\t Column composable\n" +
                "A layout composable that places its children in a vertical sequence.",
            fontSize = 12.sp,
            color = Color.Red,
            modifier = Modifier
                .padding(start = 0.00000000000000001.dp, bottom = 5.dp, end = 1.dp, top = 427.dp)
                .weight(1f)
                .background(color = Color.Yellow)
                //  .background(Color(0xFFF6EDFF))
                .size(width = 100.dp, height = 590.dp)
        )

    }

}
}

@Preview(showBackground= true)
@Composable
fun GreetingPreview() {
    CQuadrantTheme {
        Greeting("I am Avanish Jha very happy \uD83D\uDE03 \uD83D\uDE0D that you visited my application")
    }
}