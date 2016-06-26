package org.agendamentoatendimento.model;

import java.util.Calendar;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:55 PM
 */
public class OrdemServico {

	private int codigo;
	private Cliente cliente;
	private Tecnico profissional;
	private Habilidades habilidade;
	private Status status;
	private char[] descricao = new char[300];
	private String observacao;
	private Orcamento orcamento;
	private Calendar conclusao;
	private Pagamento pagamento;

	public OrdemServico(){

	}

	public void finalize() throws Throwable {

	}

}