package io.github.mhayashi.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Masahiro Hayashi on 11/29/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
