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
@Table(name = "so_comentario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoComentario.findAll", query = "SELECT s FROM SoComentario s"),
    @NamedQuery(name = "SoComentario.findById", query = "SELECT s FROM SoComentario s WHERE s.id = :id"),
    @NamedQuery(name = "SoComentario.findByMensaje", query = "SELECT s FROM SoComentario s WHERE s.mensaje = :mensaje"),
    @NamedQuery(name = "SoComentario.findByNumeroMeGusta", query = "SELECT s FROM SoComentario s WHERE s.numeroMeGusta = :numeroMeGusta"),
    @NamedQuery(name = "SoComentario.findByFechaGenero", query = "SELECT s FROM SoComentario s WHERE s.fechaGenero = :fechaGenero"),
    @NamedQuery(name = "SoComentario.findByHoraGenero", query = "SELECT s FROM SoComentario s WHERE s.horaGenero = :horaGenero"),
    @NamedQuery(name = "SoComentario.findByEliminado", query = "SELECT s FROM SoComentario s WHERE s.eliminado = :eliminado")})
public class SoComentario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "mensaje")
    private String mensaje;
    @Column(name = "numero_me_gusta")
    private Integer numeroMeGusta;
    @Column(name = "fecha_genero")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "hora_genero")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Column(name = "eliminado")
    private Boolean eliminado;
    @OneToMany(mappedBy = "soComentario")
    private List<SoComentarioMeGusta> soComentarioMeGustaList;
    @JoinColumn(name = "so_post", referencedColumnName = "id")
    @ManyToOne
    private SoPost soPost;
    @JoinColumn(name = "si_usuario", referencedColumnName = "id")
    @ManyToOne
    private SiUsuario siUsuario;

    public SoComentario() {
    }

    public SoComentario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getNumeroMeGusta() {
        return numeroMeGusta;
    }

    public void setNumeroMeGusta(Integer numeroMeGusta) {
        this.numeroMeGusta = numeroMeGusta;
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
    public List<SoComentarioMeGusta> getSoComentarioMeGustaList() {
        return soComentarioMeGustaList;
    }

    public void setSoComentarioMeGustaList(List<SoComentarioMeGusta> soComentarioMeGustaList) {
        this.soComentarioMeGustaList = soComentarioMeGustaList;
    }

    public SoPost getSoPost() {
        return soPost;
    }

    public void setSoPost(SoPost soPost) {
        this.soPost = soPost;
    }

    public SiUsuario getSiUsuario() {
        return siUsuario;
    }

    public void setSiUsuario(SiUsuario siUsuario) {
        this.siUsuario = siUsuario;
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
        if (!(object instanceof SoComentario)) {
            return false;
        }
        SoComentario other = (SoComentario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.social.social.SoComentario[ id=" + id + " ]";
    }
    
}
