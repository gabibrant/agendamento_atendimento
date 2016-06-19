/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.model;

import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
/**
 *
 * @author Gabriela
 */
public class ClienteDao extends GenericDao{
    public void salvar(Cliente cliente) throws SQLException {
        String insert = "INSERT INTO clientes(cpf, nome, email, telefone, rg, dataNasc) VALUES(?,?,?,?,?,?)";
        save(insert, cliente.getCpf(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getRg(), cliente.getDataNasc());
    }

    public void alterar(Cliente cliente) throws SQLException {
        String update = "UPDATE clientes " +
                "SET nome = ?, email = ?, telefone = ?, rg = ?, dataNasc = ? " +
                "WHERE cpf = ?";
        update(update, cliente.getCpf(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getRg(), cliente.getDataNasc());
    }

    public void excluir(String cpf) throws SQLException {
        String delete = "DELETE FROM clientes WHERE cpf = ?";
        delete(delete, cpf);
    }
}
