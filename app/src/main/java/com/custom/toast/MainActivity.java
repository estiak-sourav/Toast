package com.custom.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.custom.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button defaultBtn = findViewById(R.id.defaultBtn);
        Button successBtn = findViewById(R.id.successBtn);
        Button warningBtn = findViewById(R.id.warningBtn);
        Button errorBtn = findViewById(R.id.errorBtn);
        Button infoBtn = findViewById(R.id.infoBtn);
        Button confusingBtn = findViewById(R.id.confusingBtn);

        defaultBtn.setOnClickListener(view -> Toasty.defaults(this, "Defaults"));

        successBtn.setOnClickListener(view -> Toasty.success(this, "Success", Toasty.LENGTH_LONG));

        warningBtn.setOnClickListener(view -> Toasty.warning(this, "warning", Toasty.LENGTH_LONG));

        errorBtn.setOnClickListener(view -> Toasty.error(this, "error", Toasty.LENGTH_LONG));

        infoBtn.setOnClickListener(view -> Toasty.info(this, "info", Toasty.LENGTH_LONG));

        confusingBtn.setOnClickListener(view -> Toasty.confusing(this, "confusing", Toasty.LENGTH_LONG));
    }
}