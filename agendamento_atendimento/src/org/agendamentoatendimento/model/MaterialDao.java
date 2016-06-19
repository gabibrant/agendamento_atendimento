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
public class MaterialDao extends GenericDao {
     public void salvar(Material material) throws SQLException {
        String insert = "INSERT INTO materiais (nome, preco) VALUES(?,?)";
        save(insert, material.getNome(), material.getPreco());
    }

    public void alterar(Material material) throws SQLException {
        String update = "UPDATE materiais " +
                "SET nome = ?, preco = ? " +
                "WHERE id = ?";
        update(update, material.getId(), material.getNome(), material.getPreco());
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM materias WHERE id = ?";
        delete(delete, id);
    }
    
}
