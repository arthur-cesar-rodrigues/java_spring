package br.edu.fatecfranca.apibd.repository;

import br.edu.fatecfranca.apibd.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRespository extends JpaRepository<Pedido, Long> {

}