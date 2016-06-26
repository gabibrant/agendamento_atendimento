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

    public OrdemServico(int codigo, Cliente cliente, Tecnico profissional, Habilidades habilidade, Status status, String observacao, Orcamento orcamento, Calendar conclusao, Pagamento pagamento) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.profissional = profissional;
        this.habilidade = habilidade;
        this.status = status;
        this.observacao = observacao;
        this.orcamento = orcamento;
        this.conclusao = conclusao;
        this.pagamento = pagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getProfissional() {
        return profissional;
    }

    public void setProfissional(Tecnico profissional) {
        this.profissional = profissional;
    }

    public Habilidades getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidades habilidade) {
        this.habilidade = habilidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public char[] getDescricao() {
        return descricao;
    }

    public void setDescricao(char[] descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Calendar getConclusao() {
        return conclusao;
    }

    public void setConclusao(Calendar conclusao) {
        this.conclusao = conclusao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

	public OrdemServico(){

	}

	public void finalize() throws Throwable {

	}

}