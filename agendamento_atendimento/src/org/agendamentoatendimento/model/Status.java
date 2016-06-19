package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public enum Status {
    cadastrada("Cadastrada"), 
    aguardando_orçamento("Aguardando Orçamento"),
    aguardando_cliente("Aguardando Aprovação do Cliente"), 
    cancelada("Cancelada"), 
    aprovada("Aprovada"),
    em_andamento("Em Andamento"), 
    concluida("Concluída"), 
    em_cobranca("Em Cobrança"), 
    encerrada("Encerrada");
    
    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String descricao() {
        return descricao;
    }

    public OrdemServico m_OrdemServico;
}