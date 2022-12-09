package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

public class Associacao {

    private String placa;
    private Carro carro;

    public Associacao(String placa, Carro carro){
        this.placa = placa;
        this.carro = carro;
    }

    public Object getPlaca(){
        return placa;
    }

    public Object getCarro(){
        return carro;
    }

}
