package com.kabasonic.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: diesel engine. Horse power: " + horsePower);
    }
}
