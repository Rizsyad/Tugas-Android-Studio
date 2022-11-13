package com.bl.a1912500467_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PersergiPanjangActivity extends AppCompatActivity {

    EditText panjang, lebar;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persergi_panjang);
        getSupportActionBar().hide();

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hasil = findViewById(R.id.txt_hasil);
    }

    public void hitung_luas(View view) {
        String inputpanjang = panjang.getText().toString();
        String inputlebar = lebar.getText().toString();

        if(TextUtils.isEmpty(inputpanjang)) {
            panjang.setError("Panjang Harus Di Isi");
            panjang.requestFocus();
        } else if(TextUtils.isEmpty(inputlebar)) {
            lebar.setError("Lebar Harus Di Isi");
            lebar.requestFocus();
        } else {
            Double nilaipanjang = Double.parseDouble(inputpanjang);
            Double nilailebar = Double.parseDouble(inputlebar);
            Double hasilLuas = nilaipanjang * nilailebar;

            hasil.setText("Hasil :\nLuas = " + hasilLuas);
        }

    }

    public void hitung_keliling(View view) {
        String inputpanjang = panjang.getText().toString();
        String inputlebar = lebar.getText().toString();

        if(TextUtils.isEmpty(inputpanjang)) {
            panjang.setError("Panjang Harus Di Isi");
            panjang.requestFocus();
        } else if(TextUtils.isEmpty(inputlebar)) {
            lebar.setError("Lebar Harus Di Isi");
            lebar.requestFocus();
        } else {
            Double nilaipanjang = Double.parseDouble(inputpanjang);
            Double nilailebar = Double.parseDouble(inputlebar);
            Double hasilKeliling = (2 * nilaipanjang) + (2 * nilailebar);

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