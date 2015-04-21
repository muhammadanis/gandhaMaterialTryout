

package io.leftshift.materialtryout.activities;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageButton;

import io.leftshift.materialtryout.R;

public class DialerSampleActivity extends ActionBarActivity  {

    private int screenWidth;
    private ImageButton fabButton;
    private FrameLayout dialerKeysContainer;
    private float absolutefabPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);

        configureToolbar();
    }

    private void configureToolbar() {

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.activity_dialer_toolbar);
        mainToolbar.setTitleTextColor(getResources().getColor(R.color.theme_dialer_accent));
        setSupportActionBar(mainToolbar);
        getSupportActionBar().setTitle("Dialer");
    }
}
