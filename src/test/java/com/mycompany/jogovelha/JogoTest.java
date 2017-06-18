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
public class JogoTest {
    
    public JogoTest() {
    }

    @Test
    public void testFinalizarJogoQuandoJogadorXPreencherLinha(){
        
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogo jogo = new Jogo(tabuleiro);
        int tentativa1 [] = {0, 0};
        int tentativa2 [] = {0, 1};
        int tentativa3 [] = {0, 2};
        int jogador = 1;
        tabuleiro.mudarTabuleiro(tentativa1, jogador);
        tabuleiro.mudarTabuleiro(tentativa2, jogador);
        tabuleiro.mudarTabuleiro(tentativa3, jogador);
        assertEquals(jogo.finalizarJogo(), 1);
    }
}
