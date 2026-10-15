
package org.itsav.domain.entities;

import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbl_datos_medicos")
public class DatosMedicos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_dato_medico")
    private UUID id;

    @Column(name = "tipo_sangre", length = 3)
    private String tipoSangre;

    @Column(name = "alumno", nullable = false, unique = true)
    private UUID alumno;

    @Column(name = "fecha_creacion", nullable = false)
    private OffsetDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private OffsetDateTime fechaActualizacion;

    public DatosMedicos() {
    }

    public DatosMedicos(UUID id, String tipoSangre, UUID alumno, OffsetDateTime fechaCreacion, OffsetDateTime fechaActualizacion) {
        this.id = id;
        this.tipoSangre = tipoSangre;
        this.alumno = alumno;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAlumno() {
        return alumno;
    }

    public void setAlumno(UUID alumno) {
        this.alumno = alumno;
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
