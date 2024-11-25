package br.edu.fatecfranca.apimemoria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWordController {
    @GetMapping
    public String helloword() {
        return "Hello World";
    }

    @GetMapping("/bomdia")
    public String bomdia(){
        return "Bom dia";
    }

    @GetMapping("/boanoite/{nome}") //criando uma rota que recebe um nome, voce insere o valor da variavel nome depois da rota
    public String boanoite(@PathVariable String nome) {
        return "Boa noite" + nome;
    }
}
