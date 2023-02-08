package com.sofka.naveproject.domain.model;

public class NoTripulada  implements NavesExploradoras,NavesAcciones {

/*
    public NoTripulada(Long id, Double velocidad, Double potencia, Double peso, String combustible) {
        super(id, velocidad, potencia, peso, combustible);
    }
*/
    @Override
    public String explorar() {
        return "no estoy tripulada";
    }

    @Override
    public String volar() {
        return null;
    }
}
