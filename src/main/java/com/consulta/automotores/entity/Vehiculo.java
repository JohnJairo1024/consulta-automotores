package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linea_id")
    private Linea linea;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "modelo", length = 50)
    private String modelo;

    @Column(name = "numero_serie", length = 50)
    private String numeroSerie;

    @Column(name = "numero_motor", length = 50)
    private String numeroMotor;

    @Column(name = "numero_chasis", length = 50)
    private String numeroChasis;

    @Column(name = "numero_vin", length = 50)
    private String numeroVin;

    @Column(name = "cilindraje")
    private Integer cilindraje;

    @Column(name = "tipo_carroceria", length = 50)
    private String tipoCarroceria;

    @Column(name = "capacidad_carga")
    private Integer capacidadCarga;

    @Column(name = "peso_bruto", length = 10)
    private String pesoBruto;

    @Column(name = "capacidad_pasajeros")
    private Integer capacidadPasajeros;

    @Column(name = "capacidad_sentados")
    private Integer capacidadSentados;

    @Column(name = "numero_ejes")
    private Integer numeroEjes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "combustible_id")
    private Combustible combustible;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

}