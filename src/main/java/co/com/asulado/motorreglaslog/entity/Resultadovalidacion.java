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
@Table(name = "resultadovalidacion")
@NamedQueries({
    @NamedQuery(name = "Resultadovalidacion.findAll", query = "SELECT r FROM Resultadovalidacion r"),
    @NamedQuery(name = "Resultadovalidacion.findByIdresultadovalidacion", query = "SELECT r FROM Resultadovalidacion r WHERE r.idresultadovalidacion = :idresultadovalidacion"),
    @NamedQuery(name = "Resultadovalidacion.findByMecanismoautenticacion", query = "SELECT r FROM Resultadovalidacion r WHERE r.mecanismoautenticacion = :mecanismoautenticacion"),
    @NamedQuery(name = "Resultadovalidacion.findByReglaaplicada", query = "SELECT r FROM Resultadovalidacion r WHERE r.reglaaplicada = :reglaaplicada"),
    @NamedQuery(name = "Resultadovalidacion.findByScore", query = "SELECT r FROM Resultadovalidacion r WHERE r.score = :score"),
    @NamedQuery(name = "Resultadovalidacion.findByNivelriesgo", query = "SELECT r FROM Resultadovalidacion r WHERE r.nivelriesgo = :nivelriesgo"),
    @NamedQuery(name = "Resultadovalidacion.findByGeneraalerta", query = "SELECT r FROM Resultadovalidacion r WHERE r.generaalerta = :generaalerta")})
public class Resultadovalidacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idresultadovalidacion")
    private Integer idresultadovalidacion;
    @Basic(optional = false)
    @Column(name = "mecanismoautenticacion")
    private String mecanismoautenticacion;
    @Basic(optional = false)
    @Column(name = "reglaaplicada")
    private String reglaaplicada;
    @Basic(optional = false)
    @Column(name = "score")
    private String score;
    @Basic(optional = false)
    @Column(name = "nivelriesgo")
    private String nivelriesgo;
    @Basic(optional = false)
    @Column(name = "generaalerta")
    private String generaalerta;
    @OneToMany(mappedBy = "idresultadovalidacion")
    private Collection<Detallevalidacion> detallevalidacionCollection;

    public Resultadovalidacion() {
    }

    public Resultadovalidacion(Integer idresultadovalidacion) {
        this.idresultadovalidacion = idresultadovalidacion;
    }

    public Resultadovalidacion(Integer idresultadovalidacion, String mecanismoautenticacion, String reglaaplicada, String score, String nivelriesgo, String generaalerta) {
        this.idresultadovalidacion = idresultadovalidacion;
        this.mecanismoautenticacion = mecanismoautenticacion;
        this.reglaaplicada = reglaaplicada;
        this.score = score;
        this.nivelriesgo = nivelriesgo;
        this.generaalerta = generaalerta;
    }

    public Integer getIdresultadovalidacion() {
        return idresultadovalidacion;
    }

    public void setIdresultadovalidacion(Integer idresultadovalidacion) {
        this.idresultadovalidacion = idresultadovalidacion;
    }

    public String getMecanismoautenticacion() {
        return mecanismoautenticacion;
    }

    public void setMecanismoautenticacion(String mecanismoautenticacion) {
        this.mecanismoautenticacion = mecanismoautenticacion;
    }

    public String getReglaaplicada() {
        return reglaaplicada;
    }

    public void setReglaaplicada(String reglaaplicada) {
        this.reglaaplicada = reglaaplicada;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getNivelriesgo() {
        return nivelriesgo;
    }

    public void setNivelriesgo(String nivelriesgo) {
        this.nivelriesgo = nivelriesgo;
    }

    public String getGeneraalerta() {
        return generaalerta;
    }

    public void setGeneraalerta(String generaalerta) {
        this.generaalerta = generaalerta;
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
        hash += (idresultadovalidacion != null ? idresultadovalidacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadovalidacion)) {
            return false;
        }
        Resultadovalidacion other = (Resultadovalidacion) object;
        if ((this.idresultadovalidacion == null && other.idresultadovalidacion != null) || (this.idresultadovalidacion != null && !this.idresultadovalidacion.equals(other.idresultadovalidacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Resultadovalidacion[ idresultadovalidacion=" + idresultadovalidacion + " ]";
    }
    
}
