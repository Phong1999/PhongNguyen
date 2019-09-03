package com.example.qltv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DanhSach extends AppCompatActivity {
    Button btncapnhat, btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach);
        Button btFinish = (Button) findViewById(R.id.btnthoat);
        btFinish.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
