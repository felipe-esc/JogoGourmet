/*
    @Author: Felipe Escórcio de Sousa
    @Email: felipe.escorciosousa@gmail.com

    @Description: programa que implementa um joquinho simples de adivinhação em que o programa tenta adivinhar
    em um prato que o usuário pensou. Ele começa simples com apenas duas respostas possíveis, mas vai se incre-
    mentando conforme o usuário vai jogando novamente. Os dados das respostas possíveis são guardados em uma ár-
    vore binária de decisão simples já que o usuário só responde 'Sim' ou 'Não' pras perguntas de forma que nas
    folhas estão guardadas os pratos do conhecimento do programa e nos nós intermediários ficam as característi-
    cas que os diferem.

    Ideias para melhorar:
        - implementar uma interface
        - salvar e recuperar dados
 */

import gourmetGame.classes.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.newGame();
    }
}