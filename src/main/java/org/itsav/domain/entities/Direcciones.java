
package org.itsav.domain.entities;

import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbl_direcciones")
public class Direcciones {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_direccion")
    private UUID id;

    @Column(name = "calle", nullable = false, length = 50)
    private String calle;

    @Column(name = "numero_ext", nullable = false, length = 10)
    private String numeroExt;

    @Column(name = "numero_int", length = 10)
    private String numeroInt;

    @Column(name = "colonia", nullable = false, length = 50)
    private String colonia;

    @Column(name = "cp", nullable = false, length = 5)
    private String cp;

    @Column(name = "ciudad", nullable = false)
    private Long ciudad;

    @Column(name = "fecha_creacion", nullable = false)
    private OffsetDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private OffsetDateTime fechaActualizacion;

    public Direcciones() {
    }

    public Direcciones(UUID id, String calle, String numeroExt, String numeroInt, String colonia, String cp, OffsetDateTime fechaCreacion, Long ciudad, OffsetDateTime fechaActualizacion) {
        this.id = id;
        this.calle = calle;
        this.numeroExt = numeroExt;
        this.numeroInt = numeroInt;
        this.colonia = colonia;
        this.cp = cp;
        this.fechaCreacion = fechaCreacion;
        this.ciudad = ciudad;
        this.fechaActualizacion = fechaActualizacion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExt() {
        return numeroExt;
    }

    public void setNumeroExt(String numeroExt) {
        this.numeroExt = numeroExt;
    }

    public String getNumeroInt() {
        return numeroInt;
    }

    public void setNumeroInt(String numeroInt) {
        this.numeroInt = numeroInt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Long getCiudad() {
        return ciudad;
    }

    public void setCiudad(Long ciudad) {
        this.ciudad = ciudad;
    }

    public OffsetDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(OffsetDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public OffsetDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(OffsetDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}

