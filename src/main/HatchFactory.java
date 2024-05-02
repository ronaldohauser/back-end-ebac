package main;

import cars.Car;
import cars.Hatch;

public class HatchFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        return new Hatch();
    }
}