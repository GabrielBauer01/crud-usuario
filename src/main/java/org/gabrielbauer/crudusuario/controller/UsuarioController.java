package org.gabrielbauer.crudusuario.controller;

import lombok.RequiredArgsConstructor;
import org.gabrielbauer.crudusuario.business.UsuarioService;
import org.gabrielbauer.crudusuario.infrastructure.entitys.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email) {
        usuarioService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualiarUsuario(@RequestParam Integer id, @RequestBody Usuario usuario) {
        usuarioService.atualiarUsuarioPorID(id, usuario);
        return ResponseEntity.ok().build();
    }
}
