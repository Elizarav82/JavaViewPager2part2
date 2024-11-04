package com.example.javaviewpager2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.javaviewpager2.adapters.ViewPagerAdapter;
import com.example.javaviewpager2.model.OnBoardingFragmentViewPagerModel;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerAdapter = new ViewPagerAdapter(this, OnBoardingFragmentViewPagerModel.viewPagerList);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);
    }
}