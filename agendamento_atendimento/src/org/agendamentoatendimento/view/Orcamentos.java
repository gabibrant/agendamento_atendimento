/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Paulo-Lehman
 */
@Entity
@Table(name = "orcamentos", catalog = "agendamento_atendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Orcamentos.findAll", query = "SELECT o FROM Orcamentos o"),
    @NamedQuery(name = "Orcamentos.findById", query = "SELECT o FROM Orcamentos o WHERE o.id = :id"),
    @NamedQuery(name = "Orcamentos.findByCriacao", query = "SELECT o FROM Orcamentos o WHERE o.criacao = :criacao"),
    @NamedQuery(name = "Orcamentos.findByHorasNecessarias", query = "SELECT o FROM Orcamentos o WHERE o.horasNecessarias = :horasNecessarias"),
    @NamedQuery(name = "Orcamentos.findByPrazoValidade", query = "SELECT o FROM Orcamentos o WHERE o.prazoValidade = :prazoValidade"),
    @NamedQuery(name = "Orcamentos.findByTaxaISS", query = "SELECT o FROM Orcamentos o WHERE o.taxaISS = :taxaISS"),
    @NamedQuery(name = "Orcamentos.findByValorHora", query = "SELECT o FROM Orcamentos o WHERE o.valorHora = :valorHora"),
    @NamedQuery(name = "Orcamentos.findByValorTotal", query = "SELECT o FROM Orcamentos o WHERE o.valorTotal = :valorTotal")})
public class Orcamentos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date criacao;
    @Column(name = "horasNecessarias")
    private String horasNecessarias;
    @Column(name = "prazoValidade")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prazoValidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "taxaISS")
    private Double taxaISS;
    @Column(name = "valorHora")
    private Double valorHora;
    @Column(name = "valorTotal")
    private Double valorTotal;

    public Orcamentos() {
    }

    public Orcamentos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        Date oldCriacao = this.criacao;
        this.criacao = criacao;
        changeSupport.firePropertyChange("criacao", oldCriacao, criacao);
    }

    public String getHorasNecessarias() {
        return horasNecessarias;
    }

    public void setHorasNecessarias(String horasNecessarias) {
        String oldHorasNecessarias = this.horasNecessarias;
        this.horasNecessarias = horasNecessarias;
        changeSupport.firePropertyChange("horasNecessarias", oldHorasNecessarias, horasNecessarias);
    }

    public Date getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(Date prazoValidade) {
        Date oldPrazoValidade = this.prazoValidade;
        this.prazoValidade = prazoValidade;
        changeSupport.firePropertyChange("prazoValidade", oldPrazoValidade, prazoValidade);
    }

    public Double getTaxaISS() {
        return taxaISS;
    }

    public void setTaxaISS(Double taxaISS) {
        Double oldTaxaISS = this.taxaISS;
        this.taxaISS = taxaISS;
        changeSupport.firePropertyChange("taxaISS", oldTaxaISS, taxaISS);
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        Double oldValorHora = this.valorHora;
        this.valorHora = valorHora;
        changeSupport.firePropertyChange("valorHora", oldValorHora, valorHora);
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        Double oldValorTotal = this.valorTotal;
        this.valorTotal = valorTotal;
        changeSupport.firePropertyChange("valorTotal", oldValorTotal, valorTotal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamentos)) {
            return false;
        }
        Orcamentos other = (Orcamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.agendamentoatendimento.view.Orcamentos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
