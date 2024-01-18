package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "mantenimiento")
public class Mantenimiento {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "km")
    private Integer km;

    @Column(name = "tipo", length = 100)
    private String tipo;

}