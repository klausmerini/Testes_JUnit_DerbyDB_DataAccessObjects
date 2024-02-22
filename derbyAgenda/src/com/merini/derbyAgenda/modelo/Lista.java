package com.merini.derbyAgenda.modelo;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Klaus
 */
@Entity
@Table(name = "lista")
@NamedQueries({
    @NamedQuery(name = "Lista.findAll", query = "SELECT l FROM Lista l")})
public class Lista implements Serializable {

 //   private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idlista;
    
    @Column(name = "nomelista")
    private String nomeLista;
    
    @Column(name = "descrlista")
    private String descrlista;
    
    @JoinColumn(name = "idagenda", referencedColumnName = "idagenda")
    @ManyToOne
    private Agenda idagenda;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iditemlista")
    private Collection<Itemlista> itemlistaCollection;
    
    @JoinColumn(name = "idtipolista", referencedColumnName = "idtipolista")
    @ManyToOne(cascade = CascadeType.ALL)
    private TipoLista idtipolista;

    public Lista() {
    }

    public Lista(Integer idlista) {
        this.idlista = idlista;
    }

    public Integer getIdlista() {
        return idlista;
    }

    public void setIdlista(Integer idlista) {
        this.idlista = idlista;
    }

    public String getNomelista() {
        return nomeLista;
    }

    public void setNomelista(String nomelista) {
        this.nomeLista = nomelista;
    }

    public String getDescrlista() {
        return descrlista;
    }

    public void setDescrlista(String descrlista) {
        this.descrlista = descrlista;
    }

    public Agenda getIdagenda() {
        return idagenda;
    }

    public void setIdagenda(Agenda idagenda) {
        this.idagenda = idagenda;
    }

    public Collection<Itemlista> getItemlistaCollection() {
        return itemlistaCollection;
    }

    public void setItemlistaCollection(Collection<Itemlista> itemlistaCollection) {
        this.itemlistaCollection = itemlistaCollection;
    }

    public TipoLista getIdtipolista() {
		return idtipolista;
	}

	public void setIdtipolista(TipoLista idtipolista) {
		this.idtipolista = idtipolista;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idlista != null ? idlista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lista)) {
            return false;
        }
        Lista other = (Lista) object;
        if ((this.idlista == null && other.idlista != null) || (this.idlista != null && !this.idlista.equals(other.idlista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Lista[ idlista=" + idlista + " ]";
    }
    
}
