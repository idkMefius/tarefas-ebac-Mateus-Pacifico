package dao.interfaces;

import model.Cliente;

import java.util.Collection;

public interface ClienteDAO {
    public Boolean cadastrarCliente(Cliente cliente);
    public Cliente consultarUmCliente(Long cpf);
    public void alterarCliente(Cliente cliente);
    public void excluirCliente(Long cpf);
    public Collection<Cliente> consultarTodosClientes();
}
