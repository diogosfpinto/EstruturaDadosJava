/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diogosfpinto.projetono;

/**
 *
 * @author diogo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("Conteudo No 1");
        
        No<String> no2 = new No<>("Conteudo No 2");
        
        no1.setProximoNo(no2);
        
        No<String> no3 = new No<>("Conteudo No3");
        
        no2.setProximoNo(no3);
        
        No<String> no4 = new No<>("ConteudoNo4");
        
        no3.setProximoNo(no4);
        
        
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("---------");
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
    
}
