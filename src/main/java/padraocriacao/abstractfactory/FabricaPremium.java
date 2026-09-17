package padraocriacao.abstractfactory;

public class FabricaPremium implements FabricaAbstrata {

    @Override
    public Filme createFilme() {
        return new FilmePremium();
    }

    @Override
    public Serie createSerie() {
        return new SeriePremium();
    }
}