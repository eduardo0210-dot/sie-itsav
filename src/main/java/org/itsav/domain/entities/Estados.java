package org.itsav.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ctl_estados")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Estados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pais")
    private Long pais;

    public Estados(Long id, String nombre, Long pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Estados() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPais() {
        return pais;
    }

    public void setPais(Long pais) {
        this.pais = pais;
    }
}
