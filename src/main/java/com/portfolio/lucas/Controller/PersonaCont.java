/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Controller;

import com.portfolio.lucas.Entity.Persona;
import com.portfolio.lucas.Interface.IPersonaService;
import com.portfolio.lucas.Service.ImpPersonaS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucas
 */
@RestController
//@RequestMapping("/personas")
@CrossOrigin(origins = {"https://lucas-latessa-portfolio.web.app","http://localhost:4200"})
public class PersonaCont {
    @Autowired ImpPersonaS  IPersonaService;
    
    @GetMapping ("/personas/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = IPersonaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/personas/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable("id") int id){
        Persona perso = IPersonaService.getOne(id);
        return new ResponseEntity(perso, HttpStatus.OK);
    }       
    
    
    @PostMapping("/personas/create")
    public void save(@RequestBody Persona persona){
        IPersonaService.save(persona);
    }
    
   
    @DeleteMapping("/personas/delete/{id}")
    public void delete(@PathVariable int id){
        IPersonaService.delete(id);
    }
    
    @PutMapping("/personas/update")
    public void edit(@RequestBody Persona persona){
        IPersonaService.edit(persona);
    }
   
       
}
