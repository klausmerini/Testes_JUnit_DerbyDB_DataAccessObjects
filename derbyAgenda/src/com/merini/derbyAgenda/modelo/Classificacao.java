package com.merini.derbyAgenda.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Klaus
 */
@Entity
@Table(name = "classificacao")
@NamedQueries({
    @NamedQuery(name = "Classificacao.findAll", query = "SELECT c FROM Classificacao c")})
public class Classificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
    private Integer idclassificacao;

//    @JoinColumn(name = "idagenda", referencedColumnName = "idagenda")
//    @ManyToOne
//    private Agenda agenda;
        
    @Column(name = "nomeclassificacao")
    private String nomeclassificacao;
    
    @Column(name = "cor")
    private String cor;
    
    @Column(name = "descricao")
    private String descricao;
    
//    @OneToMany(mappedBy = "idpendencia")
//    private Collection<Pendencia> pendenciaCollection;

    public Classificacao() {
    	System.out.println("Construtor sem parametros");
    	// TODO Auto-generated constructor stub
	}
    
    public Classificacao(String nomeClassificacao, String descricao) 
    {
    	setNomeclassificacao(nomeClassificacao);
    	setDescricao(descricao);
    }

    public Classificacao(Integer idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public Integer getIdclassificacao() {
        return idclassificacao;
    }

    public void setIdclassificacao(Integer idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public String getNomeclassificacao() {
        return nomeclassificacao;
    }

    public void setNomeclassificacao(String nomeclassificacao) {
        this.nomeclassificacao = nomeclassificacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idclassificacao != null ? idclassificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classificacao)) {
            return false;
        }
        Classificacao other = (Classificacao) object;
        if ((this.idclassificacao == null && other.idclassificacao != null) || (this.idclassificacao != null && !this.idclassificacao.equals(other.idclassificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Classificacao[ idclassificacao=" + idclassificacao + " ]";
    }
    
}
