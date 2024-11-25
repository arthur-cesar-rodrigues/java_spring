package br.edu.fatecfranca.apibd.repository;

import br.edu.fatecfranca.apibd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRespository extends JpaRepository<Usuario, Long> {
    //esta interface terá as operações de crud com a endidade Usuario
    // métodos que essa classe executa = findall, findbyId, save, existsbyid, deletebyId
}
