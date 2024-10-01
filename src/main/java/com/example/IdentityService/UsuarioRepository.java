package com.example.IdentityService;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository {
    private List<User> usuarios = new ArrayList<>();

    public Optional<User> findByCi(String ci) {
        return usuarios.stream().filter(usuario -> usuario.getCi().equals(ci)).findFirst();
    }

    public void agregarUsuario(User usuario) {
        usuarios.add(usuario);
    }

    public List<User> findAll() {
        return usuarios;
    }
}
