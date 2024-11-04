package com.example.javaviewpager2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javaviewpager2.ui.SignUpFragment;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.containerID, new SignUpFragment())
                .commit();
    }
}

