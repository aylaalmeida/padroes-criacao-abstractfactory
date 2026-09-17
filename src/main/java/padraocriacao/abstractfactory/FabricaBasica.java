package padraocriacao.abstractfactory;

public class FabricaBasica implements FabricaAbstrata {

    @Override
    public Filme createFilme() {
        return new FilmeBasico();
    }

    @Override
    public Serie createSerie() {
        return new SerieBasica();
    }
}