package com.example.javaviewpager2.model;

import com.example.javaviewpager2.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OnBoardingFragmentViewPagerModel implements Serializable {

    private String title;
    private int imageView;
    private boolean checkButton;

    public OnBoardingFragmentViewPagerModel(String title, int imageView, boolean checkButton) {
        this.title = title;
        this.imageView = imageView;
        this.checkButton = checkButton;
    }

    public static List<OnBoardingFragmentViewPagerModel> viewPagerList = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public int getImageView() {
        return imageView;
    }

    public boolean isCheckButton() {
        return checkButton;
    }

    static {
        viewPagerList.add(
                new OnBoardingFragmentViewPagerModel(
                        "О,спорт - ты жизнь!", R.drawable.ski, true)
        );
        viewPagerList.add(
                new OnBoardingFragmentViewPagerModel(
                        "Быстрее!Выше!Сильнее!", R.drawable.sky, true)
        );
        viewPagerList.add(
                new OnBoardingFragmentViewPagerModel(
                        "В здоровом теле - здоровый дух!", R.drawable.hokkey, false)
        );
    }
}


