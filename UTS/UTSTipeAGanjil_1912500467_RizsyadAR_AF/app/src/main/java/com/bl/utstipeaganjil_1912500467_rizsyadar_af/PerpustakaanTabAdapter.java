package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PerpustakaanTabAdapter extends FragmentPagerAdapter {

    int total;

    public PerpustakaanTabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.total = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new KhususMahasiswaFragment();
            case 1:
                return new KhususDosenFragment();
            case 2:
                return new KhususStaffFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return total;
    }
}
