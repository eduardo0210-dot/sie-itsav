package org.itsav.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ctl_paises")
public class Paises {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "prefijo", nullable = false, length = 5)
    private String prefijo;

    public Paises(){

    }

    public Paises(Long id, String nombre, String prefijo) {
        this.id = id;
        this.nombre = nombre;
        this.prefijo = prefijo;
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

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
}
