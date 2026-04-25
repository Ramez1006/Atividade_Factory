package fabrica;

import personagem.Personagem;
import personagem.Zumbi;

public class FabricaZumbi extends FabricaPersonagem {

    @Override
    public Personagem criarPersonagem() {
        return new Zumbi();
    }
}
