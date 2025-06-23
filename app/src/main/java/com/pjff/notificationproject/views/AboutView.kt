package com.pjff.notificationproject.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Título principal
        Text(
            text = "Acerca de la aplicación",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        // Nombre de la app
        Text(
            text = "NotiApp",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )

        // Versión
        Text(
            text = "Versión 1.0.0",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onBackground
        )

        // Descripción
        Text(
            text = "Esta aplicación está diseñada para demostrar el uso de notificaciones en Android usando Jetpack Compose. Aquí puedes probar diferentes tipos de notificaciones y cómo funcionan en segundo plano.",
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            lineHeight = 22.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Créditos
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Desarrollado por Paul F.",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}
