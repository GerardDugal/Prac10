package com.example.a1st_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("life", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("life", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.wtf("life", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("life", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("life", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.w("life", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пора уже что-то делать", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("life", "onDestroy");
    }
}