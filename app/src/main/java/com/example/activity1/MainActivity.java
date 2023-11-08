package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtview1;
    Button btn1;
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the text on the textview
        txtview1=findViewById(R.id.txtactivity1);
        txtview1.setText("Hello, this is first activity");

        Toast.makeText(this, "Calling the OnCreate function", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate function: ");

        //add onClick listener on the button
        btn1=findViewById(R.id.btnActivity1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        Toast.makeText(this, "Calling the OnStartfunction", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart function ");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Toast.makeText(this, "Calling the onResume function", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume Function");
        super.onResume();
    }
    @Override
    protected void onPause(){
        Toast.makeText(this, "Calling the onPause function", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause Function");
        super.onPause();
    }
    @Override
    protected void onStop(){
        Toast.makeText(this, "Calling the onStop function", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnStop Function");
        super.onStop();
    }
    @Override
    protected void onRestart(){
        Toast.makeText(this, "Calling the onRestart function", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart Function");
        super.onRestart();
    }
    @Override
    protected void onDestroy(){
        Toast.makeText(this, "Calling the onDestroy function", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy Function");
        super.onDestroy();
    }
}