
package co.com.asulado.motorreglaslog.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "datosparticipante")
@NamedQueries({
    @NamedQuery(name = "Datosparticipante.findAll", query = "SELECT d FROM Datosparticipante d"),
    @NamedQuery(name = "Datosparticipante.findByIddatosparticipante", query = "SELECT d FROM Datosparticipante d WHERE d.iddatosparticipante = :iddatosparticipante"),
    @NamedQuery(name = "Datosparticipante.findByNombrecompleto", query = "SELECT d FROM Datosparticipante d WHERE d.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Datosparticipante.findByNumerodocumentoidentidad", query = "SELECT d FROM Datosparticipante d WHERE d.numerodocumentoidentidad = :numerodocumentoidentidad"),
    @NamedQuery(name = "Datosparticipante.findByTipodocumentoidentidad", query = "SELECT d FROM Datosparticipante d WHERE d.tipodocumentoidentidad = :tipodocumentoidentidad"),
    @NamedQuery(name = "Datosparticipante.findByTipoparticipante", query = "SELECT d FROM Datosparticipante d WHERE d.tipoparticipante = :tipoparticipante")})
public class Datosparticipante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddatosparticipante",nullable = false)
    private Integer iddatosparticipante;
    @Column(name = "nombrecompleto",nullable = true, length = 100)
    private String nombrecompleto;
    @Column(name = "numerodocumentoidentidad",nullable = true, length = 100)
    private String numerodocumentoidentidad;
    @Column(name = "tipodocumentoidentidad",nullable = true, length = 100)
    private String tipodocumentoidentidad;
    @Column(name = "tipoparticipante",nullable = true, length = 100)
    private String tipoparticipante;

    public Datosparticipante() {
    }

    public Datosparticipante(Integer iddatosparticipante) {
        this.iddatosparticipante = iddatosparticipante;
    }

    public Integer getIddatosparticipante() {
        return iddatosparticipante;
    }

    public void setIddatosparticipante(Integer iddatosparticipante) {
        this.iddatosparticipante = iddatosparticipante;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getNumerodocumentoidentidad() {
        return numerodocumentoidentidad;
    }

    public void setNumerodocumentoidentidad(String numerodocumentoidentidad) {
        this.numerodocumentoidentidad = numerodocumentoidentidad;
    }

    public String getTipodocumentoidentidad() {
        return tipodocumentoidentidad;
    }

    public void setTipodocumentoidentidad(String tipodocumentoidentidad) {
        this.tipodocumentoidentidad = tipodocumentoidentidad;
    }

    public String getTipoparticipante() {
        return tipoparticipante;
    }

    public void setTipoparticipante(String tipoparticipante) {
        this.tipoparticipante = tipoparticipante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddatosparticipante != null ? iddatosparticipante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datosparticipante)) {
            return false;
        }
        Datosparticipante other = (Datosparticipante) object;
        if ((this.iddatosparticipante == null && other.iddatosparticipante != null) || (this.iddatosparticipante != null && !this.iddatosparticipante.equals(other.iddatosparticipante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Datosparticipante[ iddatosparticipante=" + iddatosparticipante + " ]";
    }
    
}
