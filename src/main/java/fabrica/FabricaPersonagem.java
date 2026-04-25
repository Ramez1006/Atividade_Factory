package fabrica;

import personagem.Personagem;



public abstract class FabricaPersonagem {

    /**
     * Factory Method — subclasses decidem qual personagem instanciar.
     *
     * @return um novo personagem do tipo correspondente à fábrica.
     */
    public abstract Personagem criarPersonagem();

  

    
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
