package com.example.qltv;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DangKy extends AppCompatActivity {
    Button btnDANGKY, btnCanCel;
    EditText edttaikhoan, edtmatkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
       
        btnCanCel = (Button)findViewById(R.id.btnCanCel);
        btnCanCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
