package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:55 PM
 */
public class Orcamento {

	private String identificacao;
	private String horasNecessarias;
	private Double valorHora;
	private ArrayList<Material> materiais;
	private static Double TAXAISS;
	private Double valorTotal;
	private Calendar dataCriacao;
	private Calendar prazoValidade;
	public Material m_Material;

	public Orcamento(){

	}

	public void finalize() throws Throwable {

	}

	public String gerarFatura(){
		return "";
	}

	public String toString(){
		return "";
	}

}