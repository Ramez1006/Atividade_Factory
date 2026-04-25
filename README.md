# Atividade Factory Method

Este projeto Java Maven demonstra a implementação do padrão de projeto **Factory Method** para a criação de diferentes tipos de personagens em um jogo.

## Padrão de Projeto: Factory Method

O padrão Factory Method é um padrão de projeto criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Neste projeto, ele é aplicado da seguinte forma:

*   **`Personagem` (Produto Abstrato)**: Uma interface que define o contrato para todos os personagens (e.g., `atacar()`, `movimentar()`, `getNome()`).
*   **`Alien`, `Robo`, `Zumbi` (Produtos Concretos)**: Classes que implementam a interface `Personagem`, cada uma com suas características e comportamentos específicos.
*   **`FabricaPersonagem` (Criador Abstrato)**: Uma classe abstrata que declara o método de fábrica `criarPersonagem()`, que retorna um objeto do tipo `Personagem`. Ela também define uma operação padrão (`iniciarPersonagem()`) que utiliza o personagem criado.
*   **`FabricaAlien`, `FabricaRobo`, `FabricaZumbi` (Criadores Concretos)**: Subclasses de `FabricaPersonagem` que implementam o método `criarPersonagem()` para instanciar e retornar um tipo específico de `Personagem` (e.g., `FabricaAlien` cria um `Alien`).

Essa estrutura permite adicionar novos tipos de personagens ao jogo sem modificar o código existente das fábricas ou da lógica principal do jogo, seguindo o princípio Open/Closed.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Maven:

```
. (raiz do projeto)
├── pom.xml
└── src
    └── main
        └── java
            ├── com
            │   └── example
            │       └── Main.java
            ├── fabrica
            │   ├── FabricaAlien.java
            │   ├── FabricaPersonagem.java
            │   ├── FabricaRobo.java
            │   └── FabricaZumbi.java
            ├── jogo
            │   └── Jogo.java
            └── personagem
                ├── Alien.java
                ├── Personagem.java
                ├── Robo.java
                └── Zumbi.java
```

### Descrição dos Pacotes e Classes Principais:

*   **`com.example.Main`**: Ponto de entrada da aplicação. Cria uma instância de `Jogo` e inicia a demonstração.
*   **`fabrica`**: Contém as classes abstratas e concretas das fábricas de personagens.
    *   `FabricaPersonagem.java`: Classe abstrata que define o método de fábrica.
    *   `FabricaAlien.java`, `FabricaRobo.java`, `FabricaZumbi.java`: Implementações concretas das fábricas.
*   **`jogo`**: Contém a lógica principal do jogo.
    *   `Jogo.java`: Gerencia as fábricas e demonstra a criação e interação com os personagens.
*   **`personagem`**: Contém a interface `Personagem` e suas implementações concretas.
    *   `Personagem.java`: Interface para todos os personagens.
    *   `Alien.java`, `Robo.java`, `Zumbi.java`: Implementações de personagens específicos.

## Como Compilar e Executar

Para compilar e executar este projeto, você precisará ter o **Apache Maven** e o **Java Development Kit (JDK) 11 ou superior** instalados em sua máquina.


## Referências

*   [Factory Method Pattern - Refactoring.Guru](https://refactoring.guru/design-patterns/factory-method)
*   [Apache Maven Official Website](https://maven.apache.org/)
*   [Oracle JDK Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/index.html)
