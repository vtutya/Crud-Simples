package Servicos.CRUD;

import Modelos.Cliente;
import Modelos.ListaDeClientes;
import Servicos.SalvarEmCsv.SalvarClienteEmCsv;

import java.util.ArrayList;

public class EditarCliente {

    public void alterarClientePeloCpf(Cliente cliente, String cpf, ListaDeClientes listClient , SalvarClienteEmCsv csv) {
        csv.abirCsv("clientes.csv");
        for (Cliente c : listClient.listaDeClientes ) {
            if (c.getCpf().equals(cpf)) {
                c.setNome(cliente.getNome());
                c.setEmail(cliente.getEmail());
                c.setTelefone(cliente.getTelefone());
                c.setDataNascimento(cliente.getDataNascimento());
                c.setCep(cliente.getCep());

                csv.salvarClientesEmCsv("clientes.csv", listClient);
                System.out.println("Cliente atualizado com sucesso: " + c.toString());
                return;
            }
        }

    }
}
