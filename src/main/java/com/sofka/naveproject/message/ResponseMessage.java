package com.sofka.naveproject.message;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ResponseMessage {


    private Long id;


    private Double velocidad;


    private Double potencia;


    private Double peso;


    private String combustible;

    private int pasajeros;


    public ResponseMessage(Long id, Double velocidad, Double potencia, Double peso, String combustible, int pasajeros) {
        this.id = id;
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.peso = peso;
        this.combustible = combustible;
        this.pasajeros = pasajeros;
    }




}
