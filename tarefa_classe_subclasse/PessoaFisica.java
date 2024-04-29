class PessoaFisica extends Pessoa {
    private String cpf;
    private int idade;
    private double renda;
    
    public PessoaFisica(String nome, String cpf, int idade, double renda) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.renda = renda;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public double getRenda() {
        return renda;
    }
    
    @Override
    public void calcularAlgumaCoisa() {
        if (renda >= 430639.90) {
            System.out.println("Você está sujeito ao pagamento de Imposto de Renda.");
        } else {
            System.out.println("Você não está sujeito ao pagamento de Imposto de Renda.");
        }
    }
    
    @Override
    public double calcularImposto() {
        return idade * 10;
    }
}
