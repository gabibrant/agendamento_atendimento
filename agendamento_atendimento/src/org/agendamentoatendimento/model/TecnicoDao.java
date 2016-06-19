/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.model;

import java.sql.SQLException;

/**
 *
 * @author Gabriela
 */
public class TecnicoDao extends GenericDao{
    public void salvar(Tecnico tecnico) throws SQLException {
        String insert = "INSERT INTO tecnico(nome, email, telefone, habilidade) VALUES(?,?,?,?)";
        save(insert, tecnico.getNome(), tecnico.getEmail(), tecnico.getTelefone(), tecnico.getHabilidade().toString());
    }

    public void alterar(Tecnico tecnico) throws SQLException {
        String update = "UPDATE tecnico " +
                "SET nome = ?, email = ?, telefone = ?, habilidade = ? " +
                "WHERE matr = ?";
        update(update, tecnico.getMatr(), tecnico.getNome(), tecnico.getEmail(), tecnico.getTelefone(), tecnico.getHabilidade().toString());
    }

    public void excluir(int matr) throws SQLException {
        String delete = "DELETE FROM tecnico WHERE matr = ?";
        delete(delete, matr);
    }
}
