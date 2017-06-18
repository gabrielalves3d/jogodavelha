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
        int [][] tabuleiroTeste=new int[3][3];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; linha < 3; linha++) {
                tabuleiroTeste[linha][coluna] = 0;
            }
        }
        assertEquals(tabuleiro.gerarTabuleiro(), tabuleiroTeste);
    }

    /**
     * Test of exibirTabuleiro method, of class Tabuleiro.
     */
    @Test
    public void testExibirTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa [] = {1, 2};
        int jogador = 1;
        tabuleiro.mudarTabuleiro(tentativa, jogador);
        assertEquals(tabuleiro.verPosicao(tentativa), 1);      
    }
    
    /**
     * Test of mudarTabuleiro method, of class Tabuleiro.
     */
    @Test
    public void testMudarTabuleiroJogadorX() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa [] = {1, 2};
        int jogador = 1;
        tabuleiro.mudarTabuleiro(tentativa, jogador);
        assertEquals(tabuleiro.verPosicao(tentativa), 1);
    }
    @Test
    public void testMudarTabuleiroJogadorO() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa [] = {1, 2};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa, jogador);
        assertEquals(tabuleiro.verPosicao(tentativa), 2);
    }
    /**
     * Test of checarLinhas method, of class Tabuleiro.
     */
    @Test
    public void testChecarLinhasJogadorX() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {0, 1};
        int tentativa3 [] = {0, 2};
        int jogador = 1;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);

        assertEquals(tabuleiro.checarLinhas(), 1);
    }
    @Test
    public void testChecarLinhasJogadorO() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {0, 1};
        int tentativa3 [] = {0, 2};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);

        assertEquals(tabuleiro.checarLinhas(), 2);
    }
    @Test
    public void testChecarLinhasIncompleta() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {0, 1};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        assertEquals(tabuleiro.checarLinhas(), 0);
    }
    /**
     * Test of checarColunas method, of class Tabuleiro.
     */
    @Test
    public void testChecarColunasJogadorX() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 0};
        int tentativa3 [] = {2, 0};
        int jogador = 1;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);

        assertEquals(tabuleiro.checarColunas(), 1);
        
    }
    @Test
    public void testChecarColunasJogadorO() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 0};
        int tentativa3 [] = {2, 0};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);

        assertEquals(tabuleiro.checarColunas(), 2);
        
    }
     @Test
    public void testChecarColunasIncompletas() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 0};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);

        assertEquals(tabuleiro.checarColunas(), 0);
        
    }
    /**
     * Test of checarDiagonais method, of class Tabuleiro.
     */
    @Test
    public void testChecarDiagonaisJogadorX() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 1};
        int tentativa3 [] = {2, 2};
        int jogador = 1;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);

        assertEquals(tabuleiro.checarDiagonais(), 1);
    }
    @Test
    public void testChecarDiagonaisJogadorO() {
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 1};
        int tentativa3 [] = {2, 2};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);

        assertEquals(tabuleiro.checarDiagonais(), 2);
    }
    @Test
    public void testChecarDiagonaisIncompletas(){
        Tabuleiro tabuleiro = new Tabuleiro();
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {1, 1};
        int jogador = 2;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);

        assertEquals(tabuleiro.checarDiagonais(), 0);
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
