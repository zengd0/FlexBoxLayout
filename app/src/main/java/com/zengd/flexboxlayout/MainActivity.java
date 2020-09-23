package com.zengd.flexboxlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlexBoxLayout flexBoxLayout = (FlexBoxLayout) findViewById(R.id.flex_box_layout);
        flexBoxLayout.setHorizontalSpace(10);
        flexBoxLayout.setVerticalSpace(10);
    }
}
