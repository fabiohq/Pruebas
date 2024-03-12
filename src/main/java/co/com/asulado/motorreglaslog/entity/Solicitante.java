
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
@Table(name = "solicitante")
@NamedQueries({
    @NamedQuery(name = "Solicitante.findAll", query = "SELECT s FROM Solicitante s"),
    @NamedQuery(name = "Solicitante.findByIdsolicitante", query = "SELECT s FROM Solicitante s WHERE s.idsolicitante = :idsolicitante"),
    @NamedQuery(name = "Solicitante.findByTipodocumentoidentidad", query = "SELECT s FROM Solicitante s WHERE s.tipodocumentoidentidad = :tipodocumentoidentidad"),
    @NamedQuery(name = "Solicitante.findByNumerodocumentoidentidad", query = "SELECT s FROM Solicitante s WHERE s.numerodocumentoidentidad = :numerodocumentoidentidad"),
    @NamedQuery(name = "Solicitante.findByNombrecompleto", query = "SELECT s FROM Solicitante s WHERE s.nombrecompleto = :nombrecompleto")})
public class Solicitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsolicitante")
    private Integer idsolicitante;
    @Basic(optional = false)
    @Column(name = "tipodocumentoidentidad")
    private String tipodocumentoidentidad;
    @Basic(optional = false)
    @Column(name = "numerodocumentoidentidad")
    private String numerodocumentoidentidad;
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @OneToMany(mappedBy = "idsolicitante")
    private Collection<Detallevalidacion> detallevalidacionCollection;

    public Solicitante() {
    }

    public Solicitante(Integer idsolicitante) {
        this.idsolicitante = idsolicitante;
    }

    public Solicitante(Integer idsolicitante, String tipodocumentoidentidad, String numerodocumentoidentidad) {
        this.idsolicitante = idsolicitante;
        this.tipodocumentoidentidad = tipodocumentoidentidad;
        this.numerodocumentoidentidad = numerodocumentoidentidad;
    }

    public Integer getIdsolicitante() {
        return idsolicitante;
    }

    public void setIdsolicitante(Integer idsolicitante) {
        this.idsolicitante = idsolicitante;
    }

    public String getTipodocumentoidentidad() {
        return tipodocumentoidentidad;
    }

    public void setTipodocumentoidentidad(String tipodocumentoidentidad) {
        this.tipodocumentoidentidad = tipodocumentoidentidad;
    }

    public String getNumerodocumentoidentidad() {
        return numerodocumentoidentidad;
    }

    public void setNumerodocumentoidentidad(String numerodocumentoidentidad) {
        this.numerodocumentoidentidad = numerodocumentoidentidad;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
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
        hash += (idsolicitante != null ? idsolicitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitante)) {
            return false;
        }
        Solicitante other = (Solicitante) object;
        if ((this.idsolicitante == null && other.idsolicitante != null) || (this.idsolicitante != null && !this.idsolicitante.equals(other.idsolicitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Solicitante[ idsolicitante=" + idsolicitante + " ]";
    }
    
}
