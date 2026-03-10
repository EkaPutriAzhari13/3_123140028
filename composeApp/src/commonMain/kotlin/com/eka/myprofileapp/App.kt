package com.eka.myprofileapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource

import myprofileapp.composeapp.generated.resources.Res
import myprofileapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ProfileHeader()

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Mahasiswa Teknik Informatika ITERA yang memiliki minat pada pengembangan aplikasi mobile dan teknologi digital.",
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            ProfileCard()

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {}) {
                Text("Edit Profile")
            }
        }
    }
}

@Composable
fun ProfileHeader() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(Res.drawable.compose_multiplatform),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Eka Putri Azhari Ritonga",
            style = MaterialTheme.typography.headlineSmall
        )
    }
}

@Composable
fun ProfileCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            InfoItem("Email", "ekaputriazhari3@email.com")
            InfoItem("Phone", "085187081046")
            InfoItem("Location", "Lampung Selatan")

        }

    }
}

@Composable
fun InfoItem(title: String, value: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(text = title)

        Text(text = value)

    }
}