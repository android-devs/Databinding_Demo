package com.example.databinding_demo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databinding_demo.ViewModels.LoginViewModel;
import com.example.databinding_demo.databinding.ActivityLoginBinding;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
    binding.setLoginmodel(new LoginViewModel());
    }
}
