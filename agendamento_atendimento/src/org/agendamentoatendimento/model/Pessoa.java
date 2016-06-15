package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public class Pessoa {

	private String nome;
	private String email;
	private String telefone;
	public OrdemServico m_OrdemServico;

	public Pessoa(){

	}

	public void finalize() throws Throwable {

	}

	public String toString(){
		return "";
	}

}