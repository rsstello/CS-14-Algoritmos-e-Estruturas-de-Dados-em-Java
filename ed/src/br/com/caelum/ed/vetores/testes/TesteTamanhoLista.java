package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Object;
import br.com.caelum.ed.vetores.Vetor;

public class TesteTamanhoLista {
    public static void main(String[] args) {
        Object a1 = new Object();
        Object a2 = new Object();
        Object a3 = new Object();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.tamanho());

        lista.adiciona(a3);

        System.out.println(lista.tamanho());

    }

}
