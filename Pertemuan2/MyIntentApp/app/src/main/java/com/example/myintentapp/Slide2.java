package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Slide2 extends AppCompatActivity {
    public static final String EXTRA_DATA ="Kosong";

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
        tvData =findViewById(R.id.Hasil);
        String text =getIntent().getStringExtra(EXTRA_DATA);
        tvData.setText(text);

    }
}
