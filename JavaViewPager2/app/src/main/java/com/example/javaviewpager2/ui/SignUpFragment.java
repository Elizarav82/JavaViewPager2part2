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

public class SignUpFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText userNameSignUpET = view.findViewById(R.id.userNameSignUpET);
        EditText passwordSignUpET = view.findViewById(R.id.passwordSignUpET);
        Button loginSignUpBTN = view.findViewById(R.id.loginSignUpBTN);

        loginSignUpBTN.setOnClickListener(v -> {
            String userNameSignUp = userNameSignUpET.getText().toString();
            String passwordSignUp = passwordSignUpET.getText().toString();
            if (userNameSignUp.isEmpty() || passwordSignUp.isEmpty()) {
                Toast.makeText(getContext(), "Данные не введены", Toast.LENGTH_LONG).show();
                return;
            }

            Bundle bundle = new Bundle();
            SignInFragment signInFragment = new SignInFragment();
            bundle.putString("name", userNameSignUp);
            bundle.putString("password", passwordSignUp);
            signInFragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.containerID, signInFragment)
                    .commit();
            Toast.makeText(getContext(), "Вы успешно зарегистрированы", Toast.LENGTH_LONG).show();
        });
    }
}

