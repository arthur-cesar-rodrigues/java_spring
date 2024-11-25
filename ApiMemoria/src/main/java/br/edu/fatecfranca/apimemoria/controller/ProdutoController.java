package br.edu.fatecfranca.apimemoria.controller;

import br.edu.fatecfranca.apimemoria.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    //simula no banco de dados
    //o hash simula um banco de dados, 1l,2l(são chaves primárias)
    //insominia testador de apis (pode usar as rotas get, post, delete dentro do insomnia)o crud
    //apertadando o start voce sobe o servidor -> ir no insominia e insrir a rota do controller (localhost:8080/produto);
    //  get no insomnia: retorna os produtos guaradados na meméoria na api, e também insere um produto porém é necessário informar todos os dados (mais precisa infromar o id)
    // post insere insere um produto porém é necessário informar todos os dados (mais precisa infromar o id e ele nãp pode já existir)
    // delete remove um produto, porém é necessário adicionar "/id" do produto que for ser removido, além d
    // patch = altera um produto da api, é necessário informar o id depois da rota (igual no delete), nao informar o id


    private static final Map<Long, Produto> produtos = new HashMap<>();

    static {//simulando produtos dentro "memória criada
        produtos.put(1L, new Produto(1L, "Mouse Óptico", "sem fio", 120.0));
        produtos.put(2L, new Produto(2L, "Teclado", "mecânico", 220.0));
        produtos.put(3L, new Produto(3L, "Head Phone", "sem fio", 320.0));
    }

    @GetMapping
    public Map<Long, Produto> getProdutos() {
        return produtos;
    }

    @PostMapping
    public Produto addProduto(@RequestBody Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public Produto deleteProduto(@PathVariable Long id) {
        return produtos.remove(id);
    }

    @PatchMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtos.put(id, produto);
    }

}
