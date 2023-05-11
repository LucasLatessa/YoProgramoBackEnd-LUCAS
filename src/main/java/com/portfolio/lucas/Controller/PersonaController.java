/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Controller;

import com.portfolio.lucas.Entity.Persona;
import com.portfolio.lucas.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucas
 */
@RestController
//@RequestMapping("/personas")
@CrossOrigin(origins = {"https://lucas-latessa-portfolio.web.app/","http://localhost:4200"})
public class PersonaController {
    @Autowired
    IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona(1);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("personas/crear")
    public String createpersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Persona creada con éxito";        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("personas/borrar/{id}")
    public String delete(@PathVariable int id){
        ipersonaService.deletePersona(id);
        return "Persona eliminada con éxito";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("personas/editar/{id}")
    public String delete(@PathVariable int id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("descripcion") String nuevaDesc,
            @RequestParam("img") String nuevaImg){
        Persona persona= ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setDescripcion(nuevaDesc);
        persona.setImg(nuevaImg);
        ipersonaService.savePersona(persona);
        return "Persona editada con éxito";
    }
    
    
    
    
}
