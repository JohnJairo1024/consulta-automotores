package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "capacidades")
public class Capacidade {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private Vehiculo vehiculo;

    @Column(name = "caracteristica", nullable = false, length = 50)
    private String caracteristica;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

}