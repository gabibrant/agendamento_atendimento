package org.agendamentoatendimento.controller;

import java.util.ArrayList;
import java.util.Calendar;
import org.agendamentoatendimento.model.Material;
import org.agendamentoatendimento.model.Orcamento;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:55 PM
 */
public class OrcamentoController {

	public Orcamento m_Orcamento;

	public OrcamentoController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param identificacao
	 * @param horasNecessarias
	 * @param valorHora
	 * @param materiais
	 * @param valorTotal
	 * @param dataCriacao
	 * @param prazoValidade
	 */
	public int createOrcamento(String identificacao, String horasNecessarias, Double valorHora, ArrayList<Material> materiais, Double valorTotal, Calendar dataCriacao, Calendar prazoValidade){
		return 0;
	}

	/**
	 * 
	 * @param identificacao
	 */
	public String readOrcamento(String identificacao){
		return "";
	}

	public ArrayList<Orcamento> realAllOrcamento(){
		return null;
	}

	/**
	 * 
	 * @param identificacao
	 * @param horasNecessarias
	 * @param valorHora
	 * @param materiais
	 * @param valorTotal
	 * @param prazoValidade
	 */
	public int updateOrcamento(String identificacao, String horasNecessarias, Double valorHora, ArrayList<Material> materiais, Double valorTotal, Calendar prazoValidade){
		return 0;
	}

	/**
	 * 
	 * @param identificacao
	 */
	public int deleteOrcamento(String identificacao){
		return 0;
	}

}