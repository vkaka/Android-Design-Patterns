package com.example.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.designpatterns.builder.BuilderModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BuilderModel builderModel = new BuilderModel();
        builderModel.method();

    }
}
