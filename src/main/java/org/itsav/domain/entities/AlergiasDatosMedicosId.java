package org.itsav.domain.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class AlergiasDatosMedicosId implements Serializable
{
    private Integer alergia;
    private UUID datoMedico;

    public AlergiasDatosMedicosId() {
    }

    public AlergiasDatosMedicosId(Integer alergia, UUID datoMedico) {
        this.alergia = alergia;
        this.datoMedico = datoMedico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlergiasDatosMedicosId)) return false;
        AlergiasDatosMedicosId that = (AlergiasDatosMedicosId) o;
        return Objects.equals(alergia, that.alergia)
                && Objects.equals(datoMedico, that.datoMedico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alergia, datoMedico);
    }

}
