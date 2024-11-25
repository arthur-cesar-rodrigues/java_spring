package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
    //essa classe lida com os dados da tebela
    private Long id;
    private String nome;
    private String username;
    private String password;
}
