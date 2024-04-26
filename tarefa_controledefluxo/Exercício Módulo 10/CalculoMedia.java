import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        // Scan que recebe as notas
        Scanner scanner = new Scanner(System.in);
        
        // Solicita as notas
        System.out.println("Digite as quatro notas do(a) aluno(a):");
        
        // Lê as notas fornecidas
        double nota1 = lerNota(scanner);
        double nota2 = lerNota(scanner);
        double nota3 = lerNota(scanner);
        double nota4 = lerNota(scanner);
        
        // Cálculo da média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Resultado da média das notas
        System.out.println("A média das quatro notas é: " + media);
        
        // Se média maior ou igual a 7
        if (media >= 7) {
            System.out.println("Resultado: aprovado(a)");
            // Se média maior ou igual a 5
        } else if (media >= 5) { 
            System.out.println("Resultado: recuperação");
            // Se média menor que 5
        } else { 
            System.out.println("Resultado: reprovado(a)");
        }
        
        // Fim do scan
        scanner.close();
    }
    
    // Método que lê uma nota informada
    private static double lerNota(Scanner scanner) {
        while (true) {
            System.out.print("Informe uma nota: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); 
            }
        }
    }
}
