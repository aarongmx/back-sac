package Backend.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "expedientes")
@NamedQuery(name = "Expediente.findStudent", query = "SELECT e FROM Expediente e WHERE e.noCtl = ?1")
public class Expediente implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "no_oficio")
    private String noOficio;

    @Column(name = "fecha_expedicion")
    private Timestamp fechaExpedicion;

    @Column(name = "periodo")
    private char periodo;

    @Column(name = "calificacion")
    private Integer calificacion;


    @Column(name = "no_ctl")
    private Integer noCtl;

    @Column(name = "finalizada")
    private Boolean finalizada;

    @Column(name = "id_actividad")
    private Integer idActividad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoOficio() {
        return noOficio;
    }

    public void setNoOficio(String noOficio) {
        this.noOficio = noOficio;
    }

    public Timestamp getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Timestamp fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public char getPeriodo() {
        return periodo;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }

    public Integer getNoCtl() {
        return noCtl;
    }

    public void setNoCtl(Integer noCtl) {
        this.noCtl = noCtl;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }
}
