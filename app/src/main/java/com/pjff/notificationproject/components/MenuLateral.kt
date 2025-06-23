package com.pjff.notificationproject.components

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.pjff.notificationproject.navigation.ItemsMenuLateral.*
import kotlinx.coroutines.launch

//V-291,Paso 1.4
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuLateral(
    navController: NavController,
    drawerState: DrawerState,
    content: @Composable () -> Unit
) {
    //En una corrutina para que sea mas ligero
    val scope = rememberCoroutineScope()
    val menuItems = listOf(
        item_1,
        item_2,
        item_3
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                //Hacemos un Foreach de todas las opciones que tenemos, en este caso 3.
                menuItems.forEach { item ->
                    NavigationDrawerItem(
                        icon = { Icon(item.icon, contentDescription = "") },
                        label = { Text(text = item.title)},
                        selected = false,
                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                            //Para dirigirnos a la sig ruta
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
















