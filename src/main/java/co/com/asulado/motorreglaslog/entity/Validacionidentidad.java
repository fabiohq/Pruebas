package co.com.asulado.motorreglaslog.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "validacionidentidad")
//@NamedQueries({
//    @NamedQuery(name = "ValidacionIdentidadRepository.findAll", query = "SELECT v FROM ValidacionIdentidadRepository v"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByIdvalidacionidentidad", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.idvalidacionidentidad = :idvalidacionidentidad"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByFechahoracreacion", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.fechahoracreacion = :fechahoracreacion"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByFechahoraactualizacionresultado", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.fechahoraactualizacionresultado = :fechahoraactualizacionresultado"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByCodigoaplicacion", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.codigoaplicacion = :codigoaplicacion"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByNombreaplicacion", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.nombreaplicacion = :nombreaplicacion"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByMecanismoautenticacion", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.mecanismoautenticacion = :mecanismoautenticacion"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByIdtransaccion", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.idtransaccion = :idtransaccion"),
//    @NamedQuery(name = "ValidacionIdentidadRepository.findByResultado", query = "SELECT v FROM ValidacionIdentidadRepository v WHERE v.resultado = :resultado")})
public class Validacionidentidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvalidacionidentidad")
    private Integer idvalidacionidentidad;
    @Basic(optional = false)
    @Column(name = "fechahoracreacion")
    @Temporal(TemporalType.DATE)
    private Date fechahoracreacion;
    @Column(name = "fechahoraactualizacionresultado")
    @Temporal(TemporalType.DATE)
    private Date fechahoraactualizacion;
    @Column(name = "codigoaplicacion")
    private String codigoaplicacion;
    @Column(name = "nombreaplicacion")
    private String nombreaplicacion;
    @Column(name = "mecanismoautenticacion")
    private String mecanismoautenticacion;
    @Column(name = "idtransaccion")
    private String idtransaccion;
    @Column(name = "resultado")
    private String resultado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvalidacionidentidad")
    private Collection<Detallevalidacion> detallevalidacionCollection;

    public Validacionidentidad() {
    }

    public Validacionidentidad(Integer idvalidacionidentidad) {
        this.idvalidacionidentidad = idvalidacionidentidad;
    }

    public Validacionidentidad(Integer idvalidacionidentidad, Date fechahoracreacion) {
        this.idvalidacionidentidad = idvalidacionidentidad;
        this.fechahoracreacion = fechahoracreacion;
    }

    public Integer getIdvalidacionidentidad() {
        return idvalidacionidentidad;
    }

    public void setIdvalidacionidentidad(Integer idvalidacionidentidad) {
        this.idvalidacionidentidad = idvalidacionidentidad;
    }

    public Date getFechahoracreacion() {
        return fechahoracreacion;
    }

    public void setFechahoracreacion(Date fechahoracreacion) {
        this.fechahoracreacion = fechahoracreacion;
    }

    public Date getFechahoraactualizacion() {
        return fechahoraactualizacion;
    }

    public void setFechahoraactualizacionresultado(Date fechahoraactualizacion) {
        this.fechahoraactualizacion = fechahoraactualizacion;
    }

    public String getCodigoaplicacion() {
        return codigoaplicacion;
    }

    public void setCodigoaplicacion(String codigoaplicacion) {
        this.codigoaplicacion = codigoaplicacion;
    }

    public String getNombreaplicacion() {
        return nombreaplicacion;
    }

    public void setNombreaplicacion(String nombreaplicacion) {
        this.nombreaplicacion = nombreaplicacion;
    }

    public String getMecanismoautenticacion() {
        return mecanismoautenticacion;
    }

    public void setMecanismoautenticacion(String mecanismoautenticacion) {
        this.mecanismoautenticacion = mecanismoautenticacion;
    }

    public String getIdtransaccion() {
        return idtransaccion;
    }

    public void setIdtransaccion(String idtransaccion) {
        this.idtransaccion = idtransaccion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
        hash += (idvalidacionidentidad != null ? idvalidacionidentidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Validacionidentidad)) {
            return false;
        }
        Validacionidentidad other = (Validacionidentidad) object;
        if ((this.idvalidacionidentidad == null && other.idvalidacionidentidad != null) || (this.idvalidacionidentidad != null && !this.idvalidacionidentidad.equals(other.idvalidacionidentidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Validacionidentidad[ idvalidacionidentidad=" + idvalidacionidentidad + " ]";
    }
    
}
