/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalinnovationone.pilha;

/**
 *
 * @author diogo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        
        System.out.println(minhaPilha);
        
        minhaPilha.pop();
        
        System.out.println(minhaPilha);
        
        minhaPilha.push(new No(100));
        
        System.out.println(minhaPilha);
    }
    
}
