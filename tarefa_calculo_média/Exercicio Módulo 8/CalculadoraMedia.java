import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        // Recebendo as notas
        Scanner scanner = new Scanner(System.in);
        
        // Armazenando as notas
        double nota1, nota2, nota3, nota4;
        
        // Inserir 4 notas
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();
        
        // Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Resultado no console
        System.out.println("A média das 4 notas notas é: " + media);
        
        // Fim do scan
        scanner.close();
    }
}
