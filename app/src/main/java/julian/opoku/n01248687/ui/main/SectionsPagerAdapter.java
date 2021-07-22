package julian.opoku.n01248687.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import julian.opoku.n01248687.JOFragment;
import julian.opoku.n01248687.JulianFragment;
import julian.opoku.n01248687.N01248687Fragment;
import julian.opoku.n01248687.OpokuFragment;
import julian.opoku.n01248687.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;
       switch (position) {
           case 0:
               fragment = new JulianFragment();
               break;
           case 1:
               fragment = new OpokuFragment();
               break;
           case 2:
               fragment = new N01248687Fragment();
               break;
           case 3:
               fragment = new JOFragment();

       }
       return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}