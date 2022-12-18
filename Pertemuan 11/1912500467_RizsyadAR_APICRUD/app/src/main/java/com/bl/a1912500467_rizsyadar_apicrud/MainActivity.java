package com.bl.a1912500467_rizsyadar_apicrud;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNama;
    private EditText editTextAlamat;
    private EditText editTextJurusan;

    private Button buttonAdd;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextAlamat = (EditText) findViewById(R.id.editTextAlamat);
        editTextJurusan = (EditText) findViewById(R.id.editTextJurusan);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonView = (Button) findViewById(R.id.buttonView);

        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }

    private void addMahasiswa() {
        final String nama = editTextNama.getText().toString().trim();
        final String alamat = editTextAlamat.getText().toString().trim();
        final String jurusan = editTextJurusan.getText().toString().trim();

        class AddMahasiswa extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute(){
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this, "Menambahkan...", "Tunggu...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Configuration.KEY_MHS_NAMA, nama);
                params.put(Configuration.KEY_MHS_ALAMAT, alamat);
                params.put(Configuration.KEY_MHS_JURUSAN, jurusan);

                RequestHandler rh = new RequestHandler();
                String s = rh.sendPostRequest(Configuration.URL_ADD, params);
                return s;
            }
        }

        AddMahasiswa ae = new AddMahasiswa();
        ae.execute();
    }

    @Override
    public void onClick(View view) {
        if(view == buttonAdd) addMahasiswa();
        if(view == buttonView) {
            startActivity(new Intent(this, TampilSemuaMahasiswaActivity.class));
        }
    }
}