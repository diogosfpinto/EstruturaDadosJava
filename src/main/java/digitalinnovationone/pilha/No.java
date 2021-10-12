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
public class No {
    
    private int dado;
    private No refNo = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }    

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" + "dado=" + dado + '}';
    }
}
