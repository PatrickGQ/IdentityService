package com.example.IdentityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/verificar-ci/{ci}")
    public ResponseEntity<Boolean> verificarCi(@PathVariable String ci) {
        boolean existe = usuarioService.verificarCiExiste(ci);
        return ResponseEntity.ok(existe);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Void> agregarUsuario(@RequestBody User usuario) {
        usuarioService.agregarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/todos")
    public ResponseEntity<List<User>> obtenerTodosLosUsuarios() {
        return ResponseEntity.ok(usuarioService.obtenerTodosLosUsuarios());
    }
}
