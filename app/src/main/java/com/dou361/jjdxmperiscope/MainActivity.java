package com.dou361.jjdxmperiscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dou361.periscope.FavorLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn_ok;
    private FavorLayout fl_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        fl_view = (FavorLayout) findViewById(R.id.fl_view);
        btn_ok.setOnClickListener(this);
        init();
    }

    private void init() {

    }

    @Override
    public void onClick(View v) {
        fl_view.addFavor();
    }
}
