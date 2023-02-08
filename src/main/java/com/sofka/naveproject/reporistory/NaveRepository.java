package com.sofka.naveproject.reporistory;

import com.sofka.naveproject.domain.model.Nave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NaveRepository extends JpaRepository<Nave,Long> {
}
