/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogovelha;

/**
 *
 * @author Gabriel Alves
 */
public class Tabuleiro {
    private int[][] tabuleiro = new int[3][3];

    public Tabuleiro(int [][]tabuleiro) {
        this.tabuleiro=tabuleiro;
    }

    public Tabuleiro() {
    }
    
    

    public int[][] gerarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; linha < 3; linha++) {
                tabuleiro[linha][coluna] = 0;
            }
        }return tabuleiro;
    }

    public void exibirTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == -1) {
                    System.out.print(" X ");
                } else if (tabuleiro[linha][coluna] == 1) {
                    System.out.print(" O ");
                } else {
                    System.out.print("   ");
                }
                if (coluna == 0 || coluna == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public int verPosicao(int[] tentativa) {
        return tabuleiro[tentativa[0]][tentativa[1]];
    }

    public void mudarTabuleiro(int[] tentativa, int jogador) {
        if (jogador == 1) {
            tabuleiro[tentativa[0]][tentativa[1]] = 1;
        } else {
            tabuleiro[tentativa[0]][tentativa[1]] = 2;
        }
        exibirTabuleiro();
    }

    public int checarLinhas() {
        for (int linha = 0; linha < 3; linha++) {
            if (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2] == 3) {
                return 1;
            } else if (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2] == 6) {
                return 2;
            }
        }
        return 0;
    }

    public int checarColunas() {
        for (int coluna = 0; coluna < 3; coluna++) {
            if (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna] == 3) {
                return 1;
            } else if (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna] == 6) {
                return 2;
            }
        }
        return 0;
    }

    public int checarDiagonais() {
        if (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == 3) {
            return 1;
        } else if (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == 6) {
            return 2;
        } else if (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0] == 3) {
            return 1;
        } else if (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0] == 6) {
            return 2;
        }

        return 0;
    }

    public boolean finalizarJogo() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
