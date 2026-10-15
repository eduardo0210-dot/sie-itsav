
package org.itsav.service;

import org.itsav.domain.entities.Alumnos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlumnosService {

    // Obtener todos los alumnos
    List<Alumnos> findAll();

    // Buscar alumno por UUID
    Alumnos findById(UUID id);

    // Buscar alumno por numero de control
    Optional<Alumnos> buscarPorNumeroControl(
            String numControl
    );

    // Registrar un nuevo alumno
    Alumnos registrarAlumno(Alumnos alumno);

    // Actualizar informacion de un alumno
    Alumnos actualizarAlumno(
            String numControl,
            Alumnos datosActualizados
    );

    // Dar de baja sin eliminar de PostgreSQL
    Alumnos darDeBajaAlumno(String numControl);

    // Reactivar un alumno dado de baja
    Alumnos reactivarAlumno(String numControl);

    // Consultar alumnos activos
    List<Alumnos> buscarAlumnosActivos();

    // Consultar alumnos inactivos
    List<Alumnos> buscarAlumnosInactivos();

}
