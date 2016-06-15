package org.agendamentoatendimento.controller;

import org.agendamentoatendimento.model.Cliente;

/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:53 PM
 */
public class ClienteController {

	public Cliente m_Cliente;

	public ClienteController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param identidade
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param cpf
	 * @param dataNascimento
	 */
	public int createCliente(String identidade, String nome, String email, String telefone, String cpf, String dataNascimento){
		return 0;
	}

	/**
	 * 
	 * @param identidade
	 */
	public String readCliente(String identidade){
		return "";
	}

	public ArrayList<Cliente> readAllCliente(){
		return null;
	}

	/**
	 * 
	 * @param identidade
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param cpf
	 * @param dataNascimento
	 */
	public int updateCliente(String identidade, String nome, String email, String telefone, String cpf, String dataNascimento){
		return 0;
	}

	/**
	 * 
	 * @param identidade
	 */
	public int deleteCliente(String identidade){
		return 0;
	}

}