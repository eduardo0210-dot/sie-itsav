package org.itsav.domain.entities;

import io.quarkus.security.IdentityAttribute;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ctl_alergias")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Alergia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alergia")
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    public Alergia(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
