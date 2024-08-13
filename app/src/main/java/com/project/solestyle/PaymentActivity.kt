package com.project.solestyle

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.solestyle.components.HeadingTextComponent
import com.project.solestyle.ui.theme.Primary

class PaymentActivity : ComponentActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val context = LocalContext.current
            val gradient45 = Brush.linearGradient(
                colors = listOf(Color.White, Color.White),
                start = Offset(0f, Float.POSITIVE_INFINITY),
                end = Offset(Float.POSITIVE_INFINITY, 0f)
            )

            Surface(
                modifier = Modifier
                    .background(gradient45)
                    .fillMaxSize()
                    .padding(28.dp)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(gradient45),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.size(300.dp),
                        painter = painterResource(id = R.drawable.pay),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    HeadingTextComponent(value = "Payment")
                    Spacer(modifier = Modifier.height(10.dp))

                    // Payment Details Fields
                    OutlinedTextField(
                        value = "", // You should manage this state
                        onValueChange = { /* Handle value change */ },
                        label = { Text("Card Number") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = "", // You should manage this state
                        onValueChange = { /* Handle value change */ },
                        label = { Text("Expiration Date (MM/YY)") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = "", // You should manage this state
                        onValueChange = { /* Handle value change */ },
                        label = { Text("CVV") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Button(
                        modifier = Modifier
                            .wrapContentWidth()
                            .heightIn(48.dp),
                        onClick = {
                            context.startActivity(Intent(context, Success::class.java))
                        },
                        contentPadding = PaddingValues(),
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        shape = RoundedCornerShape(50.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(48.dp)
                                .background(
                                    brush = Brush.horizontalGradient(listOf(Primary, Primary)),
                                    shape = RoundedCornerShape(20.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Proceed",
                                fontSize = 18.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfPaymentActivity() {
    PaymentActivity()
}
