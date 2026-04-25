package personagem;


public interface Personagem {

    //Executa o ataque característico do personagem. 
    void atacar();

    //Executa o movimento característico do personagem. 
    void movimentar();

    // Retorna o nome/tipo do personagem.
    String getNome();
}
