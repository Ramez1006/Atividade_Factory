package fabrica;

import personagem.Personagem;
import personagem.Robo;

public class FabricaRobo extends FabricaPersonagem {

    @Override
    public Personagem criarPersonagem() {
        return new Robo();
    }
}
