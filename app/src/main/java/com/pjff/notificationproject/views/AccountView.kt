package com.pjff.notificationproject.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pjff.notificationproject.R

@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Imagen de perfil desde drawable (reemplaza con tu recurso real)
        Image(
            painter = painterResource(id = R.drawable.profile_placeholder), // tu imagen
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        // Nombre del usuario
        Text(
            text = "Genesis Bransby",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        // Correo del usuario
        Text(
            text = "genesis@email.com",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        // Botón para editar perfil
        Button(onClick = { /* TODO: Acción de editar */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Editar perfil")
        }

        // Botón para cambiar contraseña
        Button(onClick = { /* TODO: Acción de cambiar contraseña */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Cambiar contraseña")
        }

        // Botón para cerrar sesión
        Button(
            onClick = { /* TODO: Acción de logout */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cerrar sesión")
        }
    }
}
