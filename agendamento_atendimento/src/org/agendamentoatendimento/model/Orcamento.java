package org.agendamentoatendimento.model;

import java.util.ArrayList;
import java.util.Calendar;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:55 PM
 */
public class Orcamento {

    private int id;
    private Calendar dataCriacao;
    private String horasNecessarias;
    private Calendar prazoValidade;
    private Double valorHora;
    private Double valorISS;
    private Double valorTotal; 
    private ArrayList<Material> materiais;
    public static final Double TAXAISS = 0.05;
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getHorasNecessarias() {
        return horasNecessarias;
    }

    public void setHorasNecessarias(String horasNecessarias) {
        this.horasNecessarias = horasNecessarias;
    }

    public Calendar getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(Calendar prazoValidade) {
        this.prazoValidade = prazoValidade;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public ArrayList<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(ArrayList<Material> materiais) {
        this.materiais = materiais;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorISS() {
        return valorISS;
    }

    public void setValorISS(Double valorISS) {
        this.valorISS = valorISS;
    }
    
    
        

}