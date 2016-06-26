package org.agendamentoatendimento.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import org.agendamentoatendimento.model.Habilidades;
import org.agendamentoatendimento.model.Orcamento;
import org.agendamentoatendimento.model.OrdemServico;
import org.agendamentoatendimento.model.OrdemServicoDao;
import org.agendamentoatendimento.model.Pagamento;
import org.agendamentoatendimento.model.Status;
import org.agendamentoatendimento.model.TecnicoDao;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:56 PM
 */
public class OrdemServicoController {

	public ClienteController clienteController;
	public OrdemServico ordemServico;

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
	public int createOrdemServico(String nomeCliente, int numeroMatriculaTecnico, Habilidades habilidade, Status status, char[] descricao, String observacao, int idOrcamento, Calendar conclusao, int numReciboPagamento) throws SQLException{
            ordemServico = new OrdemServico();
            ordemServico.setCliente(null); //TODO
            ordemServico.setProfissional(new TecnicoController().readTecnico(numeroMatriculaTecnico));
            ordemServico.setHabilidade(habilidade);
            ordemServico.setStatus(status);
            ordemServico.setObservacao(observacao);
            ordemServico.setConclusao(conclusao);
            ordemServico.setOrcamento(new OrcamentoController().readOrcamento(idOrcamento));
            ordemServico.setPagamento(null); //TODO
                        
            new OrdemServicoDao().salvar(ordemServico);
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
	public int updateOrdemServico(String nomeCliente, int numeroMatriculaTecnico, Habilidades habilidade, Status status, char[] descricao, String observacao, Orcamento orcamento, Calendar conclusao, int numReciboPagamento){
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