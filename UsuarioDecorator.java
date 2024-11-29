public class UsuarioDecorator implements Publicavel {
    private Publicavel usuario;
    private Publicavel estrategiaPublicacao;

    public UsuarioDecorator(Publicavel usuario) {
        this.usuario = usuario;
    }

    // Método para alterar a estratégia de publicação
    public void setEstrategiaPublicacao(Publicavel estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar(); // Usa a estratégia de publicação definida
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}
