package com.chabtharin.mybottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShow = findViewById(R.id.btnShow);
        btnShow.setOnClickListener(view -> {
            MyBottomSheetDialog bottomSheet = new MyBottomSheetDialog();
            bottomSheet.show(getSupportFragmentManager(),
                    "ModalBottomSheet");
        });
    }
}