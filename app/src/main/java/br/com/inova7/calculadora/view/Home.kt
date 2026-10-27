package br.com.inova7.calculadora.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.inova7.calculadora.ui.theme.Blue
import br.com.inova7.calculadora.ui.theme.Purple40
import br.com.inova7.calculadora.ui.theme.White


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text="Calculadora de IMC")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Blue,
                    titleContentColor = White

                )

            )

        }
    ) {paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding()
                .background(color = White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Text(
                    text = "Altura em cm",
                    fontSize=18.sp,
                    fontWeight= FontWeight.Bold,
                    modifier = Modifier.padding(20.dp,100.dp,0.dp,0.dp)
                )

                Text(
                    text = "Peso em kg",
                    fontSize=18.sp,
                    fontWeight= FontWeight.Bold,
                    modifier = Modifier.padding(20.dp,100.dp,0.dp,0.dp)
                )



            }


        }

    }

}

@Preview
@Composable
private fun HomePreview(){
    Home()
}