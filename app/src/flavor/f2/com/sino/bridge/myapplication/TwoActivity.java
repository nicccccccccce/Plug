package com.sino.bridge.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by user on 2017/1/10.
 */

public class TwoActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_two);
//        CopyJarUtil.releaseAssets();
    }
}
