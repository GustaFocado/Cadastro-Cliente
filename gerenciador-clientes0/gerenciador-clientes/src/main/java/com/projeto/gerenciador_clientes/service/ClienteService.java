package com.projeto.gerenciador_clientes.service;

import com.projeto.gerenciador_clientes.dto.ClienteDTO;
import com.projeto.gerenciador_clientes.entity.Cliente;
import com.projeto.gerenciador_clientes.entity.Endereco;
import com.projeto.gerenciador_clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDTO> listarTodos() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream()
                .map(this::converterParaDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO buscarPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        return converterParaDTO(cliente);
    }

    public ClienteDTO criarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = converterParaCliente(clienteDTO);
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return converterParaDTO(clienteSalvo);
    }

    public ClienteDTO atualizarCliente(Long id, ClienteDTO clienteDTO) {
        Cliente cliente = converterParaCliente(clienteDTO);
        cliente.setId(id);
        Cliente clienteAtualizado = clienteRepository.save(cliente);
        return converterParaDTO(clienteAtualizado);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    private Cliente converterParaCliente(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setSobrenome(clienteDTO.getSobrenome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setEndereco(new Endereco());
        cliente.setTelefone(cliente.getTelefone());
        cliente.setIdade(cliente.getIdade());
        return cliente;
    }

    private ClienteDTO converterParaDTO(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setSobrenome(cliente.getSobrenome());
        clienteDTO.setCpf(cliente.getCpf());
        clienteDTO.setEmail(cliente.getEmail());
        cliente.setEndereco(new Endereco());
        cliente.setTelefone(cliente.getTelefone());
        cliente.setIdade(cliente.getIdade());
        return clienteDTO;
    }
}
