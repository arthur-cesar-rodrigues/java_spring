package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.UsuarioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {//classe para manipular o banco

    //injeção de dependência
    @Autowired//usar os métodos da classe sem instância-la, mesma funcção do static do apimemoria
    UsuarioRespository usuarioRepository;

    //lista todos os usuarios
    public List<Usuario> listaTodos(){
        return usuarioRepository.findAll();
    }

    //lista usuario por ID
    public Optional <Usuario> buscaPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    //salvar um usuario
    public Usuario salva(UsuarioDTO usuario) {
        Usuario newUser = new Usuario();
        newUser.setNome(usuario.getNome());
        newUser.setPassword(usuario.getPassword());
        newUser.setUsername(usuario.getUsername());
        return usuarioRepository.save(newUser);
    }

    //remove usuario
    public void excluir(Long id) {
        if (usuarioRepository.existsById(id)) usuarioRepository.deleteById(id);
        else {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
    }

    //atualiza usuario
    public Usuario atualiza(UsuarioDTO usuario) {
        if(usuarioRepository.existsById(usuario.getId())) {
            Usuario newUser = new Usuario();
            newUser.setNome(usuario.getNome());
            newUser.setPassword(usuario.getPassword());
            newUser.setUsername(usuario.getUsername());
            newUser.setId(usuario.getId());

            return usuarioRepository.save(newUser);//papel de atualização, porque o usuario dto tem id
            //save serve para salvar os dados do usuario no banco e para atualizar os dados do usuario no banco
        } else throw new IllegalArgumentException("Usuário não encontrado");
    }

}
