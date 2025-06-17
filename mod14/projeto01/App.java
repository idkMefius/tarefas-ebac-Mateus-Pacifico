import dao.ClienteMapDAO;
import dao.interfaces.ClienteDAO;
import model.Cliente;

import javax.swing.*;

public class App {
    static ClienteDAO clienteDAO = new ClienteMapDAO();
    public static void main(String[] args) {
        String opcao = "";
        while (true) {
            opcao = JOptionPane.showInputDialog(null,
                    """
                                Digite uma das opções abaixo:
                                1 para CADASTRAR um cliente
                                2 para CONSULTAR um cliente
                                3 para ALTERAR um cliente
                                4 para EXCLUIR um cliente
                                5 para SAIR""",
                    "Cadastro de Clientes",
                    JOptionPane.INFORMATION_MESSAGE);

            if (opcao == null || opcao.equals("5")) {
                sair();
                break;
            }

            switch (opcao) {
                case "1" -> {
                    String dados = JOptionPane.showInputDialog(null,
                            """
                                Digite os dados do cliente separados por VÍRGULA na seguinte ordem:
                                Nome, CPF, Telefone, Endereço, Número, Cidade, Estado""",
                            "Cadastro de Cliente",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (dados != null) {
                        cadastrar(dados.split(","));
                    }
                }
                case "2" -> {
                    String cpfString = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente para consultá-lo",
                            "Consulta de Cliente",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (cpfString != null) {
                        consultar(cpfString);
                    }
                }
                case "3" -> {
                    String cpfString = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente para alterá-lo",
                            "Alteração de Cliente",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (cpfString != null) {
                        alterar(cpfString);
                    }
                }
                case "4" -> {
                    String cpfString = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente para excluí-lo",
                            "Exclusão de Cliente",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (cpfString != null) {
                        excluir(cpfString);
                    }
                }
                default -> JOptionPane.showMessageDialog(null,
                        "OPÇÃO INVÁLIDA!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

// MÉTODOS CADASTRAR, CONSULTAR, ALTERAR, EXCLUIR, E SAIR --------------------------------------------------------------

    private static void cadastrar(String[] dadosSeparados) {
        if (dadosSeparados.length != 7) {
            JOptionPane.showMessageDialog(null,
                    "Todos os campos são obrigatórios! Por favor, preencha todos os dados solicitados!",
                    "Erro de Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (String dado : dadosSeparados) {
            if (dado.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Um ou mais campos não foram preenchidos! Por favor, preencha todos os dados solicitados!",
                        "Erro de Cadastro",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        try {
            String nomeCliente = dadosSeparados[0].trim();
            Long cpfCliente = Long.parseLong(dadosSeparados[1].replaceAll("[.-]", "").trim());
            Long telefoneCliente = Long.parseLong(dadosSeparados[2].replaceAll("[()+\\s-]", "").trim());
            String enderecoCliente = dadosSeparados[3].trim();
            Integer numeroCliente = Integer.parseInt(dadosSeparados[4].trim());
            String cidade = dadosSeparados[5].trim();
            String estado = dadosSeparados[6].trim();

            Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente, enderecoCliente, numeroCliente, cidade, estado);
            Boolean isCadastrado = clienteDAO.cadastrarCliente(cliente);

            if (isCadastrado) {
                JOptionPane.showMessageDialog(null,
                        "Cliente cadastrado com sucesso!",
                        "Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Cliente com este CPF já existe!",
                        "Erro!",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao cadastrar um cliente! Por favor, verifique as informações dadas!",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultar(String cpfString) {
        try {
            Long cpf = Long.parseLong(cpfString.replaceAll("[.-]", "").trim());
            Cliente cliente = clienteDAO.consultarUmCliente(cpf);
            if (cliente != null) {
                JOptionPane.showMessageDialog(null,
                        "Cliente encontrado:\n" + cliente.toString(),
                        "Consulta de Cliente",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Cliente não encontrado.",
                        "Consulta de Cliente",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "CPF inválido ou não encontrado! Por favor, verifique a informação dada!",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void alterar(String cpfString) {
        try {
            Long cpf = Long.parseLong(cpfString.replaceAll("[.-]", "").trim());
            Cliente cliente = clienteDAO.consultarUmCliente(cpf);

            if (cliente == null) {
                JOptionPane.showMessageDialog(null,
                        "Cliente não encontrado.",
                        "Alteração de Cliente",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            String novosDados = JOptionPane.showInputDialog(null,
                    """
                        Digite os NOVOS dados do cliente separados por VÍRGULA (o CPF não pode ser alterado):
                        Nome, Telefone, Endereço, Número, Cidade, Estado""",
                    "Alteração de Cliente",
                    JOptionPane.INFORMATION_MESSAGE);

            if (novosDados == null) {
                return;
            }

            String[] dadosSeparados = novosDados.split(",");
            if (dadosSeparados.length != 6) {
                JOptionPane.showMessageDialog(null,
                        "Todos os campos são obrigatórios!",
                        "Erro de Alteração",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Cliente clienteAtualizado = new Cliente(
                    dadosSeparados[0].trim(),
                    cpf,
                    Long.parseLong(dadosSeparados[1].replaceAll("[()+\\s-]", "").trim()),
                    dadosSeparados[2].trim(),
                    Integer.parseInt(dadosSeparados[3].trim()),
                    dadosSeparados[4].trim(),
                    dadosSeparados[5].trim()
            );

            clienteDAO.alterarCliente(clienteAtualizado);
            JOptionPane.showMessageDialog(null,
                    "Cliente alterado com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao alterar um cliente! Por favor, verifique as informações dadas!",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void excluir(String cpfString) {
        try {
            Long cpf = Long.parseLong(cpfString.replaceAll("[.-]", "").trim());
            Cliente cliente = clienteDAO.consultarUmCliente(cpf);

            if (cliente == null) {
                JOptionPane.showMessageDialog(null,
                        "Cliente não encontrado!",
                        "Exclusão de Cliente",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirmacao = JOptionPane.showConfirmDialog(null,
                    "Tem certeza que deseja excluir o cliente " + cliente.getNome() + "?",
                    "Confirmar Exclusão",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                clienteDAO.excluirCliente(cpf);
                JOptionPane.showMessageDialog(null,
                        "Cliente excluído com sucesso!",
                        "Exclusão de Cliente",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao alterar um cliente! Por favor, verifique as informações dadas!",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,
                "Obrigado por usar nosso programa!",
                "Saindo",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
