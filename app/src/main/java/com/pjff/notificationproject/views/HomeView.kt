package com.pjff.notificationproject.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pjff.notificationproject.NotificationService
import com.pjff.notificationproject.NotificationWorker
import com.pjff.notificationproject.components.MenuLateral
import com.pjff.notificationproject.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
// Paso 1.9, le ponemos el NavController
fun HomeView(navController: NavController) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    // Lamamos al menuLateral
    MenuLateral(navController, drawerState) {
        ContentHomeView(drawerState)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
// Paso 1.6
fun ContentHomeView(drawerState: DrawerState) {
    Scaffold(
        topBar = {
            TopBar(drawerState = drawerState, title = "Principal")
        }
    ) { pad ->
        NotificationsView(pad)
    }
}

// Paso 1.7 , para las notificaciones
@Composable
fun NotificationsView(paddingValues: PaddingValues) {
    // V-297, paso 3.1
    val context = LocalContext.current
    val notificationService = NotificationService(context)

   /* Box(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {*/
        Column(
            // Paso 1.8
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 84.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // ✅ Descripción introductoria
            Text(
                text = "Aquí están los botones para mostrar las notificaciones de distintos tipos, incluyendo imagen, inbox y más.",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            // Paso 3.2
            Text(
                text = "Notificaciones",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Button(
                onClick = { notificationService.showBasicNotification() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Notificación Básica")
            }

            Button(
                onClick = { notificationService.showLargeNotification() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Notificación Grande")
            }

            Button(
                onClick = { notificationService.showInboxNotification() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Notificación Inbox")
            }

            Button(
                onClick = { notificationService.showImageNotification() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Notificación con Imagen")
            }

            // Paso 3.4
            Button(
                onClick = { NotificationWorker.releaseNotification(context) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Notificación en Background")
            }
        }
    //}
}
