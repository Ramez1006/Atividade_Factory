package fabrica;

import personagem.Personagem;
import personagem.Alien;


public class FabricaAlien extends FabricaPersonagem {

    @Override
    public Personagem criarPersonagem() {
        return new Alien();
    }
}
