package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1;
    Button btn1;
    private static final String TAG="MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //set the text on the Text View
        txt1=findViewById(R.id.txtviewactivity2);
        txt1.setText("Hello, This is second activity");

        Toast.makeText(this, "Calling the onCreate function on Activity2", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate Function on Activity 2 ");

        //set the onClick listener on the button
        btn1=findViewById(R.id.btnActivity2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        }
        @Override
        protected void onStart(){
            Toast.makeText(this, "Calling the onStart function on Activity2", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onStart Function on Activity 2");
        super.onStart();
        }
        @Override
        protected void onResume(){
            Toast.makeText(this, "Calling the onResume function on Activity2", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onResume Function on Activity 2");
            super.onResume();
        }
        @Override
        protected void onPause(){
            Toast.makeText(this, "Calling the onPause function on Activity2", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onPause Function on Activity 2");
            super.onPause();
        }
        @Override
        protected void onStop(){
            Toast.makeText(this, "Calling the onStop function on Activity2", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onStop Function on Activity 2");
            super.onStop();
        }
        @Override
        protected void onRestart(){
            Toast.makeText(this, "Calling the onRestart function on Activity2", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onRestart Function on Activity 2");
            super.onRestart();
        }
        @Override
        protected void onDestroy(){
            Toast.makeText(this, "Calling the onDestroy function on Activity2", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onDestroy Function on Activity 2");
            super.onDestroy();
        }
    }