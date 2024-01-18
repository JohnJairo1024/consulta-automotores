package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "HistorialPropietario")
@Table(name = "historial_propietario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistorialPropietario {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

}