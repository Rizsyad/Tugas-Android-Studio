package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class PerpustakaanActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);
        getSupportActionBar().hide();

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("Khusus Mahasiswa").setIcon(R.drawable.ic_baseline_person_24));
        tabLayout.addTab(tabLayout.newTab().setText("Khusus Dosen").setIcon(R.drawable.ic_baseline_supervisor_account_24));
        tabLayout.addTab(tabLayout.newTab().setText("Khusus Staff").setIcon(R.drawable.ic_baseline_person_24));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        PerpustakaanTabAdapter tabadapter = new PerpustakaanTabAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        int tabColor = ContextCompat.getColor(PerpustakaanActivity.this, R.color.white);
        tabLayout.getTabAt(0).getIcon().setColorFilter(tabColor, PorterDuff.Mode.SRC_IN);

        viewPager.setAdapter(tabadapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 2) {
                    KhususStaffDialogFragment dialogFragment = new KhususStaffDialogFragment();
                    dialogFragment.show(getSupportFragmentManager(), "dialog");
                }

                int tabColor = ContextCompat.getColor(PerpustakaanActivity.this, R.color.white);
                tab.getIcon().setColorFilter(tabColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int tabColor = ContextCompat.getColor(PerpustakaanActivity.this, R.color.st_patricks_blue);
                tab.getIcon().setColorFilter(tabColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}