package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:53 PM
 */
public class Cliente extends Pessoa {

	private String identidade;
	private String cpf;
	private String dataNascimento;

	public Cliente(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String toString(){
		return "";
	}

}