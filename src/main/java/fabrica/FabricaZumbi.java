package fabrica;

import personagem.Personagem;
import personagem.Zumbi;

/**
 * Fábrica concreta responsável por criar Zumbis.
 * Concrete Creator no padrão Factory Method.
 */
public class FabricaZumbi extends FabricaPersonagem {

    @Override
    public Personagem criarPersonagem() {
        return new Zumbi();
    }
}
