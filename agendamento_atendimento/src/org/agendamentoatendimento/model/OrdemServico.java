package org.agendamentoatendimento.model;


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
	private Status status = 0;
	private char[300] descricao;
	private String observacao;
	private Orcamento orcamento;
	private Calendar conclusao;
	private Fatura fatura;
	private Pagamento pagamento;
	public Orcamento m_Orcamento;
	public Pagamento m_Pagamento;

	public OrdemServico(){

	}

	public void finalize() throws Throwable {

	}

}