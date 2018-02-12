package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.ColorsFragment;
import com.example.android.miwok.FamilyFragment;
import com.example.android.miwok.NumbersFragment;
import com.example.android.miwok.PhrasesFragment;

/**
 * Created by randall on 2/11/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter{
    /**
     * Provides the appropriate {@link Fragment} for a view pager.
     */
        public CategoryAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new NumbersFragment();
            } else if (position == 1){
                return new FamilyFragment();
            } else if (position == 2){
                return new ColorsFragment();
            } else {
                return new PhrasesFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
}
