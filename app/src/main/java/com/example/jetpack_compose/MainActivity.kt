package com.example.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose.ui.theme.Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            MyText(text = "App probando JetpackCompose")
            MyText(text = "pindonga")
        }
    }

    @Composable
    fun MyTexts(){

        Column(modifier = Modifier.padding(4.dp)){
            MyText(text = "Hola mundo usando Jetpack")
            MyText(text = "bla bla bla")
        }
    }

    @Composable
    fun MyImage(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Imagen de prueba",
            modifier = Modifier.clip(CircleShape).background(Color.Gray).size(64.dp)
        )
    }

    @Composable
    fun MyText(text: String){
        Text(text = text)
    }

    @Preview
    @Composable
    fun PreviewComponent(){
        MyTexts()
        MyImage()
    }
}

