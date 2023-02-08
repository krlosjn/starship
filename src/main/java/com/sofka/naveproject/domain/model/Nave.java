package com.sofka.naveproject.domain.model;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public  class Nave {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="VELOCIDAD")
    private Double velocidad;

    @Column(name="POTENCIA")
    private Double potencia;

    @Column(name="PERSO")
    private Double peso;

    @Column(name = "COMBUSTIBLE",length = 50)
    private String combustible;

    public Nave(Long id, Double velocidad, Double potencia, Double peso, String combustible) {
        this.id = id;
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.peso = peso;
        this.combustible = combustible;
    }

    public Nave() {

    }

    @Override
    public String toString() {
        return "Nave{" +
                "id=" + id +
                ", velocidad=" + velocidad +
                ", potencia=" + potencia +
                ", peso=" + peso +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
