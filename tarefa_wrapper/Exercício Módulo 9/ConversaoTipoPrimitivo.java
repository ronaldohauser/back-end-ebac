import java.util.Scanner;

public class ConversaoTipoPrimitivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor numérico:");
        
        if (scanner.hasNextDouble()) {
            double valorPrimitivo = scanner.nextDouble();
            Double valorWrapper = valorPrimitivo;
            System.out.println("O valor após a conversão para o tipo wrapper é: " + valorWrapper);
        } else {
            System.out.println("Por favor, insira um valor numérico válido.");
        }
        
        scanner.close();
    }
}
