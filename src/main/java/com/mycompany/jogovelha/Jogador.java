/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogovelha;

import java.util.Scanner;

/**
 *
 * @author Gabriel Alves
 */
public class Jogador {

    private int[] tentativa = new int[2];
    private int jogador;
    public Scanner teclado = new Scanner(System.in);

    Jogador(int jogador) {
        this.jogador = jogador;
    }

    public void realizarTentativa(Tabuleiro tabuleiro) {
        tabuleiro.exibirTabuleiro();
        do {
            do {
                System.out.print("Linha: ");
                tentativa[0] = teclado.nextInt();


                if (tentativa[0] > 3 || tentativa[0] < 1) {
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                }

            } while (tentativa[0] > 3 || tentativa[0] < 1);

            do {
                System.out.print("Coluna: ");
                tentativa[1] = teclado.nextInt();

                if (tentativa[1] > 3 || tentativa[1] < 1) {
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                }

            } while (tentativa[1] > 3 || tentativa[1] < 1);
                
            

            tentativa[0]--;
            tentativa[1]--;
            tabuleiro.mudarTabuleiro(tentativa, jogador);
            if (!checarTentativa(tentativa, tabuleiro)) {
                System.out.println("Esse local já foi marcado. Tente outro.");
            }
        } while (!checarTentativa(tentativa, tabuleiro));
    }
    public boolean checarTentativa(int[] tentativa, Tabuleiro tabuleiro) {
        if (tabuleiro.verPosicao(tentativa) == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    

}
