package com.example.eric.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Toast;

// COMMIT THIS!!!!!  New Update 2

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Let's take a look at Toast and Log in action
        Toast.makeText(this, "Can you see me", Toast.LENGTH_SHORT).show();

        Log.i("info", "Done creating the app");
    }

    public void topClick(View v){
        Toast.makeText(this, "Top button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button");
    }
    public void bottomClick(View v){
        Toast.makeText(this, "Bottom button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the bottom button");
    }

}
