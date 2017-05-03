package com.phomarble.restoorder;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CustomItemDialog extends Dialog implements android.view.View.OnClickListener {

    public Activity activity;
    public Dialog dialog;
    public Button confirm, cancel;

    public CustomItemDialog(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_custom_item_dialog);
    }

    @Override
    public void onClick(View view) {
        
    }
}
