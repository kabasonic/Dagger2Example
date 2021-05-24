package com.kabasonic.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    void remoteEnable(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, driver + " drive " + this);
    }

}
