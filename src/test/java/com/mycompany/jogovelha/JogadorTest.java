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
public class JogadorTest {
    
    

    /**
     * Test of checarTentativa method, of class Jogador.
     */
    @Test
    public void testChecarTentativaCasoTRUE () {
        Jogador jogador = new Jogador(1);
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.gerarTabuleiro();
        int [] tentativa = {0,1};
        assertEquals(jogador.checarTentativa(tentativa, tabuleiro), true);
    }
    @Test
    public void testChecarTentativaCasoFALSE () {
        Jogador jogador = new Jogador(1);
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.gerarTabuleiro();
        int [] tentativa = {0,1};
        tabuleiro.mudarTabuleiro(tentativa, 1);
        assertEquals(jogador.checarTentativa(tentativa, tabuleiro), false);
    }

    @Test
    public void testRegistrarTentativa(){
    }
}
