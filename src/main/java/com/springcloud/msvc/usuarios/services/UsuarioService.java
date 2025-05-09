package com.springcloud.msvc.usuarios.services;

import java.util.List;
import java.util.Optional;

import com.springcloud.msvc.usuarios.entity.Usuario;

public interface UsuarioService {
	
	List<Usuario> listar();
	Optional<Usuario> porId(Long Id);
	Usuario guardar(Usuario usuario);
	void eliminar(Long id);

}
