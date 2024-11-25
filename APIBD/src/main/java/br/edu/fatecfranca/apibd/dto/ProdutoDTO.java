package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

@Data
public class ProdutoDTO {//essa classe "modelo" que espelha o que está no banco,
    // serve para a comunicação(envio e recebimento de dados) entre usuario
    // banco/servidor e vice versa
    private Long id;
    private String nome;
    private String descricao;
    private Float preco;
}
