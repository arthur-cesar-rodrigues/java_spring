package br.edu.fatecfranca.apibd.model;

import jakarta.persistence.*;
import lombok.Data;

@Data//chamando o @Data do lombock para gerar os getters/settes e construtores da classe
@Entity//informa que a classe é uma entidade do banco de dados
@Table(name = "tb_produto")//cria a tabela "tb_produto" no banco de dados e relaciona essa classe a ela
public class Produto {
    @Id//é o atributo que é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//faz o auto_increment do atributo id
    private Long id;
    private String nome;
    private String descricao;
    private Float preco;
}
