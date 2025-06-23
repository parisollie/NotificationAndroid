package com.pjff.notificationproject

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.annotation.RequiresApi

//V-293,Paso 2.0 Notificaciones
class NotificationApplication: Application() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()
        /*Canal:Es una especie de contenedor de notificaciones
        Y se encarga de ejecutar las notificaciones: Tiene 3 cosas: id, name e importancia*/
        val notificationChannel = NotificationChannel(
            //En id le ponemos cualquier cosa
            "123",
            "notificaciones",
            NotificationManager.IMPORTANCE_HIGH
        )
        notificationChannel.description = "canal de notificaciones"
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }

}