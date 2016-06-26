/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Paulo-Lehman
 */
@Entity
@Table(name = "tecnicos", catalog = "agendamento_atendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tecnicos.findAll", query = "SELECT t FROM Tecnicos t"),
    @NamedQuery(name = "Tecnicos.findByMatr", query = "SELECT t FROM Tecnicos t WHERE t.matr = :matr"),
    @NamedQuery(name = "Tecnicos.findByNome", query = "SELECT t FROM Tecnicos t WHERE t.nome = :nome"),
    @NamedQuery(name = "Tecnicos.findByEmail", query = "SELECT t FROM Tecnicos t WHERE t.email = :email"),
    @NamedQuery(name = "Tecnicos.findByTelefone", query = "SELECT t FROM Tecnicos t WHERE t.telefone = :telefone"),
    @NamedQuery(name = "Tecnicos.findByHabilidade", query = "SELECT t FROM Tecnicos t WHERE t.habilidade = :habilidade")})
public class Tecnicos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "matr")
    private Integer matr;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "habilidade")
    private Integer habilidade;

    public Tecnicos() {
    }

    public Tecnicos(Integer matr) {
        this.matr = matr;
    }

    public Tecnicos(Integer matr, String nome) {
        this.matr = matr;
        this.nome = nome;
    }

    public Integer getMatr() {
        return matr;
    }

    public void setMatr(Integer matr) {
        Integer oldMatr = this.matr;
        this.matr = matr;
        changeSupport.firePropertyChange("matr", oldMatr, matr);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public Integer getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Integer habilidade) {
        Integer oldHabilidade = this.habilidade;
        this.habilidade = habilidade;
        changeSupport.firePropertyChange("habilidade", oldHabilidade, habilidade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matr != null ? matr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnicos)) {
            return false;
        }
        Tecnicos other = (Tecnicos) object;
        if ((this.matr == null && other.matr != null) || (this.matr != null && !this.matr.equals(other.matr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.agendamentoatendimento.view.Tecnicos[ matr=" + matr + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
