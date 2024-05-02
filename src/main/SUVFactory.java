package main;

import cars.Car;
import cars.SUV;

public class SUVFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        return new SUV();
    }
}
