package com.example.felipeduarte.onmyway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    Button button;
    private long taskDelay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        //button.setOnClickListener(this);

    }
    //@Override
    /*public void onClick(View view){
        if(view.equals(button)){

        }
    }*/
    public void goToCadastro(View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
    public void goToMapas(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void goToViagem(View view) {
        Intent intent = new Intent(this, ViagemActivity.class);
        startActivity(intent);
    }

    public void goToLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
