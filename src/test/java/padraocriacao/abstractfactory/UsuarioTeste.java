package padraocriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTeste {

    @Test
    void deveExibirFilmeBasico() {
        FabricaAbstrata fabrica = new FabricaBasica();
        Usuario usuario = new Usuario(fabrica);
        assertEquals("Filme disponível em HD", usuario.exibirFilme());
    }

    @Test
    void deveExibirFilmePremium() {
        FabricaAbstrata fabrica = new FabricaPremium();
        Usuario usuario = new Usuario(fabrica);
        assertEquals("Filme disponível em 4K", usuario.exibirFilme());
    }

    @Test
    void deveExibirSerieBasica() {
        FabricaAbstrata fabrica = new FabricaBasica();
        Usuario usuario = new Usuario(fabrica);
        assertEquals("Série com anúncios", usuario.exibirSerie());
    }

    @Test
    void deveExibirSeriePremium() {
        FabricaAbstrata fabrica = new FabricaPremium();
        Usuario usuario = new Usuario(fabrica);
        assertEquals("Série sem anúncios", usuario.exibirSerie());
    }

}
