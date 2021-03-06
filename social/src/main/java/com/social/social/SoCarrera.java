/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.social.social;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorodriguez
 */
@Entity
@Table(name = "so_carrera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoCarrera.findAll", query = "SELECT s FROM SoCarrera s"),
    @NamedQuery(name = "SoCarrera.findById", query = "SELECT s FROM SoCarrera s WHERE s.id = :id"),
    @NamedQuery(name = "SoCarrera.findByNombre", query = "SELECT s FROM SoCarrera s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "SoCarrera.findByFechaGenero", query = "SELECT s FROM SoCarrera s WHERE s.fechaGenero = :fechaGenero"),
    @NamedQuery(name = "SoCarrera.findByHoraGenero", query = "SELECT s FROM SoCarrera s WHERE s.horaGenero = :horaGenero"),
    @NamedQuery(name = "SoCarrera.findByEliminado", query = "SELECT s FROM SoCarrera s WHERE s.eliminado = :eliminado")})
public class SoCarrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_genero")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "hora_genero")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @OneToMany(mappedBy = "soCarrera")
    private List<SoPost> soPostList;
    @OneToMany(mappedBy = "soCarrera")
    private List<SiUsuario> siUsuarioList;

    public SoCarrera() {
    }

    public SoCarrera(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaGenero() {
        return fechaGenero;
    }

    public void setFechaGenero(Date fechaGenero) {
        this.fechaGenero = fechaGenero;
    }

    public Date getHoraGenero() {
        return horaGenero;
    }

    public void setHoraGenero(Date horaGenero) {
        this.horaGenero = horaGenero;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @XmlTransient
    public List<SoPost> getSoPostList() {
        return soPostList;
    }

    public void setSoPostList(List<SoPost> soPostList) {
        this.soPostList = soPostList;
    }

    @XmlTransient
    public List<SiUsuario> getSiUsuarioList() {
        return siUsuarioList;
    }

    public void setSiUsuarioList(List<SiUsuario> siUsuarioList) {
        this.siUsuarioList = siUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoCarrera)) {
            return false;
        }
        SoCarrera other = (SoCarrera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.social.social.SoCarrera[ id=" + id + " ]";
    }
    
}
