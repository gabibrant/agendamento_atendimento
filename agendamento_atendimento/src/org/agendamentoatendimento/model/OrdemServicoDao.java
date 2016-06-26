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
public class OrdemServicoDao extends GenericDao{
    public void salvar(OrdemServico ordemServico) throws SQLException {
        String insert = "INSERT INTO ordem_servico (matr_tecnico, habilidade, cpf_cliente, id_orcamento, id_pagamento, dataConclusao, observacao, status) VALUES(?,?,?,?,?,?,?,?)";
        save(insert, ordemServico.getProfissional().getId(),  ordemServico.getHabilidade(), 
                ordemServico.getCliente().getCpf(), ordemServico.getOrcamento().getId(), 
                ordemServico.getPagamento().getNumRecibo(), ordemServico.getConclusao(), 
                ordemServico.getObservacao(), ordemServico.getStatus(),
                ordemServico.getCodigo());
    }

    public void alterar(OrdemServico ordemServico) throws SQLException {
        String update = "UPDATE ordem_servico " +
                "SET matr_tecnico = ?, habilidade = ?,"
                + " cpf_cliente = ?, id_orcamento = ?,"
                + " id_pagamento = ?, dataConclusao = ?,"
                + " observacao = ?, status = ?" +
                "WHERE id = ?";
        update(update, ordemServico.getProfissional().getId(),  ordemServico.getHabilidade(), 
                ordemServico.getCliente().getCpf(), ordemServico.getOrcamento().getId(), 
                ordemServico.getPagamento().getNumRecibo(), ordemServico.getConclusao(), 
                ordemServico.getObservacao(), ordemServico.getStatus(),
                ordemServico.getCodigo());
    }

    public void excluir(int id) throws SQLException {
        String delete = "DELETE FROM orcamentos WHERE id = ?";
        delete(delete, id);
    }
}
