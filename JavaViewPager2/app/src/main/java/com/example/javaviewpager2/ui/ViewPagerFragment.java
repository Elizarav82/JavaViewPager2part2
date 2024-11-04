package com.example.javaviewpager2.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.widget.Button;

import com.example.javaviewpager2.model.OnBoardingFragmentViewPagerModel;
import com.example.javaviewpager2.R;
import com.example.javaviewpager2.StartActivity;

public class ViewPagerFragment extends Fragment {
    private boolean check = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView viewPagerTV = view.findViewById(R.id.viewPagerTV);
        ImageView viewPagerIV = view.findViewById(R.id.viewPagerIV);
        Button startBTN = view.findViewById(R.id.startBTN);

        OnBoardingFragmentViewPagerModel viewPagerItem = (OnBoardingFragmentViewPagerModel) getArguments().getSerializable("vp");
        if (viewPagerItem != null) {
            check = viewPagerItem.isCheckButton();
            viewPagerTV.setText(viewPagerItem.getTitle());
            viewPagerIV.setImageResource(viewPagerItem.getImageView());
        }


        if (!check) {
            startBTN.setVisibility(View.VISIBLE);
            startBTN.setOnClickListener(v -> startActivity(new Intent(getActivity(), StartActivity.class)));
        }
    }
}



