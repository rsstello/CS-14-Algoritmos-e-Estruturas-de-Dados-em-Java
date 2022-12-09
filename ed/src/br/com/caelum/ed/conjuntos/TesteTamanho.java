package br.com.caelum.ed.conjuntos;

public class TesteTamanho {
    public static void main(String[] args) {

        ConjuntoEspalhamentoGenerico tabelas = new ConjuntoEspalhamentoGenerico();

        tabelas.adiciona("Bruna");
        tabelas.adiciona("Jonathan");
        tabelas.adiciona("Julia");

        System.out.println(tabelas.tamanho());

        tabelas.adiciona("Jonathan");

        System.out.println(tabelas.tamanho());

    }

}