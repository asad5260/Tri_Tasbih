package com.example.tritasbih;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tritasbih.databinding.ActivityMainBinding;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MaterialTimePicker picker;
    private Calendar calendar;
    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    public Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        createNotificationChannel();
        binding.selectedTime.setOnClickListener(view -> showTimePicker());
        binding.setAlarmBtn.setOnClickListener(view -> setAlarm());
        binding.cancelAlarmBtn .setOnClickListener(view -> cancelAlarm());
        bt= findViewById(R.id.buttonj);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OpenActivaty2();
            }

            private void OpenActivaty2() {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);

            }
        });

    }

    @SuppressLint("UnspecifiedImmutableFlag")
    private void cancelAlarm() {
        Intent intent = new Intent(this,AlarmReceiver.class);
        pendingIntent =PendingIntent.getBroadcast(this,0,intent,0);

        if(alarmManager == null){
            alarmManager =(AlarmManager) getSystemService(Context.ALARM_SERVICE);
        }
        alarmManager.cancel(pendingIntent);
        Toast.makeText(this,"Alarm Cancelled",Toast.LENGTH_SHORT).show();

    }

    @SuppressLint("UnspecifiedImmutableFlag")
    private void setAlarm() {
        alarmManager =(AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this,AlarmReceiver.class);
        pendingIntent =PendingIntent.getBroadcast(this,0,intent,0);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),
                      AlarmManager.INTERVAL_DAY,pendingIntent);
        Toast.makeText(this,"Alarm set Successfully",Toast.LENGTH_SHORT).show();

    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void showTimePicker() {
       picker = new MaterialTimePicker.Builder()
               .setTimeFormat(TimeFormat.CLOCK_12H)
               .setHour(12)
               .setMinute(0)
               .setTitleText("Select Alarm Time")
               .build();
       picker.show(getSupportFragmentManager(),"JIKIR");
       picker.addOnPositiveButtonClickListener(view -> {
           if(picker.getHour() > 12){
               binding.selectedTime.setText(
                       String.format("%2d",(picker.getHour()-12)+":"+String.format("%2d",picker.getMinute())+" PM")
               );

           }
           else {
               binding.selectedTime.setText(picker.getHour()+" : "+picker.getMinute() + " AM");
           }
           calendar = Calendar.getInstance();
           calendar.set(Calendar.HOUR_OF_DAY,picker.getHour());
           calendar.set(Calendar.MINUTE,picker.getMinute());
           calendar.set(Calendar.SECOND,0);
           calendar.set(Calendar.MILLISECOND,0);
       });
    }

    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "JIKIR RIMINDER";
            String description = "Channel For Alarm manager";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("JIKIR",name,importance);
            channel.setDescription(description);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }


}