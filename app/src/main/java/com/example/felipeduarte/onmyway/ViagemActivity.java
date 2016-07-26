package com.example.felipeduarte.onmyway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ViagemActivity extends AppCompatActivity {
    private static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private static ScheduledFuture<?> t;

    TextView scheduleText;
    Button stopButton;
    boolean requestedToStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
        requestedToStop = false;
    }

    public void startSchedule(View view) {
        scheduler.scheduleAtFixedRate(new Runnable() {
            int i = 0;
            public void run() {
                if(requestedToStop) {
                    requestedToStop = false;
                    t.cancel(false);
                }
                //Send the user location to server
                System.out.println(i++);
            }
        },0,2, TimeUnit.SECONDS); //repeats every 2 seconds
    }

    public void stopSchedule(View view) {
        requestedToStop = true;
    }
}
