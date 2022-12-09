package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

public class TesteMapaEspalhamentoGenerico {
    public static void main(String[] args) {

        MapaEspalhamentoGenerico<String, Carro> mapa = new MapaEspalhamentoGenerico<String, Carro>();

        mapa.adiciona("abc123", new Carro("Ferrari"));
        mapa.adiciona("def456", new Carro("BMW"));

        mapa.contemChave("abc123");

        mapa.pega("def456");


        System.out.println(mapa);

        mapa.remove("abc123");

        System.out.println(mapa);

    }

}
