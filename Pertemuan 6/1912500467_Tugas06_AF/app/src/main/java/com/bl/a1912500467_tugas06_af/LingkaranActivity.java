package com.bl.a1912500467_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText jarijari;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        getSupportActionBar().hide();

        jarijari = findViewById(R.id.jarijari);
        hasil = findViewById(R.id.txt_hasil);
    }

    public void hitung_luas(View view) {
        String inputjarijari = jarijari.getText().toString();
        Double phi=3.14;

        if(TextUtils.isEmpty(inputjarijari)) {
            jarijari.setError("Jari - Jari Harus Di Isi");
            jarijari.requestFocus();
        } else {
            Double nilaiJari = Double.parseDouble(inputjarijari);
            Double hasilLuas =  Math.pow(nilaiJari, 2) * phi;
            hasil.setText("Hasil :\nLuas = " + hasilLuas);
        }
    }

    public void hitung_keliling(View view) {
        String inputjarijari = jarijari.getText().toString();
        Double phi=3.14;

        if(TextUtils.isEmpty(inputjarijari)) {
            jarijari.setError("Jari - Jari Harus Di Isi");
            jarijari.requestFocus();
        } else {
            Double nilaiJari = Double.parseDouble(inputjarijari);
            Double hasilKeliling = phi*(2*nilaiJari);
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