import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenadorDeNomes {
    public static void main(String[] args) {
        // Scan que recebe os dados
        Scanner scanner = new Scanner(System.in);
        
        // Lista de armazenamento de nomes
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Digite os nomes, um por linha (quando terminar, digite 'fim' para encerrar):");
        
        // Loop que aguarda digitar 'fim' para encerrar
        while (true) {
            // Leitor dos dados informados
            String nome = scanner.nextLine();
            
            // Verificador que reconhece 'fim' quando digitado
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            
            // Check de letra maiúscula
            if (Character.isUpperCase(nome.charAt(0))) {
                // Adiciona os nomes na lista
                nomes.add(nome);
            } else {
                System.out.println("Por favor, insira um nome começando com letra maiúscula.");
            }
        }
        
        // Oedenador
        Collections.sort(nomes);
        
        // Imprime os nomes ordenados no console
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        // Fim do scan
        scanner.close();
    }
}
