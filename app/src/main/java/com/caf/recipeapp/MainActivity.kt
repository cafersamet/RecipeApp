package com.caf.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF2F2F2))
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.happy_meal_small),
            "",
            modifier = Modifier.height(300.dp),
            contentScale = ContentScale.Crop
        );
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Happy Meal",
                    style = TextStyle(
                        fontSize = 26.sp
                    )
                );
                Text(
                    text = "$5.99",
                    style = TextStyle(
                        color = Color(0xFF85bb65),
                        fontSize = 17.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterVertically)
                );
            }
            Spacer(modifier = Modifier.padding(top = 10.dp));
            Text(
                text = "800 Calories",
                style = TextStyle(
                    fontSize = 17.sp
                )
            );
            Spacer(modifier = Modifier.padding(top = 10.dp));
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "ORDER NOW")
            }
        }
    }
}

@Composable
fun rowLayout() {
    Column() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text("ITEM1", modifier = Modifier.align(Alignment.CenterHorizontally))
            Text("ITEM2", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .border(BorderStroke(width = 1.dp, color = Color.Magenta)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("ITEM1", modifier = Modifier.align(Alignment.CenterVertically))
            Text("ITEM2", modifier = Modifier.align(Alignment.CenterVertically))
        }
    }
}

@Preview
@Composable
fun Test() {
    MainScreen()
}