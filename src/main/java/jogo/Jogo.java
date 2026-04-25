package jogo;

import fabrica.FabricaPersonagem;
import fabrica.FabricaZumbi;
import fabrica.FabricaRobo;
import fabrica.FabricaAlien;
import personagem.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private final List<FabricaPersonagem> fabricas = new ArrayList<>();

    public Jogo() {
        // Registra as fábricas disponíveis
        fabricas.add(new FabricaZumbi());
        fabricas.add(new FabricaRobo());
        fabricas.add(new FabricaAlien());
    }

    
     //Inicia o jogo criando e exibindo cada tipo de personagem.
    
    public void iniciar() {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║     PLATAFORMA DE JOGOS — v1.0   ║");
        System.out.println("║   Padrão de Projeto: Factory Method  ║");
        System.out.println("╚══════════════════════════════════╝\n");

        for (FabricaPersonagem fabrica : fabricas) {
            fabrica.iniciarPersonagem();
        }

        System.out.println(">>> Demonstração direta de comportamentos <<<\n");

        // Também é possível usar os personagens diretamente
        Personagem zumbi = new FabricaZumbi().criarPersonagem();
        Personagem robo  = new FabricaRobo().criarPersonagem();
        Personagem alien = new FabricaAlien().criarPersonagem();

        List<Personagem> time = List.of(zumbi, robo, alien);

        System.out.println("--- Todos atacando ao mesmo tempo ---");
        for (Personagem p : time) {
            p.atacar();
        }

        System.out.println("\n--- Todos se movimentando ---");
        for (Personagem p : time) {
            p.movimentar();
        }

        System.out.println("\nJogo encerrado.");
    }
}
