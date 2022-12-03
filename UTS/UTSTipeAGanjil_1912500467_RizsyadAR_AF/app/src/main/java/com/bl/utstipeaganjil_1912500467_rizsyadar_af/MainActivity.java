package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView facebook, twitter, ig;
    LinearLayout akademik, perpus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        facebook = findViewById(R.id.fb);
        twitter = findViewById(R.id.twit);
        ig = findViewById(R.id.ig);
        akademik = findViewById(R.id.akademik);
        perpus = findViewById(R.id.perpustakaan);

        facebook.setOnClickListener(this);
        twitter.setOnClickListener(this);
        ig.setOnClickListener(this);

        akademik.setOnClickListener(this);
        perpus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fb:
                Intent IntentFb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/universitasbudiluhur"));
                startActivity(IntentFb);
                break;
            case R.id.twit:
                Intent IntentTwit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
                startActivity(IntentTwit);
                break;
            case R.id.ig:
                Intent IntentIg = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
                startActivity(IntentIg);
                break;

            case R.id.akademik:
                Intent intentAkadmik = new Intent(MainActivity.this, AkademikActivity.class);
                startActivity(intentAkadmik);
                break;
            case R.id.perpustakaan:
                Intent intentPerpus = new Intent(MainActivity.this, PerpustakaanActivity.class);
                startActivity(intentPerpus);
                break;

            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah anda yakin ingin keluar dari aplikasi ini?");
        builder.setTitle("Keluar Aplikasi");
        builder.setIcon(R.drawable.alert);


        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.finishAffinity();
                return;
            }
        });

        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();
    }
}