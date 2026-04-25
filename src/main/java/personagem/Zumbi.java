package personagem;

public class Zumbi implements Personagem {

    @Override
    public void atacar() {
        System.out.println("[Zumbi] Morde a vítima com força sobrenatural!");
    }

    @Override
    public void movimentar() {
        System.out.println("[Zumbi] Arrasta os pés lentamente, gemendo...");
    }

    @Override
    public String getNome() {
        return "Zumbi";
    }
}
