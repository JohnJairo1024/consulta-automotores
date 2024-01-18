package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "motor_transmision")
public class MotorTransmision {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private Vehiculo vehiculo;

    @Column(name = "tipo_motor", length = 100)
    private String tipoMotor;

    @Column(name = "potencia", length = 100)
    private String potencia;

    @Column(name = "torque", length = 100)
    private String torque;

    @Column(name = "traccion", length = 50)
    private String traccion;

    @Column(name = "transmision", length = 100)
    private String transmision;

    @Column(name = "emisiones_co2", length = 20)
    private String emisionesCo2;

    @Column(name = "rendimiento_carretera", length = 20)
    private String rendimientoCarretera;

    @Column(name = "rendimiento_ciudad", length = 20)
    private String rendimientoCiudad;

    @Column(name = "rendimiento_combinado", length = 20)
    private String rendimientoCombinado;

}