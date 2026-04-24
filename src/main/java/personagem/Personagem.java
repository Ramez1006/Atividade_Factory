package personagem;

/**
 * Interface que define o contrato para todos os personagens do jogo.
 * Padrão Factory Method — produto abstrato.
 */
public interface Personagem {

    /** Executa o ataque característico do personagem. */
    void atacar();

    /** Executa o movimento característico do personagem. */
    void movimentar();

    /** Retorna o nome/tipo do personagem. */
    String getNome();
}
