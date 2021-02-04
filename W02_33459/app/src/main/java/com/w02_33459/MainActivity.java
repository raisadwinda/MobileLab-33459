package com.w02_33459;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Penambahan class-class yang harus diimport
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Deklarasi object (variable) yg merepresentasikan komponen UI
    EditText etAngka1, etAngka2;
    TextView tvHasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        menghubungkan object (variable) pada code Java dengan
//          object komponen UI pada layout . xml file
        etAngka1 = (EditText) this.findViewById(R.id.angka1);
//        Line ini digunakan untuk mencari EditText yang sudah didefinisikan pada activity_main.xml. Akan
//        mencari id dengan nama @+id/angka2 pada seluruh xml layout yang ada
        etAngka2 = (EditText) this.findViewById(R.id.angka2);
        btnTambah = (Button) this.findViewById(R.id.btnTambah);
        btnKurang = (Button) this.findViewById(R.id.btnKurang);
        btnKali = (Button) this.findViewById(R.id.btnKali);
        btnBagi = (Button) this.findViewById(R.id.btnBagi);
        tvHasil = (TextView) this.findViewById(R.id.hasil);
//        menambahkan interaksi terhadap button
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '+'); } } );
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '-'); } } );
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '*'); } } );
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung( '/'); } } );

    }
    protected void hitung(char operator) {
        double dbAngka1 = Double.parseDouble(etAngka1.getText().toString());
        double dbAngka2 = Double.parseDouble(etAngka2.getText().toString());
        double dbResult = 0.0;
        switch (operator) {
            case ('+') : dbResult = dbAngka1 + dbAngka2; break;
            case ('-') : dbResult = dbAngka1 - dbAngka2; break;
            case ('*') : dbResult = dbAngka1 * dbAngka2; break;
            case ('/') : dbResult = dbAngka1 / dbAngka2;
        }
        tvHasil.setText(String.valueOf(dbResult));
    }
}