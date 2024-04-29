public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Ronaldo", "123.456.789-10", 30, 100000);
        
        System.out.println("Nome PF: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Idade: " + pessoaFisica.getIdade());
        
        pessoaFisica.calcularAlgumaCoisa();
        
        double impostoPessoaFisica = pessoaFisica.calcularImposto();
        System.out.println("Imposto PF: R$" + impostoPessoaFisica);
        
        System.out.println();
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica("EBAC Ensino a Distancia", "12.345.678/0001-90", "EBAC Ensino a Distancia", 1000000);
        
        System.out.println("Nome PJ: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Razão Social: " + pessoaJuridica.getRazaoSocial());
        
        pessoaJuridica.calcularAlgumaCoisa();
        
        double impostoPessoaJuridica = pessoaJuridica.calcularImposto();
        System.out.println("Imposto PJ: R$" + impostoPessoaJuridica);
    }
}
