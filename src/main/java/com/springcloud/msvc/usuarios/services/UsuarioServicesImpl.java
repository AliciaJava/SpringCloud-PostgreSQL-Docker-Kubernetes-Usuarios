package com.springcloud.msvc.usuarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springcloud.msvc.usuarios.entity.Usuario;
import com.springcloud.msvc.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioServicesImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Usuario> listar() {
		return (List<Usuario>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Usuario> porId(Long Id) {
		return repository.findById(Id);
	}

	@Override
	@Transactional
	public Usuario guardar(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		repository.deleteById(id);
		
	}

}
