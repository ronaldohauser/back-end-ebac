public class Livro {
    // Propriedades
    String titulo; // Título
    String autor; // Autor(a)
    int anoPublicacao; // Ano
    int numPaginas; // Número de páginas
    
    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
    }
    
    // Método
    public void exibirInformacoes() {
        System.out.println("Sobre o livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Número de Páginas: " + numPaginas);
    }

    // Representação do objeto Livro + propriedades + métodos
    
    public static void main(String[] args) {
        // Instância da classe Livro
        Livro meuLivro = new Livro("Grande Sertão: Veredas", "Guimarães Rosa", 1956, 600);
        
        // Exibindo as informações
        meuLivro.exibirInformacoes();
    }
}
