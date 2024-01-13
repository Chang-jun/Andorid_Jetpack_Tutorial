package com.example.greetingcard

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //main
        super.onCreate(savedInstanceState)
        setContent { //for layout
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Compose_helper()
                    //Task_Complete()
                    //Compose_Quarter()
                    Business_Card()
                }
            }
        }
    }
}



@Composable
fun Compose_helper(modifier: Modifier = Modifier){
    Surface {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Column {
            Image(
                painter = image, 
                contentDescription = null,
                
            )
            Text(text = "Jetpack Compose tutorial",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
            Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose " +
                    "simplifies and accelerates UI development on Android with less code, powerful tools," +
                    " and intuitive Kotlin APIs.",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Justify,
            )
            Text(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies," +
                    " rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent." +
                    " To create a Composable function, you add the @Composable annotation to the function name.\n",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Justify,)
        }
    }
}


@Composable
fun Task_Complete(modifier: Modifier = Modifier){
    Surface {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = image,
                contentDescription = null
            )
            Text(
                text = "All tasks Complete!",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp))
            Text(text = "Nice work!",
                fontSize = 16.sp
            )
        }
    }    
}

@Composable
fun Compose_Quarter(modifier: Modifier = Modifier){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposeInfoCard(title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = androidx.compose.ui.Modifier.weight(2f)
            )
            ComposeInfoCard(
                title = "Image Compsable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposeInfoCard(title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = androidx.compose.ui.Modifier.weight(1f)
            )
            ComposeInfoCard(
                title = "Column composable\n",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = androidx.compose.ui.graphics.Color(0xFFF6EDFF),
                modifier = androidx.compose.ui.Modifier.weight(2f)
            )
        }
    }
}


@Composable
private fun ComposeInfoCard( title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Business_Card(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_task_completed)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Green)
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Yellow)
                    .padding(top = 48.dp)
                    .weight(2f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = image, contentDescription = null,
                    modifier = Modifier
                        .size(width = 60.dp, height = 80.dp),
                )
                Text(text = "LeeChangJun",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "Robot_Engineer(SLAM)"
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Blue)
                    .padding(12.dp)
                    .weight(1f),
                Arrangement.Center,
                Alignment.CenterHorizontally,

            ) {
                Column {
                    Row {
                        Image(
                            painter = image, contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )

                        Text(
                            text = "010-9252-2815",
                            modifier = Modifier
                                .background(color = Color.DarkGray),
                            fontSize = 24.sp,
                            textAlign = TextAlign.Justify
                        )
                    }
                    Row {
                        Image(painter = image, contentDescription = null,
                            modifier = Modifier.size(24.dp))

                        Text(text = "instagram",
                            modifier
                                .background(color = Color.Gray),
                            fontSize = 24.sp,
                            textAlign = TextAlign.Justify)
                    }
                    Row {
                        Image(painter = image, contentDescription = null,
                            modifier = Modifier.size(24.dp))
                        Text(text = "email@email.com",
                            modifier
                                .background(color = Color.LightGray),
                            fontSize = 24.sp)
                    }
                }
            }
        }
}
