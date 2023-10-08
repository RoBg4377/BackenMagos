package com.rbg.magos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbg.magos.Interfaces.IMagosService;
import com.rbg.magos.entitys.Magos;
import com.rbg.magos.repository.IMagosRepository;

@Service
public class MagosServices implements IMagosService{

    @Autowired
    IMagosRepository imagosRepository;

    @Override
    public List<Magos> getMagosList() {
        return imagosRepository.findAll();
    }

    @Override
    public Magos getMago(Long id) {
        return imagosRepository.findById(id).orElse(null);
    }

    @Override
    public void createMago(Magos mago) {
        imagosRepository.save(mago);
    }

    @Override
    public void deleteMago(Long id) {
        imagosRepository.deleteById(id);
    }
    
}
