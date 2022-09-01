package com.desafio.desafiogit.service;

import com.desafio.desafiogit.model.UsuarioModel;
import com.desafio.desafiogit.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> buscarPorTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarId(Long codigo) {
        return usuarioRepository.findById(codigo);
    }

    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alterar(UsuarioModel usuario, Long codigo) {
        usuario.getId();
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long codigo) {
        usuarioRepository.deleteById(codigo);
    }
}
