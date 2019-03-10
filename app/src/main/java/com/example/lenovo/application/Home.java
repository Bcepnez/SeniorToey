package com.example.lenovo.application;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button btMedia;
    private Button btController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        btController = (Button) findViewById(R.id.Controller);
        btController.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openController();
            }
        });
        btMedia = (Button) findViewById(R.id.Media);
        btMedia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMedia();
            }
        });
    }

    public void openMedia(){
        Intent intent = new Intent(this, Media.class);
        startActivity(intent);
    }

    public void openController(){
        Intent intent = new Intent(this, Controller_Mode.class);
        startActivity(intent);
    }
}
