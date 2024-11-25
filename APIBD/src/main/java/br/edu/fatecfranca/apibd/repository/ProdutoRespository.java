package br.edu.fatecfranca.apibd.repository;

import br.edu.fatecfranca.apibd.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRespository extends JpaRepository<Produto, Long> {
    // essa classe interface é responsavel pelas operações de crud com a entidade Produto
    // e também ré responável por executar os métodos(na classe ProdutoService):
    // findAll(), findById(), save(), existsById(), deleteById()
}
