package com.pjff.notificationproject

import android.app.NotificationManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationCompat
import kotlin.random.Random

class NotificationService(private val context: Context) {

    //Vid 294
    private val notificationManager = context.getSystemService(NotificationManager::class.java)

    fun showBasicNotification(){
        val notification = NotificationCompat.Builder(context,"123")
            //Cuerpo de la notificacion
            .setContentTitle("Titulo")
            .setContentText("Notificacion básica jeje ")
            .setSmallIcon(R.drawable.noti)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setAutoCancel(true)
            .build()
        notificationManager.notify(
            Random.nextInt(),
            notification
        )
    }

    fun showLargeNotification(){
        val notification = NotificationCompat.Builder(context,"123")
            .setContentTitle("Titulo")
            .setContentText("Lorem ipsum dolor sit amet.")
            .setSmallIcon(R.drawable.noti)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setStyle(
                NotificationCompat
                    .BigTextStyle()
                    .bigText("Lorem ipsum dolor sit amet consectetur adipiscing elit fringilla luctus ullamcorper senectus, vulputate magnis potenti habitant porttitor aptent diam tincidunt sollicitudin mollis. Sociis commodo varius erat himenaeos cursus sagittis nostra odio, felis nec hac aptent pharetra dis a tristique, ut pulvinar nam penatibus ornare rutrum hendrerit. Litora platea nisl diam ultricies aliquet morbi scelerisque a hendrerit, dui ridiculus conubia condimentum fames leo posuere quis aptent lacus, non suscipit ut laoreet interdum vivamus proin luctus.")
            )
            .setAutoCancel(true)
            .build()
        notificationManager.notify(
            Random.nextInt(),
            notification
        )
    }

    fun showInboxNotification(){
        val notification = NotificationCompat.Builder(context,"123")
            .setContentTitle("Titulo")
            .setContentText("Lorem ipsum dolor sit amet.")
            .setSmallIcon(R.drawable.noti)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setStyle(
                NotificationCompat
                    .InboxStyle()
                    .addLine("Linea 1")
                    .addLine("Linea 2")
                    .addLine("Linea 3")
                    .addLine("Linea 4")
                    .addLine("Linea 5")
            )
            .setAutoCancel(true)
            .build()
        notificationManager.notify(
            Random.nextInt(),
            notification
        )
    }

    //Vid 295
    fun showImageNotification(){
        val image = context.bitmapFromResource(R.drawable.emoji)
        val notification = NotificationCompat.Builder(context,"123")
            .setContentTitle("Titulo")
            .setContentText("Lorem ipsum dolor sit amet.")
            .setSmallIcon(R.drawable.noti)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setLargeIcon(image)
            .setStyle(
                NotificationCompat
                    .BigPictureStyle()
                    .bigPicture(image)
                    .bigLargeIcon(null as Bitmap?)
            )
            .setAutoCancel(true)
            .build()
        notificationManager.notify(
            Random.nextInt(),
            notification
        )
    }

    //Vuid 295, para la notificacion con la imagén
    private fun Context.bitmapFromResource(
        @DrawableRes resId: Int
    ) = BitmapFactory.decodeResource(
        resources,
        resId
    )

}