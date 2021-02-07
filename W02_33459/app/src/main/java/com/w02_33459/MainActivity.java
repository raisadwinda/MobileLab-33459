package com.w02_33459;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Penambahan class-class yang harus diimport
import android.text.Editable;
import android.text.TextWatcher;
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

        etAngka1.addTextChangedListener(TambahTextWatcher);
        etAngka1.addTextChangedListener(KurangTextWatcher);
        etAngka1.addTextChangedListener(KaliTextWatcher);
        etAngka1.addTextChangedListener(BagiTextWatcher);
        etAngka2.addTextChangedListener(TambahTextWatcher);
        etAngka2.addTextChangedListener(KurangTextWatcher);
        etAngka2.addTextChangedListener(KaliTextWatcher);
        etAngka2.addTextChangedListener(BagiTextWatcher);
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

    private TextWatcher TambahTextWatcher = new TextWatcher() {
      @Override
      public void beforeTextChanged(CharSequence s, int start, int before, int count){

      }
      @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
          String angka1input = etAngka1.getText().toString();
          String angka2input = etAngka2.getText().toString();

          btnTambah.setEnabled(!angka1input.isEmpty() && !angka2input.isEmpty());
      }
      @Override
        public void afterTextChanged(Editable s) {

      }
    };
    private TextWatcher KurangTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String angka1input = etAngka1.getText().toString();
            String angka2input = etAngka2.getText().toString();

            btnKurang.setEnabled(!angka1input.isEmpty() && !angka2input.isEmpty());
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher KaliTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String angka1input = etAngka1.getText().toString();
            String angka2input = etAngka2.getText().toString();

            btnKali.setEnabled(!angka1input.isEmpty() && !angka2input.isEmpty());
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher BagiTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String angka1input = etAngka1.getText().toString();
            String angka2input = etAngka2.getText().toString();

            btnBagi.setEnabled(!angka1input.isEmpty() && !angka2input.isEmpty());
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    };

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