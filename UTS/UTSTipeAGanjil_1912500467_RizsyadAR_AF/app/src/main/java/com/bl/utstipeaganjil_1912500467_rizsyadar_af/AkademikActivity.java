package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class AkademikActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);
        getSupportActionBar().hide();

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("Profile").setIcon(R.drawable.ic_baseline_person_24));
        tabLayout.addTab(tabLayout.newTab().setText("Program Sarjana").setIcon(R.drawable.ic_baseline_supervisor_account_24));
        tabLayout.addTab(tabLayout.newTab().setText("Mata Kuliah").setIcon(R.drawable.ic_baseline_content_paste_search_24));
        tabLayout.addTab(tabLayout.newTab().setText("Lokasi").setIcon(R.drawable.ic_baseline_location_on_24));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        AkademikTabAdapter tabadapter = new AkademikTabAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        int tabColor = ContextCompat.getColor(AkademikActivity.this, R.color.white);
        tabLayout.getTabAt(0).getIcon().setColorFilter(tabColor, PorterDuff.Mode.SRC_IN);

        viewPager.setAdapter(tabadapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition() == 1) {
                    ProgramSarjanaDialogFragment dialogFragment = new ProgramSarjanaDialogFragment();
                    dialogFragment.show(getSupportFragmentManager(), "dialog");
                }

                int tabColor = ContextCompat.getColor(AkademikActivity.this, R.color.white);
                tab.getIcon().setColorFilter(tabColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int tabColor = ContextCompat.getColor(AkademikActivity.this, R.color.st_patricks_blue);
                tab.getIcon().setColorFilter(tabColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}