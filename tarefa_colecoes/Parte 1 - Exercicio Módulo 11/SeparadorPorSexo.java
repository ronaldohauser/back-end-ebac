import java.util.Scanner;
import java.util.ArrayList;

public class SeparadorPorSexo {
    public static void main(String[] args) {
        // Scan para receber oss dados
        Scanner scanner = new Scanner(System.in);
        
        // Lista que armazena e agrupa masculino e feminino
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        
        // Solicita nome e sexo
        System.out.println("Digite os nomes seguidos pelo sexo (M para masculino, F para feminino), separados por espaço (*não utilizar virgula*):");
        System.out.println("Exemplo: Ronaldo M Aline F Tabata F (quando terminar, digite 'fim' e confirme com enter)");
        
        // Loop de leitura de dados até que 'fim' seja digitado
        while (true) {
            // Lê o dado informado
            String entrada = scanner.nextLine();
            
            // Aguarda que seja difitado 'fim' para encerrar
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            
            // Separador de nomes e sexos
            String[] partes = entrada.split(" ");
            
            // Agrupa os nomes segundo a correspondência do sexo
            for (int i = 0; i < partes.length - 1; i += 2) {
                String nome = partes[i];
                String sexo = partes[i + 1];
                
                if (sexo.equalsIgnoreCase("M")) {
                    masculino.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo informado inválido para o nome '" + nome + "'. Por favor, digite 'M' para masculino ou 'F' para feminino.");
                }
            }
        }
        
        // Imprime os nomes separados pelo grupo
        System.out.println("Grupo masculino:");
        masculino.forEach(System.out::println);
        
        System.out.println("\nGrupo feminino:");
        feminino.forEach(System.out::println);
        
        // Encerra o scan
        scanner.close();
    }
}
