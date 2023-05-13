/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Security.Service;

import com.portfolio.lucas.Security.Entity.Rol;
import com.portfolio.lucas.Security.Enums.RolNombre;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.lucas.Security.Repository.IRolRepo;

/**
 *
 * @author lucas
 */
@Service
@Transactional
public class RolService {
    @Autowired IRolRepo irolRepository;
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
