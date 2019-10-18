package com.example.myintentapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mel;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intent);
        mel =findViewById(R.id.mel);
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {
        if (v.getId() == R.id.btnNext) {
            String tul =mel.getText().toString();
            if (TextUtils.isEmpty(tul)){
                mel.setError("Harap diisi, cukup hati aja yg kosong :)");
            }else {
                Intent mal =new Intent(this,Slide2.class);
                mal.putExtra(Slide2.EXTRA_DATA,tul);
                startActivity(mal);
            }

        }

    }

}