package com.kabasonic.dagger2example.dagger;

import com.kabasonic.dagger2example.car.Rims;
import com.kabasonic.dagger2example.car.Tires;
import com.kabasonic.dagger2example.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        return new Tires();
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
       return new Wheels(rims,tires);
    }


}
