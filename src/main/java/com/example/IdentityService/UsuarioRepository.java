package com.example.IdentityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
