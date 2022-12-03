package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AkademikTabAdapter extends FragmentPagerAdapter {

    int total;

    public AkademikTabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.total = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ProfileFragment();
            case 1:
                return new ProgramSarjanaFragment();
            case 2:
                return new MataKuliahFragment();
            case 3:
                return new MapsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return total;
    }
}
