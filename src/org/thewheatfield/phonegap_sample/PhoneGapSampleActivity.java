package org.thewheatfield.phonegap_sample;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;
public class PhoneGapSampleActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setIntegerProperty("loadUrlTimeoutValue", 60000);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}