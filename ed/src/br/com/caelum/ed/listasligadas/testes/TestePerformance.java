package br.com.caelum.ed.listasligadas.testes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformance {
    public static void main(String[] args) {

        ArrayList<String> vetor = new ArrayList<String>();
        LinkedList<String> listaLigada = new LinkedList<String>();
        int numeroDeElementos = 40000;

        //TESTE ADICIONANDO OBJETOS NO COMEÇO

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            vetor.add(0, "" + i);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Vetor adicionando no começo: " + (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            listaLigada.add(0, "" + i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Lista Ligada adicionando no começo: " + (fim - inicio) / 1000.0);


        //TESTE PERCORRENDO OBJETOS

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            vetor.get(i);
        }

        fim = System.currentTimeMillis();

        System.out.println("Vetor percorrendo: " + (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            listaLigada.get(i);
        }

        fim = System.currentTimeMillis();

        System.out.println("Lista Ligada percorrendo: " + (fim - inicio) / 1000.0);

        //TESTE REMOVENDO OBJETOS DO COMEÇO

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numeroDeElementos; i++){
            vetor.remove(0);
        }

        fim = System.currentTimeMillis();

        System.out.println("Vetor removendo do começo: " + (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeElementos; i++){
            listaLigada.remove(0);
        }

        fim = System.currentTimeMillis();

        System.out.println("Lista Ligada removendo do começo: " + (fim - inicio) / 1000.0);

    }
}