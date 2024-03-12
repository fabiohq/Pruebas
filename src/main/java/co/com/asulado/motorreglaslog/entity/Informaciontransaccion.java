package co.com.asulado.motorreglaslog.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "informaciontransaccion")
@NamedQueries({
    @NamedQuery(name = "Informaciontransaccion.findAll", query = "SELECT i FROM Informaciontransaccion i"),
    @NamedQuery(name = "Informaciontransaccion.findByIdinformaciontransaccion", query = "SELECT i FROM Informaciontransaccion i WHERE i.idinformaciontransaccion = :idinformaciontransaccion"),
    @NamedQuery(name = "Informaciontransaccion.findByCanal", query = "SELECT i FROM Informaciontransaccion i WHERE i.canal = :canal"),
    @NamedQuery(name = "Informaciontransaccion.findByCodigoaplicacionorigen", query = "SELECT i FROM Informaciontransaccion i WHERE i.codigoaplicacionorigen = :codigoaplicacionorigen"),
    @NamedQuery(name = "Informaciontransaccion.findByCodigociudad", query = "SELECT i FROM Informaciontransaccion i WHERE i.codigociudad = :codigociudad"),
    @NamedQuery(name = "Informaciontransaccion.findByCodigodepartamento", query = "SELECT i FROM Informaciontransaccion i WHERE i.codigodepartamento = :codigodepartamento"),
    @NamedQuery(name = "Informaciontransaccion.findByCodigodetalletransaccion", query = "SELECT i FROM Informaciontransaccion i WHERE i.codigodetalletransaccion = :codigodetalletransaccion"),
    @NamedQuery(name = "Informaciontransaccion.findByCodigopais", query = "SELECT i FROM Informaciontransaccion i WHERE i.codigopais = :codigopais"),
    @NamedQuery(name = "Informaciontransaccion.findByDetalletransaccion", query = "SELECT i FROM Informaciontransaccion i WHERE i.detalletransaccion = :detalletransaccion"),
    @NamedQuery(name = "Informaciontransaccion.findByDireccion", query = "SELECT i FROM Informaciontransaccion i WHERE i.direccion = :direccion"),
    @NamedQuery(name = "Informaciontransaccion.findByIp", query = "SELECT i FROM Informaciontransaccion i WHERE i.ip = :ip"),
    @NamedQuery(name = "Informaciontransaccion.findByNombreaplicacionorigen", query = "SELECT i FROM Informaciontransaccion i WHERE i.nombreaplicacionorigen = :nombreaplicacionorigen"),
    @NamedQuery(name = "Informaciontransaccion.findByNombreciudad", query = "SELECT i FROM Informaciontransaccion i WHERE i.nombreciudad = :nombreciudad"),
    @NamedQuery(name = "Informaciontransaccion.findByNombredepartamento", query = "SELECT i FROM Informaciontransaccion i WHERE i.nombredepartamento = :nombredepartamento"),
    @NamedQuery(name = "Informaciontransaccion.findByNombrepais", query = "SELECT i FROM Informaciontransaccion i WHERE i.nombrepais = :nombrepais"),
    @NamedQuery(name = "Informaciontransaccion.findByTelefono", query = "SELECT i FROM Informaciontransaccion i WHERE i.telefono = :telefono"),
    @NamedQuery(name = "Informaciontransaccion.findByUbicaciongeoreferenciacion", query = "SELECT i FROM Informaciontransaccion i WHERE i.ubicaciongeoreferenciacion = :ubicaciongeoreferenciacion"),
    @NamedQuery(name = "Informaciontransaccion.findByUsuarioasesor", query = "SELECT i FROM Informaciontransaccion i WHERE i.usuarioasesor = :usuarioasesor")})
public class Informaciontransaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinformaciontransaccion")
    private Integer idinformaciontransaccion;
    
    @Basic(optional = false)
    @Column(name = "fechahora")
    @Temporal(TemporalType.DATE)
    private Date fechahora;
    
    @Basic(optional = false)
    @Column(name = "canal")
    private String canal;
    @Basic(optional = false)
    @Column(name = "codigoaplicacionorigen")
    private String codigoaplicacionorigen;
    @Column(name = "codigociudad")
    private String codigociudad;
    @Column(name = "codigodepartamento")
    private String codigodepartamento;
    @Basic(optional = false)
    @Column(name = "codigodetalletransaccion")
    private String codigodetalletransaccion;
    @Column(name = "codigopais")
    private String codigopais;
    @Column(name = "detalletransaccion")
    private String detalletransaccion;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "nombreaplicacionorigen")
    private String nombreaplicacionorigen;
    @Column(name = "nombreciudad")
    private String nombreciudad;
    @Column(name = "nombredepartamento")
    private String nombredepartamento;
    @Column(name = "nombrepais")
    private String nombrepais;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "ubicaciongeoreferenciacion")
    private String ubicaciongeoreferenciacion;
    @Column(name = "usuarioasesor")
    private String usuarioasesor;
    @OneToMany(mappedBy = "idinformaciontransaccion")
    private Collection<Detallevalidacion> detallevalidacionCollection;

    public Informaciontransaccion() {
    }

    public Informaciontransaccion(Integer idinformaciontransaccion) {
        this.idinformaciontransaccion = idinformaciontransaccion;
    }

    public Informaciontransaccion(Integer idinformaciontransaccion, String canal, String codigoaplicacionorigen, String codigodetalletransaccion, String nombreaplicacionorigen) {
        this.idinformaciontransaccion = idinformaciontransaccion;
        this.canal = canal;
        this.codigoaplicacionorigen = codigoaplicacionorigen;
        this.codigodetalletransaccion = codigodetalletransaccion;
        this.nombreaplicacionorigen = nombreaplicacionorigen;
    }

    public Integer getIdinformaciontransaccion() {
        return idinformaciontransaccion;
    }

    public void setIdinformaciontransaccion(Integer idinformaciontransaccion) {
        this.idinformaciontransaccion = idinformaciontransaccion;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahoracreacion(Date fechahora) {
        this.fechahora = fechahora;
    }
    
    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getCodigoaplicacionorigen() {
        return codigoaplicacionorigen;
    }

    public void setCodigoaplicacionorigen(String codigoaplicacionorigen) {
        this.codigoaplicacionorigen = codigoaplicacionorigen;
    }

    public String getCodigociudad() {
        return codigociudad;
    }

    public void setCodigociudad(String codigociudad) {
        this.codigociudad = codigociudad;
    }

    public String getCodigodepartamento() {
        return codigodepartamento;
    }

    public void setCodigodepartamento(String codigodepartamento) {
        this.codigodepartamento = codigodepartamento;
    }

    public String getCodigodetalletransaccion() {
        return codigodetalletransaccion;
    }

    public void setCodigodetalletransaccion(String codigodetalletransaccion) {
        this.codigodetalletransaccion = codigodetalletransaccion;
    }

    public String getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(String codigopais) {
        this.codigopais = codigopais;
    }

    public String getDetalletransaccion() {
        return detalletransaccion;
    }

    public void setDetalletransaccion(String detalletransaccion) {
        this.detalletransaccion = detalletransaccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombreaplicacionorigen() {
        return nombreaplicacionorigen;
    }

    public void setNombreaplicacionorigen(String nombreaplicacionorigen) {
        this.nombreaplicacionorigen = nombreaplicacionorigen;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicaciongeoreferenciacion() {
        return ubicaciongeoreferenciacion;
    }

    public void setUbicaciongeoreferenciacion(String ubicaciongeoreferenciacion) {
        this.ubicaciongeoreferenciacion = ubicaciongeoreferenciacion;
    }

    public String getUsuarioasesor() {
        return usuarioasesor;
    }

    public void setUsuarioasesor(String usuarioasesor) {
        this.usuarioasesor = usuarioasesor;
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
        hash += (idinformaciontransaccion != null ? idinformaciontransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informaciontransaccion)) {
            return false;
        }
        Informaciontransaccion other = (Informaciontransaccion) object;
        if ((this.idinformaciontransaccion == null && other.idinformaciontransaccion != null) || (this.idinformaciontransaccion != null && !this.idinformaciontransaccion.equals(other.idinformaciontransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Informaciontransaccion[ idinformaciontransaccion=" + idinformaciontransaccion + " ]";
    }
    
}
