package br.com.unisales.meupet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisales.meupet.repository.UsuarioRepository;
import br.com.unisales.meupet.table.Usuario;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> listar() {
        return this.repo.findAll();
    }

    public Usuario buscarPorId(Integer id) {
        Optional<Usuario> usuario = this.repo.findById(id);
        if (usuario.isPresent())
            return usuario.get();
        return new Usuario();
    }

    public Usuario salvar(Usuario usuario) {
        if (usuario.getId().equals(0))
            usuario.setId(null);
        // this.repo.fyndByAtivoOrderByNome(1);
        return this.repo.save(usuario);
    }
}
