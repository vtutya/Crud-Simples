package Servicos;

import Modelos.Cliente;
import Modelos.ListaDeClientes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SalvarClienteEmCsv {

    String caminhoArquivo = "clientes.csv";

    public void salvarClientesEmCsv(String caminhoArquivo, ListaDeClientes listaDeClientes) {

        if (listaDeClientes.listaDeClientes.isEmpty()) {
            System.out.println("Nenhum cliente para salvar.");
            return;
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("Nome,CPF,Email,Telefone,Data de Nascimento,Cep\n");
            for (Cliente cliente : listaDeClientes.listaDeClientes) {
                StringBuilder linha = new StringBuilder();
                linha.append(cliente.getNome()).append(",").append(cliente.getCpf()).append(",").append(cliente.getEmail()).append(",").append(cliente.getTelefone()).append(",").append(cliente.getDataNascimento()).append(",").append(cliente.getCep()).append("\n");
                writer.write(linha.toString());
            }
            System.out.println("Clientes salvos com sucesso em " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }
}
