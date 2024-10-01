package com.example.IdentityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean verificarCiExiste(String ci) {
        return usuarioRepository.findByCi(ci).isPresent();
    }

    public void agregarUsuario(User usuario) {
        usuarioRepository.agregarUsuario(usuario);
    }

    public List<User> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
}
