package com.anelcc.cleanarchitecturehandleerrors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.anelcc.cleanarchitecturehandleerrors.presentation.BaseViewModel
import com.anelcc.cleanarchitecturehandleerrors.ui.theme.CleanArchitectureHandleErrorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate( savedInstanceState)
        setContent {
            CleanArchitectureHandleErrorsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EmailScreen("Android")
                }
            }
        }
    }
}

@Composable
fun EmailScreen(name: String) {
    val viewModel = viewModel<BaseViewModel>()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        BasicTextField(
            value = viewModel.email,
            onValueChange = viewModel::onEmailChange,
            modifier = Modifier.fillMaxWidth().background(Color.Yellow))


        Spacer(modifier = Modifier.height(8.dp))
        Button(
             onClick = viewModel::submitEmail,
             modifier = Modifier.align(Alignment.End)
         ) {
             Text(text = "Submit")
         }

        Spacer(modifier = Modifier.height(8.dp))
        if (viewModel.error != null) {
            Text(text = viewModel.error?.asString() ?: "Un know Error")
        } else {
            Text("...")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CleanArchitectureHandleErrorsTheme {
        Greeting("Android")
    }
}