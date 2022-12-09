package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Object;
import br.com.caelum.ed.vetores.Vetor;

public class TesteContemAluno {
    public static void main(String[] args) {
        Object a1 = new Object();
        Object a2 = new Object();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a2));

        Object aluno = new Object();
        aluno.setNome("Ana");

        System.out.println(lista.contem(aluno));

    }

}