package org.itsav.domain.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Discapacidad_Dato_MedicoId implements  Serializable{
    private Integer discapacidad;
    private UUID dato_medico;

    public Discapacidad_Dato_MedicoId(){

    }

    public Discapacidad_Dato_MedicoId(Integer discapacidad, UUID dato_medico) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discapacidad_Dato_MedicoId)) return false;
        Discapacidad_Dato_MedicoId that = (Discapacidad_Dato_MedicoId) o;
        return Objects.equals(discapacidad, that.discapacidad)
                && Objects.equals(dato_medico, that.dato_medico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discapacidad, dato_medico);
    }

}
