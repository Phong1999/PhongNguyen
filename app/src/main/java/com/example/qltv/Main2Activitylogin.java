package com.example.qltv;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activitylogin extends AppCompatActivity {
    EditText edtuser,edtpassword;
    Button btndangnhap,btndangky,btnthoat;
    String ten,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activitylogin);
        Anhxa();
        ControlButton();
    }

    private void ControlButton() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activitylogin.this, android.R.style.Theme_DeviceDefault_Dialog);
                builder.setTitle("Bạn Chắc chắn muốn thoát khỏi app");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                builder.setPositiveButton("có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(Main2Activitylogin.this);
                dialog.setTitle("Hộp Thoại Xử lý");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialog);
                final EditText edttk = (EditText) dialog.findViewById(R.id.edttk);
                final EditText edtmk = (EditText) dialog.findViewById(R.id.edtmk);
                Button btndongy = (Button) dialog.findViewById(R.id.buttondongy);
                Button btnhuy = (Button) dialog.findViewById(R.id.buttonhuy);
                btndongy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ten = edttk.getText().toString().trim();
                        mk = edtmk.getText().toString().trim();

                        edtuser.setText(ten);
                        edtpassword.setText(mk);

                        dialog.cancel();

                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtuser.getText().toString().equals("admin") && edtpassword.getText().toString().equals("123")){
                    Intent intent = new Intent(Main2Activitylogin.this, MainActivity.class);
                    startActivity(intent);

                }


            }

        });
    }

    private void Anhxa() {
        edtuser = (EditText) findViewById(R.id.edtuser);
        edtpassword = (EditText) findViewById(R.id.edtpassword);
        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        btndangky = (Button) findViewById(R.id.btndangky);
        btnthoat = (Button) findViewById(R.id.btnthoat);
    }
}
