package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

@Data
public class ItemPedidoDTO {
    private Long idProduto;
    private Integer qtde;
    private Float preco;
    private Long idPedido;
}