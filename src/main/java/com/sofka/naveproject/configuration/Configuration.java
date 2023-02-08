package com.sofka.naveproject.configuration;

import com.sofka.naveproject.domain.service.NaveService;
import com.sofka.naveproject.domain.service.NaveServiceImpl;
import com.sofka.naveproject.reporistory.NaveRepository;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {


    @Bean
    public NaveService encontrarBean(NaveRepository naveRepository){
        return new NaveServiceImpl(naveRepository);
    }


}
