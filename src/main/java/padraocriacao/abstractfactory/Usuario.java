package padraocriacao.abstractfactory;

public class Usuario {

    private Filme filme;
    private Serie serie;

    public Usuario(FabricaAbstrata fabrica) {
        this.filme = fabrica.createFilme();
        this.serie = fabrica.createSerie();
    }

    public String exibirFilme() {
        return this.filme.exibir();
    }

    public String exibirSerie() {
        return this.serie.exibir();
    }

}

