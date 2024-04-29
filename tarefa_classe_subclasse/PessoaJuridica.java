class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private double faturamentoAnual;
    
    public PessoaJuridica(String nome, String cnpj, String razaoSocial, double faturamentoAnual) {
        super(nome);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }
    
    @Override
    public void calcularAlgumaCoisa() {
        if (faturamentoAnual >= 28559.70) {
            System.out.println("Sua empresa atingiu o faturamento mínimo para pessoa jurídica.");
        } else {
            System.out.println("Sua empresa ainda não atingiu o faturamento mínimo para pessoa jurídica.");
        }
    }
    
    @Override
    public double calcularImposto() {
        return 5000;
    }
}
