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
public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    
    /**
     * método que adiciona novo nó na pilha
    */
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    
    
    public No pop(){
        if(!isEmpty()){
            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopped;
        }
        return null;
    }
    
    public No top(){
        return refNoEntradaPilha;
    }
    
    public boolean isEmpty(){
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        
        String stringRetorno = "--------------\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "-------------\n";
        
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else{
                break;
            }        
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
    
    
}
