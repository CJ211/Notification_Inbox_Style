package com.example.jay.notification_inbox_style;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                                .setSmallIcon(R.drawable.noti)
                                .setContentTitle("Notifications Example")
                                .setContentText("This is a test notification");

                Notification.InboxStyle style=new Notification.InboxStyle();
                style.addLine("This");
                style.addLine("has been");
                style.addLine("finally done");


/*                Intent notificationIntent = new Intent(this, MainActivity.class);
                PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);*/

                // Add as notification
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0, builder.build());
            }
        });
    }
}
