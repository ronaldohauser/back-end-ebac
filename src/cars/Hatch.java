package cars;

public class Hatch implements Car {
    @Override
    public void design() {
        System.out.println("Projetando um Hatch versátil.");
    }

    @Override
    public void manufacture() {
        System.out.println("Fabricando um Hatch ágil.");
    }
}