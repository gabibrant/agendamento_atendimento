package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public enum Status {
	Cadastrada,
	Aguardando Orçamento,
	Aguardando Aprovação do Cliente,
	Cancelada,
	Aprovada,
	Em Andamento,
	Concluída,
	Em Cobrança,
	Encerrada;

	public OrdemServico m_OrdemServico;
}