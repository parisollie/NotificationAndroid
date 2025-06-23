package com.pjff.notificationproject.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pjff.notificationproject.navigation.ItemsMenuLateral.*
import kotlinx.coroutines.launch

// V-291, Paso 1.4
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuLateral(
    navController: NavController,
    drawerState: DrawerState,
    content: @Composable () -> Unit
) {
    // En una corrutina para que sea más ligero
    val scope = rememberCoroutineScope()
    val menuItems = listOf(
        item_1,
        item_2,
        item_3
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier
                    .width(280.dp) // 👈 Limita el ancho (ajustable)
                    .padding(top = 16.dp, bottom = 16.dp)
            ) {
                // Hacemos un forEach de todas las opciones que tenemos, en este caso 3.
                menuItems.forEach { item ->
                    NavigationDrawerItem(
                        icon = { Icon(item.icon, contentDescription = "") },
                        label = { Text(text = item.title) },
                        selected = false,
                        onClick = {
                            scope.launch { drawerState.close() }
                            // Para dirigirnos a la sig ruta
                            navController.navigate(item.ruta)
                        }
                    )
                }
            }
        }
    ) {
        content()
    }
}
