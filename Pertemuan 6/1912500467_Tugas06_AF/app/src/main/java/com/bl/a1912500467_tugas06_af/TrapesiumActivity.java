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

public class TrapesiumActivity extends AppCompatActivity {

    Button btnHitung;
    EditText edtText1;
    EditText edtText2;
    EditText edtText3;
    EditText edtText4;
    Double sisiAB;
    Double sisiBC;
    Double sisiCD;
    Double sisiDA;
    Double tinggi;
    TextView txtHasil;
    TextView txtView1;
    TextView txtView2;
    TextView txtView3;
    TextView txtView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        getSupportActionBar().hide();

        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        edtText4 = (EditText) findViewById(R.id.edt_text_view_4);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtView4 = (TextView) findViewById(R.id.text_view_4);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);

        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);
        edtText4.setVisibility(View.INVISIBLE);
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
                    txtView1.setText("Sisi AB");
                    txtView2.setText("Sisi CD");
                    txtView3.setText("Tinggi");
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText("Hitung Luas");
                    txtView1.setVisibility(View.VISIBLE);
                    edtText1.setVisibility(View.VISIBLE);

                    edtText2.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    txtView3.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);

                    txtView4.setVisibility(View.INVISIBLE);
                    edtText4.setVisibility(View.INVISIBLE);

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
            txtView1.setText("Sisi AB");
            txtView2.setText("Sisi BC");
            txtView3.setText("Sisi CD");
            txtView4.setText("Sisi DA");
            edtText1.setText("");
            edtText2.setText("");
            edtText3.setText("");
            edtText4.setText("");
            btnHitung.setText("Hitung Keliling");
            edtText1.setVisibility(View.VISIBLE);
            txtView1.setVisibility(View.VISIBLE);
            edtText2.setVisibility(View.VISIBLE);
            txtView2.setVisibility(View.VISIBLE);
            edtText3.setVisibility(View.VISIBLE);
            txtView3.setVisibility(View.VISIBLE);
            edtText4.setVisibility(View.VISIBLE);
            txtView4.setVisibility(View.VISIBLE);
            btnHitung.setVisibility(View.VISIBLE);
            txtHasil.setVisibility(View.VISIBLE);
            txtHasil.setText("Hasil");
        }
    }

    public void hitung(View view) {
        if (btnHitung.getText().toString() == "Hitung Luas") {
            String inputAB = edtText1.getText().toString();
            String inputCD = edtText2.getText().toString();
            String inputtinggi = edtText3.getText().toString();

            if(TextUtils.isEmpty(inputAB)) {
                edtText1.setError("Sisi AB Harus Di Isi");
                edtText1.requestFocus();
            } else if(TextUtils.isEmpty(inputCD)) {
                edtText2.setError("Sisi CD Harus Di Isi");
                edtText2.requestFocus();
            } else if(TextUtils.isEmpty(inputtinggi)) {
                edtText3.setError("Tinggi Harus Di Isi");
                edtText3.requestFocus();
            } else {
                sisiAB = Double.parseDouble(inputAB);
                sisiCD = Double.parseDouble(inputCD);
                tinggi = Double.parseDouble(inputtinggi);
                Double hasilLuas = ((sisiAB + sisiCD) * tinggi) / 2;
                txtHasil.setText("Hasil :\nLuas = " + hasilLuas);
            }

        } else {
            String inputsisiAB = edtText1.getText().toString();
            String inputsisiBC = edtText2.getText().toString();
            String inputsisiCD = edtText3.getText().toString();
            String inputsisiDA = edtText4.getText().toString();

            if(TextUtils.isEmpty(inputsisiAB)) {
                edtText1.setError("Sisi AB Harus Di Isi");
                edtText1.requestFocus();
            } else if(TextUtils.isEmpty(inputsisiBC)) {
                edtText2.setError("Sisi BC Harus Di Isi");
                edtText2.requestFocus();
            }else if(TextUtils.isEmpty(inputsisiCD)) {
                edtText3.setError("Sisi CD Harus Di Isi");
                edtText3.requestFocus();
            } else if(TextUtils.isEmpty(inputsisiDA)) {
                edtText4.setError("Sisi DA Harus Di Isi");
                edtText4.requestFocus();
            } else {
                sisiAB = Double.parseDouble(inputsisiAB);
                sisiBC = Double.parseDouble(inputsisiBC);
                sisiCD = Double.parseDouble(inputsisiCD);
                sisiDA = Double.parseDouble(inputsisiDA);

                Double hasilKeliling = sisiAB + sisiBC + sisiCD + sisiDA;
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