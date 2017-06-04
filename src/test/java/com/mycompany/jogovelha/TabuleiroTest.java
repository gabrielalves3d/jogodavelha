/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogovelha;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel Alves
 */
public class TabuleiroTest {
    
    

    /**
     * Test of gerarTabuleiro method, of class Tabuleiro.
     */
    @Test
    public void testGerarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.gerarTabuleiro();
        int soma = 0;
        for(int linha = 0; linha<3; linha++){
            for(int coluna =0; coluna<3; coluna++){
                int tentativa [] = {linha, coluna};
                soma+=tabuleiro.getPosicao(tentativa);
            }
        }
        assertEquals(soma, 0);
    }

    /**
     * Test of exibirTabuleiro method, of class Tabuleiro.
     */
    @Test
    public void testExibirTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa [] = {1, 2};
        int jogador = 1;
        tabuleiro.setPosicao(tentativa, jogador);
        assertEquals(tabuleiro.getPosicao(tentativa), -1);

        
    }
    

    /**
     * Test of setPosicao method, of class Tabuleiro.
     */
    @Test
    public void testSetPosicao() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa [] = {1, 2};
        int jogador = 1;
        tabuleiro.setPosicao(tentativa, jogador);
        assertEquals(tabuleiro.getPosicao(tentativa), -1);
    }

    /**
     * Test of checarLinhas method, of class Tabuleiro.
     */
    @Test
    public void testChecarLinhas() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {0, 1};
        int tentativa3 [] = {0, 2};
        int jogador = 1;
        tabuleiro.setPosicao(tentativa1, jogador);
        tabuleiro.setPosicao(tentativa2, jogador);
        tabuleiro.setPosicao(tentativa3, jogador);

        assertEquals(tabuleiro.checarLinhas(), -1);
    }

    /**
     * Test of checarColunas method, of class Tabuleiro.
     */
    @Test
    public void testChecarColunas() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 0};
        int tentativa3 [] = {2, 0};
        int jogador = 1;
        tabuleiro.setPosicao(tentativa1, jogador);
        tabuleiro.setPosicao(tentativa2, jogador);
        tabuleiro.setPosicao(tentativa3, jogador);

        assertEquals(tabuleiro.checarColunas(), -1);
        
    }

    /**
     * Test of checarDiagonais method, of class Tabuleiro.
     */
    @Test
    public void testChecarDiagonais() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 1};
        int tentativa3 [] = {2, 2};
        int jogador = 1;
        tabuleiro.setPosicao(tentativa1, jogador);
        tabuleiro.setPosicao(tentativa2, jogador);
        tabuleiro.setPosicao(tentativa3, jogador);

        assertEquals(tabuleiro.checarDiagonais(), -1);
    }

    /**
     * Test of finalizarJogo method, of class Tabuleiro.
     */
    @Test
    public void testFinalizarJogo() {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.gerarTabuleiro();
        assertEquals(tabuleiro.finalizarJogo(), false);
    }
    
}
