package br.com.caelum.ed.conjuntos;

public class TesteContem {
    public static void main(String[] args){

        ConjuntoEspalhamentoGenerico tabelas = new ConjuntoEspalhamentoGenerico();

        tabelas.adiciona("Jonathan");
        tabelas.adiciona("Bruna");

        System.out.println(tabelas.contem("Julia"));
        System.out.println(tabelas.contem("Jonathan"));

    }

}
