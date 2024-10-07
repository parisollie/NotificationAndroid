package com.pjff.notificationproject

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi

class NotificationApplication: Application() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()
        //Vid 293,Canal de ejecutar las notificaciones
        val notificationChannel = NotificationChannel(
            "123",
            "notificaciones",
            NotificationManager.IMPORTANCE_HIGH
        )
        notificationChannel.description = "canal de notificaciones"
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }

}