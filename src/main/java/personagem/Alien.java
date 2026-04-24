package personagem;

/**
 * Personagem concreto: Alien.
 * Produto concreto no padrão Factory Method.
 */
public class Alien implements Personagem {

    @Override
    public void atacar() {
        System.out.println("[Alien] Lança feixes de plasma alienígena!");
    }

    @Override
    public void movimentar() {
        System.out.println("[Alien] Levita silenciosamente pelo ambiente.");
    }

    @Override
    public String getNome() {
        return "Alien";
    }
}
