package com.sofka.naveproject.domain.model;


import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Tripulada extends Nave implements NavesExploradoras,NavesAcciones{




    @Column(name="PASAJEROS")
    private int pasajeros;

    public Tripulada(Long id, Double velocidad, Double potencia, Double peso, String combustible, int pasajeros) {
        super(id, velocidad, potencia, peso, combustible);
        this.pasajeros=pasajeros;
    }

    public Tripulada() {

    }

    @Override
    public String explorar() {
        return null;
    }

    @Override
    public String volar() {
        return null;
    }
}
