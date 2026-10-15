
package org.itsav.domain.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class AlumnosDireccionesId implements Serializable {

    private UUID direccion;
    private UUID alumno;

    public AlumnosDireccionesId() {
    }

    public AlumnosDireccionesId(UUID direccion, UUID alumno) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlumnosDireccionesId)) return false;
        AlumnosDireccionesId that = (AlumnosDireccionesId) o;
        return Objects.equals(direccion, that.direccion)
                && Objects.equals(alumno, that.alumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, alumno);
    }
}

