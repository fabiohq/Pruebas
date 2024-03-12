package co.com.asulado.motorreglaslog.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "detallevalidacion")
@NamedQueries({
    @NamedQuery(name = "Detallevalidacion.findAll", query = "SELECT d FROM Detallevalidacion d"),
    @NamedQuery(name = "Detallevalidacion.findByIddetallevalidacion", query = "SELECT d FROM Detallevalidacion d WHERE d.iddetallevalidacion = :iddetallevalidacion"),
    @NamedQuery(name = "Detallevalidacion.findByIddatosparticipante", query = "SELECT d FROM Detallevalidacion d WHERE d.iddatosparticipante = :iddatosparticipante")})
public class Detallevalidacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallevalidacion")
    private Integer iddetallevalidacion;
    @Column(name = "iddatosparticipante")
    private Integer iddatosparticipante;
    @JoinColumn(name = "idinformaciontransaccion", referencedColumnName = "idinformaciontransaccion")
    @ManyToOne
    private Informaciontransaccion idinformaciontransaccion;
    @JoinColumn(name = "idresultadosconsultaslistas", referencedColumnName = "idresultadosconsultaslistas")
    @ManyToOne
    private Resultadosconsultaslistas idresultadosconsultaslistas;
    @JoinColumn(name = "idresultadovalidacion", referencedColumnName = "idresultadovalidacion")
    @ManyToOne
    private Resultadovalidacion idresultadovalidacion;
    @JoinColumn(name = "idsolicitante", referencedColumnName = "idsolicitante")
    @ManyToOne
    private Solicitante idsolicitante;
    @JoinColumn(name = "idvalidacionidentidad", referencedColumnName = "idvalidacionidentidad")
    @ManyToOne(optional = false)
    private Validacionidentidad idvalidacionidentidad;

    public Detallevalidacion() {
    }

    public Detallevalidacion(Integer iddetallevalidacion) {
        this.iddetallevalidacion = iddetallevalidacion;
    }

    public Integer getIddetallevalidacion() {
        return iddetallevalidacion;
    }

    public void setIddetallevalidacion(Integer iddetallevalidacion) {
        this.iddetallevalidacion = iddetallevalidacion;
    }

    public Integer getIddatosparticipante() {
        return iddatosparticipante;
    }

    public void setIddatosparticipante(Integer iddatosparticipante) {
        this.iddatosparticipante = iddatosparticipante;
    }

    public Informaciontransaccion getIdinformaciontransaccion() {
        return idinformaciontransaccion;
    }

    public void setIdinformaciontransaccion(Informaciontransaccion idinformaciontransaccion) {
        this.idinformaciontransaccion = idinformaciontransaccion;
    }

    public Resultadosconsultaslistas getIdresultadosconsultaslistas() {
        return idresultadosconsultaslistas;
    }

    public void setIdresultadosconsultaslistas(Resultadosconsultaslistas idresultadosconsultaslistas) {
        this.idresultadosconsultaslistas = idresultadosconsultaslistas;
    }

    public Resultadovalidacion getIdresultadovalidacion() {
        return idresultadovalidacion;
    }

    public void setIdresultadovalidacion(Resultadovalidacion idresultadovalidacion) {
        this.idresultadovalidacion = idresultadovalidacion;
    }

    public Solicitante getIdsolicitante() {
        return idsolicitante;
    }

    public void setIdsolicitante(Solicitante idsolicitante) {
        this.idsolicitante = idsolicitante;
    }

    public Validacionidentidad getIdvalidacionidentidad() {
        return idvalidacionidentidad;
    }

    public void setIdvalidacionidentidad(Validacionidentidad idvalidacionidentidad) {
        this.idvalidacionidentidad = idvalidacionidentidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallevalidacion != null ? iddetallevalidacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallevalidacion)) {
            return false;
        }
        Detallevalidacion other = (Detallevalidacion) object;
        if ((this.iddetallevalidacion == null && other.iddetallevalidacion != null) || (this.iddetallevalidacion != null && !this.iddetallevalidacion.equals(other.iddetallevalidacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detallevalidacion[ iddetallevalidacion=" + iddetallevalidacion + " ]";
    }
    
}
