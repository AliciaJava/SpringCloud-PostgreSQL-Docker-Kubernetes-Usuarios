package com.springcloud.msvc.usuarios.repository;

import com.springcloud.msvc.usuarios.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
}

