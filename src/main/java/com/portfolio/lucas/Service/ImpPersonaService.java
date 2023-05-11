/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Service;

import com.portfolio.lucas.Entity.Persona;
import com.portfolio.lucas.Interface.IPersonaService;
import com.portfolio.lucas.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired
    IPersonaRepository ipersonaRepository;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona= ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(int id) {
    ipersonaRepository.deleteById(id);
}

    @Override
    public Persona findPersona(int id) {
        int idInt = Math.toIntExact(id);
        Persona persona= ipersonaRepository.findById(idInt).orElse(null);
        return persona;
    }
    
}
