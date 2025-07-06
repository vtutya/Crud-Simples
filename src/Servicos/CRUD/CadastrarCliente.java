package Servicos.CRUD;

import ConexaoComApi.ConexaoApi;
import Modelos.Cliente;
import Modelos.ListaDeClientes;
import Servicos.SalvarEmCsv.SalvarClienteEmCsv;

import java.util.Scanner;

public class CadastrarCliente {
    ConexaoApi conexaoApi = new ConexaoApi();
    Scanner scanner = new Scanner(System.in);
    SalvarClienteEmCsv salvarClienteEmCsv = new SalvarClienteEmCsv();
    ListaDeClientes listaDeClientes;


    public void cadCliente(){
        System.out.println("Digite o nome do Cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o email do Cliente:");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone do Cliente:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o CPF do Cliente:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a data de nascimento: (DD/MM/AAAA)");
        String dataNascimento = scanner.nextLine();


        System.out.println("Digite o CEP do Cliente:");
        String cep = scanner.nextLine();
        conexaoApi.buscarEndereco(cep);


        Cliente cliente = new Cliente(nome, email, telefone, cpf, dataNascimento, cep);

        listaDeClientes.listaDeClientes.add(cliente);


        salvarClienteEmCsv.salvarClientesEmCsv("clientes.csv", listaDeClientes);

        System.out.println("Cliente cadastrado com sucesso!" + cliente.toString());

    }


}
