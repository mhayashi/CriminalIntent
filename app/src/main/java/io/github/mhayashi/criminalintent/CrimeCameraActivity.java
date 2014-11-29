package io.github.mhayashi.criminalintent;

import android.support.v4.app.Fragment;
import android.widget.ImageButton;

/**
 * Created by Masahiro Hayashi on 11/30/14.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
