package com.example.felipeduarte.onmyway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    Button button;
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
}
