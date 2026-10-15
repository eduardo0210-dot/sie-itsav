
package org.itsav.domain.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "rel_alumnos_direcciones")
@IdClass(AlumnosDireccionesId.class)
public class AlumnosDirecciones {

    @Id
    @Column(name = "direccion", nullable = false)
    private UUID direccion;

    @Id
    @Column(name = "alumno", nullable = false)
    private UUID alumno;

    public AlumnosDirecciones() {
    }

    public AlumnosDirecciones(UUID direccion, UUID alumno) {
        this.direccion = direccion;
        this.alumno = alumno;
    }

    public UUID getDireccion() {
        return direccion;
    }

    public void setDireccion(UUID direccion) {
        this.direccion = direccion;
    }

    public UUID getAlumno() {
        return alumno;
    }

    public void setAlumno(UUID alumno) {
        this.alumno = alumno;
    }
}

