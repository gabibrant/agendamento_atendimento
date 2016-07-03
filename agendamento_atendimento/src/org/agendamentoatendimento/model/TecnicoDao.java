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
        String insert = "INSERT INTO tecnicos (nome, email, telefone, habilidade) VALUES(?,?,?,?)";
        save(insert, tecnico.getNome(), tecnico.getEmail(), tecnico.getTelefone(), tecnico.getHabilidade().getId());
    }

    public void alterar(Tecnico tecnico) throws SQLException {
        String update = "UPDATE tecnicos " +
                "SET nome = ?, email = ?, telefone = ?, habilidade = ? " +
                "WHERE matr = ?";
        update(update, tecnico.getMatr(), tecnico.getNome(), tecnico.getEmail(), tecnico.getTelefone(), tecnico.getHabilidade().getId());
    }

    public void excluir(int matr) throws SQLException {
        String delete = "DELETE FROM tecnicos WHERE matr = ?";
        delete(delete, matr);
    }
}
