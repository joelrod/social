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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "si_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiUsuario.findAll", query = "SELECT s FROM SiUsuario s"),
    @NamedQuery(name = "SiUsuario.findById", query = "SELECT s FROM SiUsuario s WHERE s.id = :id"),
    @NamedQuery(name = "SiUsuario.findByNombre", query = "SELECT s FROM SiUsuario s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "SiUsuario.findByAlias", query = "SELECT s FROM SiUsuario s WHERE s.alias = :alias"),
    @NamedQuery(name = "SiUsuario.findByCorreo", query = "SELECT s FROM SiUsuario s WHERE s.correo = :correo"),
    @NamedQuery(name = "SiUsuario.findByPassword", query = "SELECT s FROM SiUsuario s WHERE s.password = :password"),
    @NamedQuery(name = "SiUsuario.findBySemestre", query = "SELECT s FROM SiUsuario s WHERE s.semestre = :semestre"),
    @NamedQuery(name = "SiUsuario.findByTieneRelacion", query = "SELECT s FROM SiUsuario s WHERE s.tieneRelacion = :tieneRelacion"),
    @NamedQuery(name = "SiUsuario.findByFechaGenero", query = "SELECT s FROM SiUsuario s WHERE s.fechaGenero = :fechaGenero"),
    @NamedQuery(name = "SiUsuario.findByHoraGenero", query = "SELECT s FROM SiUsuario s WHERE s.horaGenero = :horaGenero"),
    @NamedQuery(name = "SiUsuario.findByEliminado", query = "SELECT s FROM SiUsuario s WHERE s.eliminado = :eliminado")})
public class SiUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 254)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "alias")
    private String alias;
    @Size(max = 64)
    @Column(name = "correo")
    private String correo;
    @Size(max = 24)
    @Column(name = "password")
    private String password;
    @Column(name = "semestre")
    private Integer semestre;
    @Column(name = "tiene_relacion")
    private Boolean tieneRelacion;
    @Column(name = "fecha_genero")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "hora_genero")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @OneToMany(mappedBy = "siUsuarioAmigo")
    private List<SoAmigo> soAmigoList;
    @OneToMany(mappedBy = "siUsuario")
    private List<SoAmigo> soAmigoList1;
    @OneToMany(mappedBy = "siUsuario")
    private List<SoCompartir> soCompartirList;
    @OneToMany(mappedBy = "siUsuarioPara")
    private List<SoSolicitudAmistad> soSolicitudAmistadList;
    @OneToMany(mappedBy = "siUsuarioSolicita")
    private List<SoSolicitudAmistad> soSolicitudAmistadList1;
    @OneToMany(mappedBy = "genero")
    private List<SiAdjunto> siAdjuntoList;
    @OneToMany(mappedBy = "siUsuario")
    private List<SoComentario> soComentarioList;
    @OneToMany(mappedBy = "siUsuario")
    private List<SoPost> soPostList;
    @JoinColumn(name = "so_tipo_usuario", referencedColumnName = "id")
    @ManyToOne
    private SoTipoUsuario soTipoUsuario;
    @JoinColumn(name = "so_carrera", referencedColumnName = "id")
    @ManyToOne
    private SoCarrera soCarrera;
    @OneToMany(mappedBy = "siUsuario")
    private List<SoNotificacion> soNotificacionList;
    @OneToMany(mappedBy = "siUsuario")
    private List<SoMeGusta> soMeGustaList;
    @OneToMany(mappedBy = "siUsuario")
    private List<SiMovimiento> siMovimientoList;

    public SiUsuario() {
    }

    public SiUsuario(Integer id) {
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getTieneRelacion() {
        return tieneRelacion;
    }

    public void setTieneRelacion(Boolean tieneRelacion) {
        this.tieneRelacion = tieneRelacion;
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
    public List<SoAmigo> getSoAmigoList() {
        return soAmigoList;
    }

    public void setSoAmigoList(List<SoAmigo> soAmigoList) {
        this.soAmigoList = soAmigoList;
    }

    @XmlTransient
    public List<SoAmigo> getSoAmigoList1() {
        return soAmigoList1;
    }

    public void setSoAmigoList1(List<SoAmigo> soAmigoList1) {
        this.soAmigoList1 = soAmigoList1;
    }

    @XmlTransient
    public List<SoCompartir> getSoCompartirList() {
        return soCompartirList;
    }

    public void setSoCompartirList(List<SoCompartir> soCompartirList) {
        this.soCompartirList = soCompartirList;
    }

    @XmlTransient
    public List<SoSolicitudAmistad> getSoSolicitudAmistadList() {
        return soSolicitudAmistadList;
    }

    public void setSoSolicitudAmistadList(List<SoSolicitudAmistad> soSolicitudAmistadList) {
        this.soSolicitudAmistadList = soSolicitudAmistadList;
    }

    @XmlTransient
    public List<SoSolicitudAmistad> getSoSolicitudAmistadList1() {
        return soSolicitudAmistadList1;
    }

    public void setSoSolicitudAmistadList1(List<SoSolicitudAmistad> soSolicitudAmistadList1) {
        this.soSolicitudAmistadList1 = soSolicitudAmistadList1;
    }

    @XmlTransient
    public List<SiAdjunto> getSiAdjuntoList() {
        return siAdjuntoList;
    }

    public void setSiAdjuntoList(List<SiAdjunto> siAdjuntoList) {
        this.siAdjuntoList = siAdjuntoList;
    }

    @XmlTransient
    public List<SoComentario> getSoComentarioList() {
        return soComentarioList;
    }

    public void setSoComentarioList(List<SoComentario> soComentarioList) {
        this.soComentarioList = soComentarioList;
    }

    @XmlTransient
    public List<SoPost> getSoPostList() {
        return soPostList;
    }

    public void setSoPostList(List<SoPost> soPostList) {
        this.soPostList = soPostList;
    }

    public SoTipoUsuario getSoTipoUsuario() {
        return soTipoUsuario;
    }

    public void setSoTipoUsuario(SoTipoUsuario soTipoUsuario) {
        this.soTipoUsuario = soTipoUsuario;
    }

    public SoCarrera getSoCarrera() {
        return soCarrera;
    }

    public void setSoCarrera(SoCarrera soCarrera) {
        this.soCarrera = soCarrera;
    }

    @XmlTransient
    public List<SoNotificacion> getSoNotificacionList() {
        return soNotificacionList;
    }

    public void setSoNotificacionList(List<SoNotificacion> soNotificacionList) {
        this.soNotificacionList = soNotificacionList;
    }

    @XmlTransient
    public List<SoMeGusta> getSoMeGustaList() {
        return soMeGustaList;
    }

    public void setSoMeGustaList(List<SoMeGusta> soMeGustaList) {
        this.soMeGustaList = soMeGustaList;
    }

    @XmlTransient
    public List<SiMovimiento> getSiMovimientoList() {
        return siMovimientoList;
    }

    public void setSiMovimientoList(List<SiMovimiento> siMovimientoList) {
        this.siMovimientoList = siMovimientoList;
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
        if (!(object instanceof SiUsuario)) {
            return false;
        }
        SiUsuario other = (SiUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.social.social.SiUsuario[ id=" + id + " ]";
    }
    
}
