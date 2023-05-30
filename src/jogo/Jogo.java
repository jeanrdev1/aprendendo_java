package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int pontosEu = 0;
        int pontosPc = 0;

        System.out.println("JOGO: Pedra Papel Tesoura");

        System.out.print("Quantas rodadas deseja jogar? ");
        int qt = sc.nextInt();

        for (int i = 0; i < qt; i++) {
            System.out.println("0 - Pedra / 1 - Papel / 2 - Tesoura");
            int opEu = sc.nextInt();
            // Jogo randomico do computador
            int opPc = rnd.nextInt(3);

            // Se as duas jogadas forem iguais da empate e ninguem ganha ponto
            if (opEu == opPc) {
                System.out.println("Empate!");
            } else if (opEu == 0) {
                // Entra quando eu jogar Pedra
                if (opPc == 1) {
                    // E o pc jogar Papel
                    pontosPc++;
                    System.out.println("Ponto do PC");
                } else if (opPc == 2) {
                    // Ou e o pc jogar Tesoura
                    pontosEu++;
                    System.out.println("Ponto do SEU");
                }
            } else if (opEu == 1) {
                // Entra quando eu jogar Papel
                if (opPc == 0) {
                    // E o pc jogar Pedra
                    pontosEu++;
                    System.out.println("Ponto do SEU");
                } else if (opPc == 2) {
                    // E o pc jogar Tesoura
                    pontosPc++;
                    System.out.println("Ponto do PC");
                }
            } else if (opEu == 2) {
                // Entra quando eu jogar Tesoura
                if (opPc == 0) {
                    // E o pc jogar Pedra
                    pontosPc++;
                    System.out.println("Ponto do PC");
                } else if (opPc == 1) {
                    // E o pc jogar Papel
                    pontosEu++;
                    System.out.println("Ponto do SEU");
                }
            }

            // Imprime as jogadas
            System.out.printf("Pc: %s  Eu: %s\n", getOpcao(opPc), getOpcao(opEu));
        }

        System.out.println("Placar Final");
        if (pontosPc > pontosEu) {
            System.out.println("PC: " + pontosPc);
            System.out.println("EU: " + pontosEu);
        } else {
            System.out.println("EU: " + pontosEu);
            System.out.println("PC: " + pontosPc);
        }

        sc.close();
    }

    static String getOpcao(int value) {
        switch (value) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            default:
                return null;
        }
    }
}
