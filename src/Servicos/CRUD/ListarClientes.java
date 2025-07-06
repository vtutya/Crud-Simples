package Servicos.CRUD;

import Modelos.ListaDeClientes;

public class ListarClientes {


    public void buscarClientePeloCpf(String cpf, ListaDeClientes listClient){
        for (int i = 0; i < listClient.listaDeClientes.size(); i++) {
            if (listClient.listaDeClientes.get(i).getCpf().equals(cpf)) {
                System.out.println("Cliente encontrado: " + listClient.listaDeClientes.get(i).toString());
                return;
            }
        }
        System.out.println("Cliente com CPF " + cpf + " não encontrado.");
    }

    public void listarTodosClientes(ListaDeClientes lista){
        for (int i = 0; i < lista.listaDeClientes.size(); i++) {
            System.out.println("Cliente " + (i + 1) + ": " + lista.listaDeClientes.get(i).toString());
        }
    }




}
