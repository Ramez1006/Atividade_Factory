package fabrica;

import personagem.Personagem;
import personagem.Robo;

/**
 * Fábrica concreta responsável por criar Robôs.
 * Concrete Creator no padrão Factory Method.
 */
public class FabricaRobo extends FabricaPersonagem {

    @Override
    public Personagem criarPersonagem() {
        return new Robo();
    }
}
