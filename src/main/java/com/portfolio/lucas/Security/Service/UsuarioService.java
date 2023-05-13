/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.lucas.Security.Service;

import com.portfolio.lucas.Security.Entity.Usuario;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.lucas.Security.Repository.IUsuarioRepo;

/**
 *
 * @author lucas
 */
@Service
@Transactional
public class UsuarioService {

    @Autowired
    IUsuarioRepo iUsuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario) {
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email) {
        return iUsuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        iUsuarioRepository.save(usuario);
    }

}
