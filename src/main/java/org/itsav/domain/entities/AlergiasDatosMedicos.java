package org.itsav.domain.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "rel_alergias_datos_medicos")
@IdClass(AlergiasDatosMedicosId.class)
public class AlergiasDatosMedicos {

    @Id
    @Column(name = "alergia", nullable = false)
    private Integer alergia;

    @Id
    @Column(name = "dato_medico", nullable = false)
    private UUID datoMedico;

    public AlergiasDatosMedicos() {
    }

    public AlergiasDatosMedicos(Integer alergia, UUID datoMedico) {
        this.alergia = alergia;
        this.datoMedico = datoMedico;
    }

    public Integer getAlergia() {
        return alergia;
    }

    public void setAlergia(Integer alergia) {
        this.alergia = alergia;
    }

    public UUID getDatoMedico() {
        return datoMedico;
    }

    public void setDatoMedico(UUID datoMedico) {
        this.datoMedico = datoMedico;
    }
}
