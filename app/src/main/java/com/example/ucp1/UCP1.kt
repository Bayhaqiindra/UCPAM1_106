package com.example.ucp1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Headeratas(modifier: Modifier = Modifier) {
    var kotaasal by remember { mutableStateOf("") }
    var kotatujuan by remember { mutableStateOf("") }
    var klass by remember { mutableStateOf("") }
    var tanggalkepergian by remember { mutableStateOf("") }
    var tanggalkedatangan by remember { mutableStateOf("") }

    var dataklass = listOf("Ekonomi", "Busines")

    var confkotaasal by remember { mutableStateOf("") }
    var confkotatujuan by remember { mutableStateOf("") }
    var confklass by remember { mutableStateOf("") }
    var conftanggalkepergian by remember { mutableStateOf("") }
    var conftanggalkedatangan by remember { mutableStateOf("") }
    Column() {
        Text(
            text = "Good Afternoon,",
            style = TextStyle(fontSize = 16.sp, color = Color.Gray),
        )
        Text(
            text = "Bayhaqi Indra Maulana",
            style = TextStyle(fontSize = 17.sp, fontWeight = FontWeight.Bold),
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)

        ) {
            Icon(
                Icons.Filled.Notifications,
                contentDescription = null,
                modifier = Modifier
                    .size(22.dp)
                    .background(Color.White)
            )
        }
        Column(
            modifier = modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = kotaasal,
                onValueChange = { kotaasal = it },
                label = { Text(text = "Kota Asal") },
                placeholder = { Text(text = "Masukkan Kota Asal Anda") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = kotatujuan,
                onValueChange = { kotatujuan = it },
                label = { Text(text = "Kota Tujuan") },
                placeholder = { Text(text = "Masukkan Kota Tujuan Anda") },
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextField(
                    value = tanggalkepergian,
                    onValueChange = { tanggalkepergian = it },
                    label = { Text(text = "Pergi") },
                    placeholder = { Text(text = "Masukkan Tanggal Kepergian Anda") },
                    modifier = Modifier.weight(0.8f)
                )
                TextField(
                    value = tanggalkedatangan,
                    onValueChange = { tanggalkedatangan = it },
                    label = { Text(text = "Pulang") },
                    placeholder = { Text(text = "Masukkan Kedatangan Anda") },
                    modifier = Modifier.weight(0.8f)
                )


            }
            Text(
                text = "Class",
                style = TextStyle(fontSize = 16.sp)
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                dataklass.forEach { selectedGender ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = klass == selectedGender,
                            onClick = { klass = selectedGender }
                        )
                    }
                    Text(text = selectedGender)
                }
            }
            Button(onClick = {
                confkotaasal = kotaasal
                confkotatujuan = kotatujuan
                conftanggalkepergian = tanggalkepergian
                conftanggalkedatangan = tanggalkedatangan
                confklass = klass
            }) {
                Text(text = "Simpan")
            }
            Text(
                text = "Detail Data",
                style = TextStyle(fontSize = 16.sp)
            )
        }
    }
}