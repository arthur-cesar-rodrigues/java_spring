package br.edu.fatecfranca.apibd.service;


import br.edu.fatecfranca.apibd.dto.ProdutoDTO;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.repository.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {//classe que manipula a tabela "tb_produto" do bd,
    // é a classe mais próxima do banco de dados, onde se faz a conversão dos dados
    // entre a classe ProdutoDTO para Produto(model)
    //injeção de dependência
    @Autowired//usa os métodos(save()...) da classe ProdutoRepository sem instancia-la
    ProdutoRespository produtoRespository;

    //método que lista todos os produtos
    public List<Produto> listaTodos() {
        return produtoRespository.findAll();
    }

    //método que lista o produto por id
    public Optional<Produto> buscaPorId(Long id) {
        return produtoRespository.findById(id);
    }

    //método que salva um produto
    public Produto salva(ProdutoDTO produtoDTO) {
        Produto novoProduto = new Produto();
        novoProduto.setNome(produtoDTO.getNome());
        novoProduto.setDescricao(produtoDTO.getDescricao());
        novoProduto.setPreco(produtoDTO.getPreco());
        return produtoRespository.save(novoProduto);
    }

    //método que apaga um produto pelo id
    public void excluir(Long id) {
        //condição abaixo verifica se o produto com o id informado existe no banco,
        // se for encontrado o produto vais ser deletado
        if(produtoRespository.existsById(id)) produtoRespository.deleteById(id);
        else throw new IllegalArgumentException("Produto não encontrado");//criando uma
        // excessão(mensagem que vai ser passada ao usuário) caso não seja encontrado
        // o produto com o id informado no banco
    }

    //método que atualiza os dados/atributos do produto
    // (exceto o id que tem valor valor definido auto_increment na classe ProdutoModel)
    public Produto atualiza(ProdutoDTO produtoDTO) {
        if(produtoRespository.existsById(produtoDTO.getId())) {//verificando se o produto
            // existe pelo id
            Produto novoProduto = new Produto();
            //atributos que podem ser alterados por este método:
            novoProduto.setNome(produtoDTO.getNome());
            novoProduto.setDescricao(produtoDTO.getDescricao());
            novoProduto.setPreco(produtoDTO.getPreco());
            novoProduto.setId(produtoDTO.getId());
            return produtoRespository.save(novoProduto);//atualizando e salvando
            // o produto no banco de dados após alteração de dados
        } else throw new IllegalArgumentException("Produto não encontrado");//criando uma
        // excessão(mensagem que vai ser passada ao usuário) caso não seja encontrado
        // o produto com o id informado no banco
    }
}
