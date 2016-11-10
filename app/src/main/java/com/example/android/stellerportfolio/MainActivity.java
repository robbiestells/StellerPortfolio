package com.example.android.stellerportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String toastText = getString(R.string.toastText);

    public void button_clicked(View view) {
        String appName;
        switch (view.getId()){
            case R.id.moviesButton:
                appName = getString(R.string.movies);
                break;
            case R.id.stockButton:
                appName = getString(R.string.stock);
                break;
            case R.id.buildButton:
                appName = getString(R.string.build);
                break;
            case R.id.makeButton:
                appName = getString(R.string.make);
                break;
            case R.id.goButton:
                appName = getString(R.string.go);
                break;
            default:
                appName = getString(R.string.capstone);
        }
        Toast.makeText(getApplicationContext(), toastText + appName + " app", Toast.LENGTH_SHORT).show();
    }
}
