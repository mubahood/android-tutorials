package com.muadhi.customfonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    TextView dynamic_font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dynamic_font = findViewById(R.id.dynamic_font);
        Typeface my_font = ResourcesCompat.getFont(this, R.font.bad_script);
    }
}