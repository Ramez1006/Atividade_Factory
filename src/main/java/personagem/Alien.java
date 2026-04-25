package personagem;


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
