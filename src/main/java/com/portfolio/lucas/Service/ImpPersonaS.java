/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Service;

import com.portfolio.lucas.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.lucas.Repository.IPersonaRepo;
import javax.transaction.Transactional;

/**
 *
 * @author lucas
 */
@Service
@Transactional
public class ImpPersonaS  {
    @Autowired IPersonaRepo rPersona;
    
   public List<Persona> list(){
        return rPersona.findAll();
    }
    
    public Persona getOne(int id){
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }    
   
    
    public void save(Persona pers){
        rPersona.save(pers);
    }      
    
   
     public void delete(int id){
        rPersona.deleteById(id);
    }    
     
     public void edit(Persona pers){
        rPersona.save(pers);
    }  
       
}
