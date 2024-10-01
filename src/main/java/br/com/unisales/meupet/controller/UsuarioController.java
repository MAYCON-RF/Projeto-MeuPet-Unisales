package br.com.unisales.meupet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unisales.meupet.service.UsuarioService;
import br.com.unisales.meupet.table.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService servico;

    @PostMapping
    public Usuario salvar(Usuario usuario) {
        return this.servico.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return this.servico.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable(value = "id") Integer id) {
        return this.servico.buscarPorId(id);
    }
}
