package com.excellentsoftwares.gitlabtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Add();

    }
    void Add()
    {
        int a,b,c;
        a=10;
        b=5;
        c=a+b;
    }
}
