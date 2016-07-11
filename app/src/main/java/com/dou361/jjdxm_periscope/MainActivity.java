package com.dou361.jjdxm_periscope;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dou361.periscope.FavorLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn_ok;
    private FavorLayout fl_view;
    private Handler mHanlder = new Handler();
    private AutoPlayRunnable mAutoPlayRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        fl_view = (FavorLayout) findViewById(R.id.fl_view);
        btn_ok.setOnClickListener(this);
        mAutoPlayRunnable = new AutoPlayRunnable();
        init();
    }

    private void init() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mAutoPlayRunnable != null) {
            mAutoPlayRunnable.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mAutoPlayRunnable != null) {
            mAutoPlayRunnable.stop();
        }
    }

    @Override
    public void onClick(View v) {
        fl_view.addFavor();
        fl_view.addFavor();
    }


    private class AutoPlayRunnable implements Runnable {
        private int AUTO_PLAY_INTERVAL = 2000;
        private boolean mShouldAutoPlay;

        public AutoPlayRunnable() {
            mShouldAutoPlay = false;
        }

        public void start() {
            if (!mShouldAutoPlay) {
                mShouldAutoPlay = true;
                mHanlder.removeCallbacks(this);
                mHanlder.postDelayed(this, AUTO_PLAY_INTERVAL);
            }
        }

        public void stop() {
            if (mShouldAutoPlay) {
                mHanlder.removeCallbacks(this);
                mShouldAutoPlay = false;
            }
        }

        @Override
        public void run() {
            if (mShouldAutoPlay) {
                mHanlder.removeCallbacks(this);
                if (fl_view != null) {
                    fl_view.addFavor();
                    fl_view.addFavor();
                }
                mHanlder.postDelayed(this, AUTO_PLAY_INTERVAL);
            }
        }
    }
}
