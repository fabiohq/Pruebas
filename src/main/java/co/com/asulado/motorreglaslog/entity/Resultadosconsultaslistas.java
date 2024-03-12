package co.com.asulado.motorreglaslog.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "resultadosconsultaslistas")
@NamedQueries({
    @NamedQuery(name = "Resultadosconsultaslistas.findAll", query = "SELECT r FROM Resultadosconsultaslistas r"),
    @NamedQuery(name = "Resultadosconsultaslistas.findByIdresultadosconsultaslistas", query = "SELECT r FROM Resultadosconsultaslistas r WHERE r.idresultadosconsultaslistas = :idresultadosconsultaslistas"),
    @NamedQuery(name = "Resultadosconsultaslistas.findByGeneracoincidencia", query = "SELECT r FROM Resultadosconsultaslistas r WHERE r.generacoincidencia = :generacoincidencia"),
    @NamedQuery(name = "Resultadosconsultaslistas.findByTipolistas", query = "SELECT r FROM Resultadosconsultaslistas r WHERE r.tipolistas = :tipolistas")})
public class Resultadosconsultaslistas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idresultadosconsultaslistas")
    private Integer idresultadosconsultaslistas;
    @Basic(optional = false)
    @Column(name = "generacoincidencia")
    private String generacoincidencia;
    @Basic(optional = false)
    @Column(name = "tipolistas")
    private String tipolistas;
    @OneToMany(mappedBy = "idresultadosconsultaslistas")
    private Collection<Detallevalidacion> detallevalidacionCollection;

    public Resultadosconsultaslistas() {
    }

    public Resultadosconsultaslistas(Integer idresultadosconsultaslistas) {
        this.idresultadosconsultaslistas = idresultadosconsultaslistas;
    }

    public Resultadosconsultaslistas(Integer idresultadosconsultaslistas, String generacoincidencia, String tipolistas) {
        this.idresultadosconsultaslistas = idresultadosconsultaslistas;
        this.generacoincidencia = generacoincidencia;
        this.tipolistas = tipolistas;
    }

    public Integer getIdresultadosconsultaslistas() {
        return idresultadosconsultaslistas;
    }

    public void setIdresultadosconsultaslistas(Integer idresultadosconsultaslistas) {
        this.idresultadosconsultaslistas = idresultadosconsultaslistas;
    }

    public String getGeneracoincidencia() {
        return generacoincidencia;
    }

    public void setGeneracoincidencia(String generacoincidencia) {
        this.generacoincidencia = generacoincidencia;
    }

    public String getTipolistas() {
        return tipolistas;
    }

    public void setTipolistas(String tipolistas) {
        this.tipolistas = tipolistas;
    }

    public Collection<Detallevalidacion> getDetallevalidacionCollection() {
        return detallevalidacionCollection;
    }

    public void setDetallevalidacionCollection(Collection<Detallevalidacion> detallevalidacionCollection) {
        this.detallevalidacionCollection = detallevalidacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresultadosconsultaslistas != null ? idresultadosconsultaslistas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadosconsultaslistas)) {
            return false;
        }
        Resultadosconsultaslistas other = (Resultadosconsultaslistas) object;
        if ((this.idresultadosconsultaslistas == null && other.idresultadosconsultaslistas != null) || (this.idresultadosconsultaslistas != null && !this.idresultadosconsultaslistas.equals(other.idresultadosconsultaslistas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Resultadosconsultaslistas[ idresultadosconsultaslistas=" + idresultadosconsultaslistas + " ]";
    }
    
}
