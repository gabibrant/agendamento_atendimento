package org.agendamentoatendimento.model;


/**
 * @author Paulo-Lehman
 * @version 1.0
 * @created 15-Jun-2016 8:15:57 PM
 */
public class Pessoa {
    private int id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
        
        

}