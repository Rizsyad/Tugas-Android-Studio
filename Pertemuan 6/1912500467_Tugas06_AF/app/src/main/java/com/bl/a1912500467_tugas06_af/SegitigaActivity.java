package com.bl.a1912500467_tugas06_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    Double alas;
    Button btnHitung;
    EditText edtText1;
    EditText edtText2;
    EditText edtText3;
    Double sisiA;
    Double sisiB;
    Double sisiC;
    Double tinggi;
    TextView txtHasil;
    TextView txtView1;
    TextView txtView2;
    TextView txtView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        getSupportActionBar().hide();

        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);

        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);
        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);
    }

    public void onRadioButtonClicked(View view) {
        boolean isChecked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_hitung_keliling:
                break;
            case R.id.radio_hitung_luas:
                if (isChecked) {
                    txtView1.setText("Alas");
                    txtView2.setText("Tinggi");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText("Hitung Luas");
                    txtView1.setVisibility(View.VISIBLE);
                    edtText1.setVisibility(View.VISIBLE);

                    edtText2.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    txtView3.setVisibility(View.INVISIBLE);
                    edtText3.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText("Hasil");
                    return;
                }
                break;
            default:
                return;
        }
        if (isChecked) {
            txtView1.setText("Sisi A");
            txtView2.setText("Sisi B");
            txtView3.setText("Sisi C");
            edtText1.setText("");
            edtText2.setText("");
            edtText3.setText("");
            btnHitung.setText("Hitung Keliling");
            edtText1.setVisibility(View.VISIBLE);
            edtText2.setVisibility(View.VISIBLE);
            edtText3.setVisibility(View.VISIBLE);
            txtView1.setVisibility(View.VISIBLE);
            txtView2.setVisibility(View.VISIBLE);
            txtView3.setVisibility(View.VISIBLE);
            btnHitung.setVisibility(View.VISIBLE);
            txtHasil.setVisibility(View.VISIBLE);
            txtHasil.setText("Hasil");
        }
    }

    public void hitung(View view) {
        if (btnHitung.getText().toString() == "Hitung Luas") {
            String inputalas = edtText1.getText().toString();
            String inputtinggi = edtText2.getText().toString();

            if(TextUtils.isEmpty(inputalas)) {
                edtText1.setError("Alas Harus Di Isi");
                edtText1.requestFocus();
            } else if(TextUtils.isEmpty(inputtinggi)) {
                edtText2.setError("Tinggi Harus Di Isi");
                edtText2.requestFocus();
            } else {
                alas = Double.parseDouble(inputalas);
                tinggi = Double.parseDouble(inputtinggi);
                Double hasilLuas = (alas * tinggi) / 2;
                txtHasil.setText("Hasil :\nLuas = " + hasilLuas);
            }

        } else {
            String inputsisiA = edtText1.getText().toString();
            String inputsisiB = edtText2.getText().toString();
            String inputsisiC = edtText3.getText().toString();

            if(TextUtils.isEmpty(inputsisiA)) {
                edtText1.setError("Sisi A Harus Di Isi");
                edtText1.requestFocus();
            } else if(TextUtils.isEmpty(inputsisiB)) {
                edtText2.setError("Sisi B Harus Di Isi");
                edtText2.requestFocus();
            }else if(TextUtils.isEmpty(inputsisiC)) {
                edtText3.setError("Sisi C Harus Di Isi");
                edtText3.requestFocus();
            } else {
                sisiA = Double.parseDouble(inputsisiA);
                sisiB = Double.parseDouble(inputsisiB);
                sisiC = Double.parseDouble(inputsisiC);

                Double hasilKeliling = sisiA + sisiB + sisiC;
                txtHasil.setText("Hasil :\nKeliling = " + hasilKeliling);
            }
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