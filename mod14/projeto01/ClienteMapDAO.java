package dao;

import dao.interfaces.ClienteDAO;
import model.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements ClienteDAO {
    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrarCliente(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        } else {
            this.map.put(cliente.getCpf(), cliente);
            return true;
        }
    }

    @Override
    public Cliente consultarUmCliente(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public void alterarCliente(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTelefone(cliente.getTelefone());
            clienteCadastrado.setEndereco(cliente.getEndereco());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public void excluirCliente(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf());
        }
    }

    @Override
    public Collection<Cliente> consultarTodosClientes() {
        return this.map.values();
    }
}
