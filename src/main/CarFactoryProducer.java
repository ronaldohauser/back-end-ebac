package main;

public class CarFactoryProducer {
    public static CarFactory getFactory(String type) {
        if (type.equalsIgnoreCase("SEDAN")) {
            return new SedanFactory();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUVFactory();
        } else if (type.equalsIgnoreCase("HATCH")) {
            return new HatchFactory();
        }
        return null;
    }
}