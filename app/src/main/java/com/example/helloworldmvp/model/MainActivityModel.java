package com.example.helloworldmvp.model;

import com.example.helloworldmvp.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData() {
        return "Hello World";
    }
}
