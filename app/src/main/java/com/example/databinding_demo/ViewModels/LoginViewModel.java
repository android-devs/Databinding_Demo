package com.example.databinding_demo.ViewModels;
/**
 * Created by Rb on 9/15/2016.
 */
public class LoginViewModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;
}
