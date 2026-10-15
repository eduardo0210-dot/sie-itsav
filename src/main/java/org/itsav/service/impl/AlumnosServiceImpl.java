
package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.NotFoundException;

import org.itsav.domain.entities.Alumnos;
import org.itsav.repositories.Alumnosrepository;
import org.itsav.service.AlumnosService;

import java.util.Optional;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class AlumnosServiceImpl implements AlumnosService {

    @Inject
    Alumnosrepository repository;

    // Obtener todos los alumnos
    @Override
    public List<Alumnos> findAll() {
        return repository.listAll();
    }

    // Buscar alumno por UUID
    @Override
    public Alumnos findById(UUID id) {
        return repository.findById(id);
    }

    // Buscar alumno por numero de control
    @Override
    public Optional<Alumnos> buscarPorNumeroControl(
            String numControl) {

        return repository.buscarPorNumeroControl(numControl);
    }

    // Registrar un nuevo alumno
    @Override
    @Transactional
    public Alumnos registrarAlumno(Alumnos alumno) {

        if (alumno == null) {
            throw new BadRequestException(
                    "Debes proporcionar los datos del alumno"
            );
        }

        // PostgreSQL genera el numero de control
        alumno.setNumControl(null);

        // Guardar el alumno
        repository.persistAndFlush(alumno);

        // Recuperar los valores generados
        repository.getEntityManager().refresh(alumno);

        return alumno;
    }

    // Actualizar datos de un alumno
    @Override
    @Transactional
    public Alumnos actualizarAlumno(
            String numControl,
            Alumnos datosActualizados) {

        // Validar los datos recibidos
        if (datosActualizados == null) {
            throw new BadRequestException(
                    "Debes proporcionar los datos del alumno"
            );
        }

        // Buscar alumno por numero de control
        Alumnos alumno = repository
                .buscarPorNumeroControl(numControl)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Alumno no encontrado"
                        )
                );

        // Actualizar nombre
        if (datosActualizados.getNombre() != null) {
            alumno.setNombre(
                    datosActualizados.getNombre()
            );
        }

        // Actualizar apellido paterno
        if (datosActualizados.getApellidoPaterno() != null) {
            alumno.setApellidoPaterno(
                    datosActualizados.getApellidoPaterno()
            );
        }

        // Actualizar apellido materno
        if (datosActualizados.getApellidoMaterno() != null) {
            alumno.setApellidoMaterno(
                    datosActualizados.getApellidoMaterno()
            );
        }

        // Actualizar telefono fijo
        if (datosActualizados.getNumTelefonoFijo() != null) {
            alumno.setNumTelefonoFijo(
                    datosActualizados.getNumTelefonoFijo()
            );
        }

        // Actualizar telefono movil
        if (datosActualizados.getNumTelefonoMovil() != null) {
            alumno.setNumTelefonoMovil(
                    datosActualizados.getNumTelefonoMovil()
            );
        }

        // Actualizar correo personal
        if (datosActualizados.getCorreoPersonal() != null) {
            alumno.setCorreoPersonal(
                    datosActualizados.getCorreoPersonal()
            );
        }

        // Actualizar correo institucional
        if (datosActualizados.getCorreoInstitucional() != null) {
            alumno.setCorreoInstitucional(
                    datosActualizados.getCorreoInstitucional()
            );
        }

        // Actualizar nombre del tutor
        if (datosActualizados.getNombreTutor() != null) {
            alumno.setNombreTutor(
                    datosActualizados.getNombreTutor()
            );
        }

        // Actualizar contacto del tutor
        if (datosActualizados.getContactoTutor() != null) {
            alumno.setContactoTutor(
                    datosActualizados.getContactoTutor()
            );
        }

        // Guardar los cambios en PostgreSQL
        repository.flush();

        // Devolver el alumno actualizado
        return alumno;
    }


    @Override
    @Transactional
    public Alumnos darDeBajaAlumno(String numControl) {

        Alumnos alumno = repository
                .buscarPorNumeroControl(numControl)
                .orElseThrow(() ->
                        new jakarta.ws.rs.NotFoundException(
                                "Alumno no encontrado"
                        )
                );

        // Cambiar el estado del alumno a inactivo
        alumno.setActivo(false);

        // Guardar el cambio en PostgreSQL
        repository.flush();

        return alumno;
    }


    @Override
    @Transactional
    public Alumnos reactivarAlumno(String numControl) {

        Alumnos alumno = repository
                .buscarPorNumeroControl(numControl)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Alumno no encontrado"
                        )
                );

        // Reactivar al alumno
        alumno.setActivo(true);

        // Guardar el cambio
        repository.flush();

        return alumno;
    }

    // Consultar alumnos activos
    @Override
    public List<Alumnos> buscarAlumnosActivos() {
        return repository.buscarAlumnosActivos();
    }

    // Consultar alumnos inactivos
    @Override
    public List<Alumnos> buscarAlumnosInactivos() {
        return repository.buscarAlumnosInactivos();
    }



}
