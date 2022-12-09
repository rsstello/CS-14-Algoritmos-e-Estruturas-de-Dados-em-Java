package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public class TestePilhaGenerica {
    public static void main(String[] args) {
        PilhaGenerica pilhaDePecas = new PilhaGenerica();

        Peca peca1 = new Peca();
        pilhaDePecas.insere(peca1);

        Object pecaRemovida = pilhaDePecas.remove();

        if(peca1 != pecaRemovida){
            System.out.println("Erro: a peça removida n]ao é igual a que foi inserida");
        }

        if(!pilhaDePecas.vazia()){
            System.out.println("Erro: A pilha não está vazia");
        }
    }

}

