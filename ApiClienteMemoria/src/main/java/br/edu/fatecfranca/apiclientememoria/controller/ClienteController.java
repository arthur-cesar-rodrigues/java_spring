package br.edu.fatecfranca.apiclientememoria.controller;

import br.edu.fatecfranca.apiclientememoria.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private static final Map<Long, Cliente> clientes = new HashMap<>();

    static {//simulando um banco de dados
        clientes.put(1L, new Cliente(1L, "Arthur", "arthur0369@gmail.com", "(16)98858-9290"));
        clientes.put(2L, new Cliente(2L, "Alcides", "cidao@hotmail.com", "(19)98858-8568"));
        clientes.put(3l, new Cliente(3L, "Otavio", "otavio_cap@gmail.com", "(16)98151-2670"));
    }

    @GetMapping
    public Map<Long, Cliente> getClientes() {//método que retorna todos os clientes salvos em memória
        return clientes;
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {//método que retorna o cliente específico por id
        if (clientes.containsKey(id)) {
            return clientes.get(id);
        }
        throw new IllegalArgumentException("Cliente não encontrado");
    }

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente) {//método que adiciona cliente
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {//método que atualiza
        if (clientes.containsKey(id)) {
            cliente.setId(id);
            return clientes.put(id, cliente);
        }
        throw  new IllegalArgumentException("Cliente não encontrado");
    }

    @DeleteMapping("/{id}")
    public Cliente deleteCliente(@PathVariable Long id) {//método que remove um cliente pelo id
        if (clientes.containsKey(id)) {
            return clientes.remove(id);
        }
        throw new IllegalArgumentException("Cliente não encontrado");
    }


}
