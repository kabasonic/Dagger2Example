package com.kabasonic.dagger2example.dagger;

import com.kabasonic.dagger2example.car.Engine;
import com.kabasonic.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
