package com.sofka.naveproject.domain.service;

import com.sofka.naveproject.domain.model.Nave;
import com.sofka.naveproject.reporistory.NaveRepository;
import org.springframework.stereotype.Repository;

@Repository
public class NaveServiceImpl implements NaveService{

    private final NaveRepository naveRepository;
    public NaveServiceImpl(NaveRepository naveRepository){
        this.naveRepository=naveRepository;
    }

    @Override
    public Nave guardar(Nave nave) {
        return this.naveRepository.save(nave);
    }

    @Override
    public Nave consultar(Long id) {
        return this.naveRepository.findById(id).orElse(null);
    }
}
