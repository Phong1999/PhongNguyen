package com.example.qltv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NHANVIEN extends AppCompatActivity {
    Button btnTHEM, btnCANCEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhanvien);
        btnCANCEL = (Button) findViewById(R.id.btnCANCEL);
        btnCANCEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
