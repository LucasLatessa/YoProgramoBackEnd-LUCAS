/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Service;

import com.portfolio.lucas.Entity.AcercaDe;
import com.portfolio.lucas.Entity.Persona;
import com.portfolio.lucas.Interface.IAcercaDeS;
import com.portfolio.lucas.Repository.IAcercaDeRepo;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucas
 */
@Service
@Transactional
public class ImpAcercaDeS implements  IAcercaDeS{
    @Autowired
    IAcercaDeRepo iAcercaDeRepo;
    
public void save(AcercaDe acercaDe){
        iAcercaDeRepo.save(acercaDe);
}

    @Override
    public AcercaDe findAcerca(int id) {
        AcercaDe acercaDe= iAcercaDeRepo.findById(id).orElse(null);
        return acercaDe;}
}
