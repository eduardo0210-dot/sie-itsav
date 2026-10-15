package org.itsav.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ctl_ciudades")

public class Ciudades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private Long estado;

    public Ciudades(){

    }

    public Ciudades(Long id, String nombre, Long estado){
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
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

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }
}
