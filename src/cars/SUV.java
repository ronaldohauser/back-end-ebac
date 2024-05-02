package cars;

public class SUV implements Car {
    @Override
    public void design() {
        System.out.println("Projetando um SUV robusto.");
    }

    @Override
    public void manufacture() {
        System.out.println("Fabricando um SUV resistente.");
    }
}
