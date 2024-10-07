package com.pjff.notificationproject.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

//Vid 290
sealed class ItemsMenuLateral (
    val icon: ImageVector,
    val title: String,
    var ruta: String

){
    //Ebn version igual se pone data object
    object item_1 : ItemsMenuLateral(
        Icons.Default.Home,
        "Home",
        "Home"
    )
     object item_2 : ItemsMenuLateral(
        Icons.Default.CheckCircle,
        "About",
        "About"
    )
     object item_3 : ItemsMenuLateral(
        Icons.Default.AccountBox,
        "Account",
        "Account"
    )
}