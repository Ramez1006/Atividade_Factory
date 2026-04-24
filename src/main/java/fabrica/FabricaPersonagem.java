package fabrica;

import personagem.Personagem;

/**
 * Classe abstrata Creator do padrão Factory Method.
 *
 * Define o método de fábrica (criarPersonagem) que as subclasses devem
 * implementar, além de operações padrão que utilizam o personagem criado.
 */
public abstract class FabricaPersonagem {

    /**
     * Factory Method — subclasses decidem qual personagem instanciar.
     *
     * @return um novo personagem do tipo correspondente à fábrica.
     */
    public abstract Personagem criarPersonagem();

    /**
     * Operação padrão: cria o personagem e o apresenta ao jogo.
     * Usa o Factory Method internamente — demonstra o template method.
     */
    public void iniciarPersonagem() {
        Personagem p = criarPersonagem();
        System.out.println("==============================");
        System.out.println("Personagem criado: " + p.getNome());
        System.out.println("------------------------------");
        p.movimentar();
        p.atacar();
        System.out.println("==============================\n");
    }
}
