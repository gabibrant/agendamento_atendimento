package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:56 PM
 */
public class Pagamento {

	private Integer numRecibo;
	private String forma;
	private String nomeInstituicao;

    public Pagamento(Integer numRecibo, String forma, String nomeInstituicao) {
        this.numRecibo = numRecibo;
        this.forma = forma;
        this.nomeInstituicao = nomeInstituicao;
    }

    public Integer getNumRecibo() {
        return numRecibo;
    }

    public void setNumRecibo(Integer numRecibo) {
        this.numRecibo = numRecibo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

	public Pagamento(){

	}

	public void finalize() throws Throwable {

	}

}