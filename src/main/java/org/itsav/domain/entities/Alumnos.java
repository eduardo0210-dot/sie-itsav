
package org.itsav.domain.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.time.Period;

@Entity
@Table(name = "tbl_alumnos")
public class Alumnos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_alumno")
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 100)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", length = 100)
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "curp", nullable = false, unique = true, length = 18)
    private String curp;

    @Column(name = "num_telefono_fijo", length = 10)
    private String numTelefonoFijo;

    @Column(name = "num_telefono_movil", nullable = false, length = 10)
    private String numTelefonoMovil;

    @Column(name = "correo_personal", length = 100)
    private String correoPersonal;

    @Column(name = "correo_institucional", length = 100)
    private String correoInstitucional;

    @Column(name = "nombre_tutor", nullable = false, length = 100)
    private String nombreTutor;

    @Column(name = "contacto_tutor", nullable = false, length = 10)
    private String contactoTutor;

    @Column(
            name = "num_control",
            length = 9,
            insertable = false,
            updatable = false
    )
    private String numControl;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    @Column(name = "fecha_creacion", nullable = false)
    private OffsetDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private OffsetDateTime fechaActualizacion;

    public Alumnos() {
    }

    public Alumnos(UUID id, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String curp, String numTelefonoFijo, String numTelefonoMovil, String correoPersonal, String nombreTutor, String correoInstitucional, String contactoTutor, String numControl, Boolean activo, OffsetDateTime fechaCreacion, OffsetDateTime fechaActualizacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.numTelefonoFijo = numTelefonoFijo;
        this.numTelefonoMovil = numTelefonoMovil;
        this.correoPersonal = correoPersonal;
        this.nombreTutor = nombreTutor;
        this.correoInstitucional = correoInstitucional;
        this.contactoTutor = contactoTutor;
        this.numControl = numControl;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNumTelefonoFijo() {
        return numTelefonoFijo;
    }

    public void setNumTelefonoFijo(String numTelefonoFijo) {
        this.numTelefonoFijo = numTelefonoFijo;
    }

    public String getNumTelefonoMovil() {
        return numTelefonoMovil;
    }

    public void setNumTelefonoMovil(String numTelefonoMovil) {
        this.numTelefonoMovil = numTelefonoMovil;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getContactoTutor() {
        return contactoTutor;
    }

    public void setContactoTutor(String contactoTutor) {
        this.contactoTutor = contactoTutor;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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


    @PrePersist
    public void antesDeInsertar() {
        OffsetDateTime ahora = OffsetDateTime.now();

        if (fechaCreacion == null) {
            fechaCreacion = ahora;
        }

        fechaActualizacion = ahora;
    }

    @PreUpdate
    public void antesDeActualizar() {
        fechaActualizacion = OffsetDateTime.now();
    }


    @jakarta.persistence.Transient
    public Integer getEdad() {

        if (fechaNacimiento == null) {
            return null;
        }

        return Period.between(
                fechaNacimiento,
                LocalDate.now()
        ).getYears();
    }


}
