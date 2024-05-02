package cars;

public class Sedan implements Car {
    @Override
    public void design() {
        System.out.println("Projetando um Sedan elegante.");
    }

    @Override
    public void manufacture() {
        System.out.println("Fabricando um Sedan de alta qualidade.");
    }
}
