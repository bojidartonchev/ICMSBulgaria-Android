package com.venomeye.icmsbulgaria.Utilities.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.venomeye.icmsbulgaria.Fragments.DentistryFragment;
import com.venomeye.icmsbulgaria.Fragments.PreclinicFragment;
import com.venomeye.icmsbulgaria.Fragments.PublicHealthFragment;
import com.venomeye.icmsbulgaria.Fragments.SurgeryFragment;
import com.venomeye.icmsbulgaria.Fragments.TherapyFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PreclinicFragment tab1 = new PreclinicFragment();
                return tab1;
            case 1:
                TherapyFragment tab2 = new TherapyFragment();
                return tab2;
            case 2:
                SurgeryFragment tab3 = new SurgeryFragment();
                return tab3;
            case 3:
                DentistryFragment tab4 = new DentistryFragment();
                return tab4;
            case 4:
                PublicHealthFragment tab5 = new PublicHealthFragment();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}