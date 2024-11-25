package br.edu.fatecfranca.apibd.contoller;

import br.edu.fatecfranca.apibd.dto.ProdutoDTO;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")//criando a rota "produto" para poder realizar as funções
// do CRUD da api
public class ProdutoController {// essa classe é a mais próxima do usuário(pessoa),
    // é responsável pelas requisições do usuário-pessoa(ler, criar, deletar, update
    // produtos)
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos(){//requição get do insomnia
        // (GET - ROTA: localhost:8080/produto -> que vai retornar todos os produtos
        // salvos no banco)
        return new ResponseEntity<>(produtoService.listaTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaPorId(@PathVariable Long id) {//requição get do insomnia
        // (GET - ROTA: localhost:8080/produto/id -> que vai retornar o produto do id
        // informado salvo no banco)
        Optional<Produto> produto = produtoService.buscaPorId(id);

        return produto.isPresent() ? new ResponseEntity<>(produto.get(), HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    //public ResponseEntity<?> salvar(@RequestBody ProdutoDTO produtoDTO) { ? = melhor colocar a classe inves da interrogação, porque a interrogação salva qualquer dado, quando voce recebe a classe voce so recebe dados instancias daquela classe
    public ResponseEntity<Produto> salvar(@RequestBody ProdutoDTO produtoDTO) {
        //requição post do
        // insomnia (POST - ROTA: localhost:8080/produto -> essa requisição é responsável
        // por criar e salvar um novo produto no banco de dados, para isso é necessário
        // informar no body do insominia(por isso que o valor do método/requisição
        //  possui "@RequestBody" necessário preencher o body, na requisição de autalizar
        //  também tem esse mesmo parãmetro) os valores dos
        //  atributos(nome, descricao, valor do produto, porém o valor do id não é informado
        //  já que ele é a chave primária la no banco e tem seu auto incremento
        Produto produto = produtoService.salva(produtoDTO);
        return new ResponseEntity<>(produto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {//requisição delete do insomnia
        // (DELETE - ROTA: localhost:8080/produto/id -> que vai deletar o produto do id
        // informado)
        try {
            produtoService.excluir(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody ProdutoDTO produtoDTO) {
        //requição patch do insomnia (PATCH - ROTA: localhost:8080/produto/id -> que vai atualizar
        // e salvar o produto com id informado, para isso é necessário informar o id na rota e
        // no body inserir os atributos do produto(exceto id) e preencher os atributos que vão
        // ser aletrados, no body é necessário informar todos os atributos(e seus valores)
        // independente se vão ser alterados ou não, caso informe (no body do insomnia)
        // apenas os valores dos atributos que vão ser alterados, os outros atributos vão
        // passar a ser null)
        try {
            produtoDTO.setId(id);
            return new ResponseEntity<>(produtoService.atualiza(produtoDTO), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }


}
