package com.example.javaviewpager2.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.javaviewpager2.R;

public class SignInFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_in, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String name = getArguments() != null ? getArguments().getString("name") : null;
        String password = getArguments() != null ? getArguments().getString("password") : null;

        EditText userNameSignInET = view.findViewById(R.id.userNameSignInET);
        EditText passwordSignInET = view.findViewById(R.id.passwordSignInET);
        Button loginSignInBTN = view.findViewById(R.id.loginSignInBTN);
        loginSignInBTN.setOnClickListener(v -> {
            if (name != null && !name.equals(userNameSignInET.getText().toString())
                    || password != null && !password.equals(passwordSignInET.getText().toString())) {
                Toast.makeText(getContext(), "Введены неверно пароль или логин", Toast.LENGTH_LONG).show();
            } else {
                if (getFragmentManager() != null) {
                    getFragmentManager().beginTransaction().replace(R.id.containerID, new MainFragment()).commit();
                }
            }
        });
    }
}

