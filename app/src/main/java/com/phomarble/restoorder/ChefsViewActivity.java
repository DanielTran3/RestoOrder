package com.phomarble.restoorder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

public class ChefsViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("ChefsActivity", "+++ ON PAUSE +++");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("ChefsActivity", "+++ ON RESUME +++");
    }
}
