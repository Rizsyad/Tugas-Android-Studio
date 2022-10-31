package com.bl.a1912500467_rizsyadar_prestest03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // hide appbar
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.finishAffinity();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


    public void mahasiswa(View view) {
        Intent intent = new Intent(this, MhsActivity.class);
        startActivity(intent);

    }

    public void jurusan(View view) {
        Intent intent = new Intent(this, JurusanActivity.class);
        startActivity(intent);

    }

    public void matkul(View view) {
        Intent intent = new Intent(this, MataKuliahActivity.class);
        startActivity(intent);

    }

    public void nilai(View view) {
        Intent intent = new Intent(this, NilaiActivity.class);
        startActivity(intent);

    }

    public void kkp(View view) {
        Intent intent = new Intent(this, KKPActivity.class);
        startActivity(intent);

    }

    public void skripsi(View view) {
        Intent intent = new Intent(this, SkripsiActivity.class);
        startActivity(intent);

    }

}