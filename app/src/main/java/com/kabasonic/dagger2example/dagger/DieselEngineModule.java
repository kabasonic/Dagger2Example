package com.kabasonic.dagger2example.dagger;

import com.kabasonic.dagger2example.car.DieselEngine;
import com.kabasonic.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    int getHorsePower(){
       return horsePower;
    }

    @Provides
    Engine getProvideEngine(DieselEngine engine){
        return engine;
    }


}
