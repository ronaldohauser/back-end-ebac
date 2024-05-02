package main;

import cars.Car;

public abstract class CarFactory {
    public abstract Car createCar(String type);
}
