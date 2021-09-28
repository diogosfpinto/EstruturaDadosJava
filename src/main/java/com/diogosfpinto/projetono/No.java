/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diogosfpinto.projetono;

/**
 * Classe No que aceita que aceita o conteudo de qualquer tipo genérico.
 * @author diogo
 */
public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }    

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + "conteudo=" + conteudo + '}';
    }    
}
