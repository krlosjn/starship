package com.sofka.naveproject.application;


import com.sofka.naveproject.domain.service.NaveServiceImpl;


public class InicioAplicacion {


    private NaveServiceImpl naveService;

    public InicioAplicacion(NaveServiceImpl naveService) {
        this.naveService = naveService;
    }

}
