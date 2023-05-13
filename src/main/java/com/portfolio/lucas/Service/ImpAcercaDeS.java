/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Service;

import com.portfolio.lucas.Entity.AcercaDe;
import com.portfolio.lucas.Repository.IAcercaDeRepo;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service
@Transactional
public class ImpAcercaDeS {
    @Autowired
    IAcercaDeRepo iAcercaDeRepo;
    public Optional<AcercaDe> get(){
        return iAcercaDeRepo.findById(1);
    }
public void save(AcercaDe acercaDe){
        iAcercaDeRepo.save(acercaDe);
}
}
