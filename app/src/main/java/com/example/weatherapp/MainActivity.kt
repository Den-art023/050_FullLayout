package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "DENUNE MUHAMMAD KAISAR",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#435334"))
            )

        Spacer(modifier = Modifier.padding(13.dp))

        BoxScreen()

        Spacer(modifier = Modifier.padding(13.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(13.dp))

        BoxKeterangan()
    }

}

@Composable
fun BoxScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color(android.graphics.Color.parseColor("#CEDEBD")))
    ) {
        val image = painterResource(R.drawable.img)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()
        ) {
            Image(painter = image, contentDescription = "", modifier = Modifier.size(220.dp))
            Text(
                text = "Rain",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(13.dp),
                color = Color(android.graphics.Color.parseColor("#435334"))
                )
        }
    }
}

@Composable
fun Lokasi() {
    Text(
        text = "19°C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold,
        color = Color(android.graphics.Color.parseColor("#435334"))
    )
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(35.dp)
        )

        Spacer(modifier = Modifier.padding(3.dp))

        Text(
            text = "Yogyakarta",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#435334"))
        )
    }

    Spacer(modifier = Modifier.padding(13.dp))

    Text(
        text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        color = Color(android.graphics.Color.parseColor("#9EB384"))
    )
}

@Composable
fun BoxKeterangan() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp))
            .background(Color(android.graphics.Color.parseColor("#435334")))
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(30.dp)

            ) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Humidity",
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                )
                Spacer(modifier = Modifier.width(120.dp))
                Text(
                    text = "UV Index",
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                )
            }
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(30.dp))
                Text(
                    text = "98%",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                )
                Spacer(modifier = Modifier.width(147.dp))
                Text(
                    text = "9 / 10",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                )
            }

            Spacer(modifier = Modifier.padding(18.dp))

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Sunrise",
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                    )
                Spacer(modifier = Modifier.width(136.dp))
                Text(
                    text = "Sunset",
                    fontSize = 18.sp,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                    )
            }
            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start,

                ) {
                Spacer(modifier = Modifier.width(0.dp))
                Text(
                    text = "05.00 AM",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                    )
                Spacer(modifier = Modifier.width(105.dp))
                Text(
                    text = "05.40 PM",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#CEDEBD"))
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {
        HomeScreen()
    }
}