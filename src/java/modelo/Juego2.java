/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "juego2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juego2.findAll", query = "SELECT j FROM Juego2 j")
    , @NamedQuery(name = "Juego2.findByIdjuego2", query = "SELECT j FROM Juego2 j WHERE j.idjuego2 = :idjuego2")
    , @NamedQuery(name = "Juego2.findByNombre", query = "SELECT j FROM Juego2 j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Juego2.findByFecha", query = "SELECT j FROM Juego2 j WHERE j.fecha = :fecha")})
public class Juego2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idjuego2")
    private Integer idjuego2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fecha")
    private String fecha;

    public Juego2() {
    }

    public Juego2(Integer idjuego2) {
        this.idjuego2 = idjuego2;
    }

    public Juego2(Integer idjuego2, String nombre, String fecha) {
        this.idjuego2 = idjuego2;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Integer getIdjuego2() {
        return idjuego2;
    }

    public void setIdjuego2(Integer idjuego2) {
        this.idjuego2 = idjuego2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjuego2 != null ? idjuego2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juego2)) {
            return false;
        }
        Juego2 other = (Juego2) object;
        if ((this.idjuego2 == null && other.idjuego2 != null) || (this.idjuego2 != null && !this.idjuego2.equals(other.idjuego2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Juego2[ idjuego2=" + idjuego2 + " ]";
    }
    
}
