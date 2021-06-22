package com.xmethod.usage;

import android.app.Application;

import com.xmethod.xycode.Xy;

/**
 * @author：thisfeng
 * @time 6/22/21 11:13
 */
public class App  extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Xy.init(this, false);

    }
}
