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
public class Jogo {
    Tabuleiro tabuleiro;
    Jogador jogador1;
    Jogador jogador2;
    private int rodada = 1, vez = 1;

    Jogo(){
        tabuleiro = new Tabuleiro();
        jogador1 = new Jogador(1);
        jogador2 = new Jogador(2);
        
        while (jogada());
    }
    
    public boolean jogada(){
        if(ganhou()==0){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a vez do jogador " + vez() );
            
            if(vez()==1)
                jogador1.jogar(tabuleiro);
            else
                jogador2.jogar(tabuleiro);
            
            
            if(tabuleiro.finalizarJogo()){
                System.out.println("Tabuleiro Completo. Jogo empatado");
                return false;
            }
            vez++;
            rodada++;

            return true;
        } else{
            if(ganhou() == -1 )
                System.out.println("Jogador 1 ganhou!");
            else
                System.out.println("Jogador 2 ganhou!");
            
            return false;
        }
            
    } 
     private int ganhou(){
        if(tabuleiro.checarLinhas()==1){
           return 1; 
        }else if(tabuleiro.checarColunas()==1){
            return 1;
        }else if(tabuleiro.checarDiagonais()==1){
            return 1;
        }else if(tabuleiro.checarLinhas()==-1){
            return -1;
        }else if(tabuleiro.checarColunas()==-1){
            return -1;
        }else if (tabuleiro.checarDiagonais()==-1){
            return -1;
        }return 0;
    }
    public int vez(){
        if(vez%2 == 1)
            return 1;
        else
            return 2;
    }
}
