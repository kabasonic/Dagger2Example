package com.kabasonic.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kabasonic.dagger2example.car.Car;
import com.kabasonic.dagger2example.dagger.CarComponent;
import com.kabasonic.dagger2example.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2, car3;
    //private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent
                .builder()
                .horsePower(150)
                .engineCapacity(200)
                .build();
        //car = carComponent.getCar();
        carComponent.inject(this);

        car1.drive();
        car2.drive();
        car3.drive();

    }
}