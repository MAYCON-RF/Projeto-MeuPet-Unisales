package br.com.unisales.meupet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unisales.meupet.table.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> fyndByAtivoOrderByNome(Integer ativo);
}
