package com.example.IdentityService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsuarioServiceTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    void verificarCiExiste() {
        String ci = "12345678";
        boolean existe = usuarioService.verificarCiExiste(ci);
        Assertions.assertFalse(existe); // Verificamos que el CI no exista
    }
}