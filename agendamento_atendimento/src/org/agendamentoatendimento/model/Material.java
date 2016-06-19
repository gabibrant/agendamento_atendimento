package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:54 PM
 */
public class Material {
    
    private int id;
    private String nome;
    private Double preco;
    //private Integer quantidade; -> Atributo do orçamento
    //private Double precoTotal;  -> Atributo derivado preco*quantidade

    public Material(){

    }

    public void finalize() throws Throwable {

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}