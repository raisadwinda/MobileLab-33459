package com.w04_33459;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

//    TextView tvTesAja;
//    String strTes;
//
    EditText etEditTulisan;
    Button btnGantiTulisan;
    TextView tvTulisan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etEditTulisan=findViewById(R.id.fragment_first_edittext_tulisan);
        btnGantiTulisan=findViewById(R.id.fragment_first_button_berubah);
        tvTulisan=findViewById(R.id.fragment_second_textview_tulisan);

        btnGantiTulisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tulisan = etEditTulisan.getText().toString();
                tvTulisan.setText(tulisan);
            }
        });

//        //nerima intent yg dikirim main activity
//        Intent intent = getIntent();
//        strTes = intent.getStringExtra("tesss");
//
//        tvTesAja = findViewById(R.id.TesAja);
//
//        tvTesAja.setText(strTes);
    }
}