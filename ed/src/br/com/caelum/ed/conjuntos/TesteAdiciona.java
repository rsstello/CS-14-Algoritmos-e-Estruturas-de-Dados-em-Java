package br.com.caelum.ed.conjuntos;

import java.util.List;

public class TesteAdiciona {
    public static void main(String[] args){
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<Object> palavras = conjunto.pegaTodas();

        for(Object palavra : palavras){
            System.out.println(palavra);
        }
    }

}