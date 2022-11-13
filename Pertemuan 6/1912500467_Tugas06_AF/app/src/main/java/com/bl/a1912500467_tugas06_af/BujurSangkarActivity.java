package com.bl.a1912500467_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BujurSangkarActivity extends AppCompatActivity {


    EditText sisi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);

        getSupportActionBar().hide();

        sisi = findViewById(R.id.sisi);
        hasil = findViewById(R.id.txt_hasil);
    }

    public void hitung_luas(View view) {
        String inputsisi = sisi.getText().toString();

        if(TextUtils.isEmpty(inputsisi)) {
            sisi.setError("Sisi Harus Di Isi");
            sisi.requestFocus();
        } else {
            Double nilaiSisi= Double.parseDouble(inputsisi);
            Double hasilLuas =  Math.pow(nilaiSisi, 2);
            hasil.setText("Hasil :\nLuas = " + hasilLuas);
        }
    }

    public void hitung_keliling(View view) {
        String inputsisi = sisi.getText().toString();

        if(TextUtils.isEmpty(inputsisi)) {
            sisi.setError("Sisi Harus Di Isi");
            sisi.requestFocus();
        } else {
            Double nilaisisi = Double.parseDouble(inputsisi);
            Double hasilKeliling = 4 * nilaisisi;
            hasil.setText("Hasil :\nKeliling = " + hasilKeliling);
        }
    }

    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
    }

}