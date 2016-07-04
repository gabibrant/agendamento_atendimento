/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.model;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Gabriela
 */
public class OrcamentoDao extends GenericDao{
    public void salvar(Orcamento orcamento) throws SQLException {
        String insert = "INSERT INTO orcamentos (criacao, horasNecessarias, prazoValidade, taxaISS, valorHora, valorTotal) VALUES(?,?,?,?,?,?)";
        save(insert, new SimpleDateFormat("yyyy-MM-dd").format(orcamento.getDataCriacao().getTime()), 
                orcamento.getHorasNecessarias(), new SimpleDateFormat("yyyy-MM-dd").format(orcamento.getPrazoValidade().getTime()), 
                orcamento.getValorISS(), orcamento.getValorHora(), orcamento.getValorTotal());
    }

    public void alterar(Orcamento orcamento) throws SQLException {
        String update = "UPDATE orcamentos " +
                "SET criacao = ?, horasNecessarias = ?, prazoValidade = ?, taxaISS = ?, valorHora = ?, valorTotal = ? " +
                "WHERE id = ?";
        update(update, orcamento.getId(),  orcamento.getDataCriacao(), orcamento.getHorasNecessarias(), orcamento.getPrazoValidade(), orcamento.getValorISS(), orcamento.getValorHora(), orcamento.getValorTotal());
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM orcamentos WHERE id = ?";
        delete(delete, id);
    }
}
