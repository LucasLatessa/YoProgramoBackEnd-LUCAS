/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Controller;

import com.portfolio.lucas.Dto.AcercaDeData;
import com.portfolio.lucas.Entity.AcercaDe;
import com.portfolio.lucas.Security.Controller.Mensaje;
import com.portfolio.lucas.Service.ImpAcercaDeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lucas
 */
@RequestMapping("/acercade")
@CrossOrigin(origins = {"https://lucas-latessa-portfolio.web.app","http://localhost:4200"})
public class AcercaDeCont {
    @Autowired
    ImpAcercaDeS acercaDeS;
    
    @GetMapping("/traer")
    public AcercaDe get(){
        AcercaDe acercaDe = acercaDeS.getOne(1).get();
        return acercaDe;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<?> update( @RequestBody AcercaDeData dtoAcerca){
        AcercaDe acercaDe = acercaDeS.getOne(1).get();
        acercaDe.setDescripcion((dtoAcerca.getDescripcion()));
        
        acercaDeS.save(acercaDe);
        return new ResponseEntity(new Mensaje("Acerca de mi actualizado"), HttpStatus.OK);
             
    }
}
