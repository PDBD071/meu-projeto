public class Main {
    public static void main(String[] args) {
        // Criando um objeto do tipo Autor, que implementa Publicavel
        Publicavel autor = new UsuarioDecorator(new Autor());

        // Definindo a estratégia de publicação como "Livro"
        Publicavel estrategiaLivro = new EstrategiaPublicacaoLivro();
        ((UsuarioDecorator) autor).setEstrategiaPublicacao(estrategiaLivro);  // Configurando a estratégia
        autor.publicar();  // Output: Publicando um livro...

        // Alterando a estratégia para "Artigo"
        Publicavel estrategiaArtigo = new EstrategiaPublicacaoArtigo();
        ((UsuarioDecorator) autor).setEstrategiaPublicacao(estrategiaArtigo);  // Configurando a nova estratégia
        autor.publicar();  // Output: Publicando um artigo...
    }
}
