package org.itsav.domain.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "rel_discapacidades_datos_medicos")
@IdClass(Discapacidad_Dato_MedicoId.class)
public class Discapacidades_Datos_Medicos {

    @Id
    @Column(name = "discapacidad", nullable = false)
    private Integer discapacidad;

    @Id
    @Column(name = "dato_medico", nullable = false)
    private UUID dato_medico;

    public Discapacidades_Datos_Medicos() {
    }

    public Discapacidades_Datos_Medicos(Integer discapacidad, UUID dato_medico) {
        this.discapacidad = discapacidad;
        this.dato_medico = dato_medico;
    }

    public Integer getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Integer discapacidad) {
        this.discapacidad = discapacidad;
    }

    public UUID getDato_medico() {
        return dato_medico;
    }

    public void setDato_medico(UUID dato_medico) {
        this.dato_medico = dato_medico;
    }

}
