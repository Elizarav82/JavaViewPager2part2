package com.example.javaviewpager2.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.javaviewpager2.model.OnBoardingFragmentViewPagerModel;
import com.example.javaviewpager2.ui.ViewPagerFragment;

import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private final List<OnBoardingFragmentViewPagerModel> viewPagerList;

    public ViewPagerAdapter(
            @NonNull FragmentActivity fragmentActivity,
            List<OnBoardingFragmentViewPagerModel> viewPagerList
    ) {
        super(fragmentActivity);
        this.viewPagerList = viewPagerList;
    }

    @Override
    public int getItemCount() {
        return viewPagerList.size();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new ViewPagerFragment();
        Bundle args = new Bundle();
        args.putSerializable("vp", viewPagerList.get(position));
        fragment.setArguments(args);
        return fragment;
    }
}


