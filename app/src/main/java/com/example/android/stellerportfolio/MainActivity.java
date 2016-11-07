package com.example.android.stellerportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Context context = getApplicationContext();
    private String toastText = "This button will launch my ";

    public void movies_clicked(View view) {
        Toast.makeText(context, toastText + getString(R.string.movies) + " app", Toast.LENGTH_SHORT).show();
    }

    public void stocks_clicked(View view) {
        Toast.makeText(context, toastText + getString(R.string.stock) + " app", Toast.LENGTH_SHORT).show();
    }

    public void build_clicked(View view) {
        Toast.makeText(context, toastText + getString(R.string.build) + " app", Toast.LENGTH_SHORT).show();
    }

    public void make_clicked(View view) {
        Toast.makeText(context, toastText + getString(R.string.make) + " app", Toast.LENGTH_SHORT).show();
    }

    public void go_clicked(View view) {
        Toast.makeText(context, toastText + getString(R.string.go) + " app", Toast.LENGTH_SHORT).show();
    }

    public void capstone_clicked(View view) {
        Toast.makeText(context, toastText + getString(R.string.capstone) + " app", Toast.LENGTH_SHORT).show();
    }
}
