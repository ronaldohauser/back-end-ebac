// Main.java
package main;

import cars.Car;

public class Main {
    public static void main(String[] args) {
        criarEFabricarCarro("SEDAN");
        criarEFabricarCarro("SUV");
        criarEFabricarCarro("HATCH");
    }

    private static void criarEFabricarCarro(String tipo) {
        CarFactory fabrica = CarFactoryProducer.getFactory(tipo);

        if (fabrica != null) {
            Car carro = fabrica.createCar(tipo);

            System.out.println("Criando e fabricando um carro " + tipo + ":");
            System.out.println("---------------------------------------------");
            carro.design();
            carro.manufacture();
            System.out.println("---------------------------------------------\n");
        } else {
            System.out.println("Erro: Tipo de carro desconhecido - " + tipo);
        }
    }
}
