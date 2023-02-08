package com.sofka.naveproject.domain.service;

import com.sofka.naveproject.domain.model.Nave;

public interface NaveService {

    Nave guardar(Nave nave);
    Nave consultar(Long id);


}
