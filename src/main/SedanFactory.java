package main;

import cars.Car;
import cars.Sedan;

public class SedanFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        return new Sedan();
    }
}