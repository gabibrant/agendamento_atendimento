package org.agendamentoatendimento.controller;

import org.agendamentoatendimento.model.OrdemServico;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:56 PM
 */
public class OrdemServicoController {

	public ClienteController m_ClienteController;
	public OrdemServico m_OrdemServico;

	public OrdemServicoController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param nomeCliente
	 * @param numeroMatriculaTecnico
	 * @param habilidade
	 * @param status
	 * @param descricao
	 * @param observacao
	 * @param orcamento
	 * @param conclusao
	 * @param numReciboPagamento
	 */
	public int createOrdemServico(String nomeCliente, int numeroMatriculaTecnico, Habilidades habilidade, Status status, char[300] descricao, String observacao, Orcamento orcamento, Calendar conclusao, int numReciboPagamento){
		return 0;
	}

	/**
	 * 
	 * @param codigo
	 */
	public String readOrdemServico(int codigo){
		return "";
	}

	public ArrayList<OrdemServico> readAllOrdemServico(){
		return null;
	}

	/**
	 * 
	 * @param nomeCliente
	 * @param numeroMatriculaTecnico
	 * @param habilidade
	 * @param status
	 * @param descricao
	 * @param observacao
	 * @param orcamento
	 * @param conclusao
	 * @param numReciboPagamento
	 */
	public int updateOrdemServico(String nomeCliente, int numeroMatriculaTecnico, Habilidade habilidade, Status status, char[300] descricao, String observacao, Orcamento orcamento, Calendar conclusao, int numReciboPagamento){
		return 0;
	}

	/**
	 * 
	 * @param codigo
	 */
	public int deleteOrdemServico(int codigo){
		return 0;
	}

}