package com.iessanalberto.dam2.javiet.miprimeraappcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iessanalberto.dam2.javiet.miprimeraappcomposable.ui.theme.MiPrimeraAppComposableTheme
import com.iessanalberto.dam2.javiet.miprimeraappcomposable.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPrimeraAppComposableTheme {
                // A surface container using the 'background' color from the theme
                    MainScreen()
            }
        }
    }
}
@Composable
fun MainScreen(){
    var text by remember{ mutableStateOf("Usuario")}
    Surface(modifier = Modifier
        .padding(20.dp)
        .fillMaxSize(1f)
        .shadow(15.dp, shape = RoundedCornerShape(10.dp)), color = Color.LightGray){
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = R.drawable.fp2v2), contentDescription = "Logo", contentScale = ContentScale.Crop,
            modifier=Modifier.size(250.dp).clip(RoundedCornerShape(20.dp)))
        Text(
            text = stringResource(id = R.string.bienvenida),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(20.dp)
        )

            TextField(
                value = text, onValueChange = { text = it }
            )
        
        }
    }

}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        modifier = Modifier.width(150.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MiPrimeraAppComposableTheme {
        Greeting("Android")
    }
}