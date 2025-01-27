package com.tianshaokai.study;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tianshaokai.common.utils.DisplayUtil;

import java.text.MessageFormat;

public class ScreenActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9;
    private TextView text10;
    private TextView text11;
    private TextView text12;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);
        text9 = findViewById(R.id.text9);
        text10 = findViewById(R.id.text10);
        text11 = findViewById(R.id.text11);
        text12 = findViewById(R.id.text12);

        DisplayMetrics metrics = DisplayUtil.getDisplayMetrics(this);

        text1.setText(MessageFormat.format("densityDpi: {0}",    metrics.densityDpi));
        text2.setText(MessageFormat.format("density: {0}",       metrics.density));
        text3.setText(MessageFormat.format("scaledDensity: {0}", metrics.scaledDensity));
        text4.setText(MessageFormat.format("widthPixels: {0}",   metrics.widthPixels));
        text5.setText(MessageFormat.format("heightPixels: {0}",  metrics.heightPixels));
        text6.setText(MessageFormat.format("xdpi: {0}",          metrics.xdpi));
        text7.setText(MessageFormat.format("ydpi: {0}",          metrics.ydpi));


        DisplayMetrics outMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(outMetrics);

        text8.setText(MessageFormat.format("widthPixels 2 : {0}",   outMetrics.widthPixels));
        text9.setText(MessageFormat.format("heightPixels 2 : {0}",  outMetrics.heightPixels));

        text10.setText(MessageFormat.format("smallestScreenWidthDp : {0}",   getResources().getConfiguration().smallestScreenWidthDp));
        text11.setText(MessageFormat.format("screenWidthDp : {0}",   getResources().getConfiguration().screenWidthDp));
        text12.setText(MessageFormat.format("screenHeightDp : {0}",   getResources().getConfiguration().screenHeightDp));

    }
}
