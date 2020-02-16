package com.varsha.hackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {

            }
        }
    }
}

@Composable
fun NewsStory(name: String) {
    Row() {
      Text(text="I am Row 1")
        Text(text="I am Row 1I")
        Text(text="I am Row 1II")
        Text(text="I am Row 1V")
    }


}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        NewsStory("varsha")
    }
}