package fabrica;

import personagem.Personagem;
import personagem.Alien;

/**
 * Fábrica concreta responsável por criar Aliens.
 * Concrete Creator no padrão Factory Method.
 */
public class FabricaAlien extends FabricaPersonagem {

    @Override
    public Personagem criarPersonagem() {
        return new Alien();
    }
}
