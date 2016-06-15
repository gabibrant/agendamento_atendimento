package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public enum Status {
	Cadastrada,
	Aguardando Or�amento,
	Aguardando Aprova��o do Cliente,
	Cancelada,
	Aprovada,
	Em Andamento,
	Conclu�da,
	Em Cobran�a,
	Encerrada;

	public OrdemServico m_OrdemServico;
}