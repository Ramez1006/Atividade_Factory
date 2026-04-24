package personagem;

/**
 * Personagem concreto: Robô.
 * Produto concreto no padrão Factory Method.
 */
public class Robo implements Personagem {

    @Override
    public void atacar() {
        System.out.println("[Robô] Dispara raios laser de alta precisão!");
    }

    @Override
    public void movimentar() {
        System.out.println("[Robô] Desloca-se mecanicamente em velocidade constante.");
    }

    @Override
    public String getNome() {
        return "Robô";
    }
}
