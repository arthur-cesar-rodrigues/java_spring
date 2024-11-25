package br.edu.fatecfranca.apibd.model;
import jakarta.persistence.*;
import lombok.Data;

@Data// é o lombock - gera automaticamente os getters, setters
@Entity //informa que a classe é uma entidade de banco de dados, faz com que a tavela seja interpretado como uma entidade de bd
@Table(name = "tb_usuario") //informa que a classe está relacionada  a uma tabela  chamada tb_usuario; cria uma tabela de bd, sempre precisa de uma chave promária
public class Usuario {
    @Id//variavel id é uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //essa linha faz um auto_increment (chave do tipo serial, inteiro auto-incremento, até 998 milhoees)
    private Long id;
    private String nome;
    private String username;
    private String password;
}
