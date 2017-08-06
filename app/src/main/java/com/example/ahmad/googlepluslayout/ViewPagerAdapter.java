package com.example.ahmad.googlepluslayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;

import java.util.Collections;

/**
 * Created by ahmad on 04/08/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    final Context context;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public ViewPagerAdapter(FragmentManager fragmentManager, Fragment fragment) {
        super(fragmentManager);
        this.context = fragment.getContext();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = FeaturedFragment.newInstance();
                break;
            case 1:
                fragment = FollowingFragment.newInstance();
                break;
            case 2:
                fragment = YoursFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "FEATURED";
            case 1:
                return "FOLLOWING";
            case 2:
                return "YOURS";
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}

