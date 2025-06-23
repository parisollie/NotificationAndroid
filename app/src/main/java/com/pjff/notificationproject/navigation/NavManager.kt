package com.pjff.notificationproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pjff.notificationproject.views.AboutView
import com.pjff.notificationproject.views.AccountView
import com.pjff.notificationproject.views.HomeView

@Composable
fun NavManager() {
    //V-290, paso 1.1
    val navController = rememberNavController()

    NavHost(navController, startDestination = "Home" ){
        composable("Home"){
            //paso 1.8, le ponemos el navController
            HomeView(navController)
        }
        composable("About"){
            AboutView()
        }
        composable("Account"){
            AccountView()
        }
    }

}