package org.gabrielbauer.crudusuario.infrastructure.repository;

import jakarta.transaction.Transactional;
import org.gabrielbauer.crudusuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    Optional <Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
