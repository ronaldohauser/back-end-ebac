import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenadorDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.println("Digite cada nome a ser ordenado na lista. Os nomes devem começar com letra maiúscula. Você pode separa-los por virgula ou digitar um nome por linha. Ao terminar, digite 'fim':");
        
        String entrada;
        while (!(entrada = scanner.nextLine()).equalsIgnoreCase("fim")) {
            String[] partes = entrada.split(",");
            
            for (String parte : partes) {
                String nome = parte.trim();
                if (Character.isUpperCase(nome.charAt(0))) {
                    if (nomes.contains(nome)) {
                        System.out.println("O nome '" + nome + "' já foi adicionado à lista.");
                        System.out.println("Deseja adicionar mesmo assim? (Digite 'sim' ou 'nao'):");
                        String resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("sim")) {
                            nomes.add(nome);
                        } else {
                            System.out.println("O nome '" + nome + "' não foi adicionado à lista.");
                        }
                    } else {
                        nomes.add(nome);
                    }
                } else {
                    System.out.println("O nome '" + nome + "' não foi adicionado à lista porque não começa com letra maiúscula. Faça a correção ou tente outro nome:");
                }
            }
        }
        
        Collections.sort(nomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
