package com.rbg.magos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbg.magos.entitys.Magos;

@Repository
public interface IMagosRepository extends JpaRepository<Magos, Long> {
    
}
