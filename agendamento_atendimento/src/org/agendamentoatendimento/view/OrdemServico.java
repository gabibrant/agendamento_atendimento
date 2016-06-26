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
@Table(name = "ordem_servico", catalog = "agendamento_atendimento", schema = "")
@NamedQueries({
    @NamedQuery(name = "OrdemServico.findAll", query = "SELECT o FROM OrdemServico o"),
    @NamedQuery(name = "OrdemServico.findById", query = "SELECT o FROM OrdemServico o WHERE o.id = :id"),
    @NamedQuery(name = "OrdemServico.findByMatrTecnico", query = "SELECT o FROM OrdemServico o WHERE o.matrTecnico = :matrTecnico"),
    @NamedQuery(name = "OrdemServico.findByHabilidade", query = "SELECT o FROM OrdemServico o WHERE o.habilidade = :habilidade"),
    @NamedQuery(name = "OrdemServico.findByCpfCliente", query = "SELECT o FROM OrdemServico o WHERE o.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "OrdemServico.findByIdOrcamento", query = "SELECT o FROM OrdemServico o WHERE o.idOrcamento = :idOrcamento"),
    @NamedQuery(name = "OrdemServico.findByIdPagamento", query = "SELECT o FROM OrdemServico o WHERE o.idPagamento = :idPagamento"),
    @NamedQuery(name = "OrdemServico.findByDataConclusao", query = "SELECT o FROM OrdemServico o WHERE o.dataConclusao = :dataConclusao"),
    @NamedQuery(name = "OrdemServico.findByObservacao", query = "SELECT o FROM OrdemServico o WHERE o.observacao = :observacao"),
    @NamedQuery(name = "OrdemServico.findByStatus", query = "SELECT o FROM OrdemServico o WHERE o.status = :status")})
public class OrdemServico implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "matr_tecnico")
    private Integer matrTecnico;
    @Column(name = "habilidade")
    private String habilidade;
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Column(name = "id_orcamento")
    private Integer idOrcamento;
    @Column(name = "id_pagamento")
    private Integer idPagamento;
    @Column(name = "dataConclusao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConclusao;
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "status")
    private String status;

    public OrdemServico() {
    }

    public OrdemServico(Integer id) {
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

    public Integer getMatrTecnico() {
        return matrTecnico;
    }

    public void setMatrTecnico(Integer matrTecnico) {
        Integer oldMatrTecnico = this.matrTecnico;
        this.matrTecnico = matrTecnico;
        changeSupport.firePropertyChange("matrTecnico", oldMatrTecnico, matrTecnico);
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        String oldHabilidade = this.habilidade;
        this.habilidade = habilidade;
        changeSupport.firePropertyChange("habilidade", oldHabilidade, habilidade);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        String oldCpfCliente = this.cpfCliente;
        this.cpfCliente = cpfCliente;
        changeSupport.firePropertyChange("cpfCliente", oldCpfCliente, cpfCliente);
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        Integer oldIdOrcamento = this.idOrcamento;
        this.idOrcamento = idOrcamento;
        changeSupport.firePropertyChange("idOrcamento", oldIdOrcamento, idOrcamento);
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        Integer oldIdPagamento = this.idPagamento;
        this.idPagamento = idPagamento;
        changeSupport.firePropertyChange("idPagamento", oldIdPagamento, idPagamento);
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        Date oldDataConclusao = this.dataConclusao;
        this.dataConclusao = dataConclusao;
        changeSupport.firePropertyChange("dataConclusao", oldDataConclusao, dataConclusao);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
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
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.agendamentoatendimento.view.OrdemServico[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
