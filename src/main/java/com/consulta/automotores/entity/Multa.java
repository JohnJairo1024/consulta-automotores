package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "multas")
public class Multa {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "tipo", length = 100)
    private String tipo;

    @Column(name = "monto")
    private Double monto;

}