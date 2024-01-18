package com.consulta.automotores.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity(name = "Propietario")
@Table(name = "propietario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Propietario {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "direccion", length = Integer.MAX_VALUE)
    private String direccion;

    @Column(name = "identificacion", length = 20)
    private String identificacion;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "profesion", length = 50)
    private String profesion;

    @Column(name = "estado_civil", length = 15)
    private String estadoCivil;

    @OneToMany(mappedBy = "propietario")
    private Set<HistorialPropietario> historialPropietarios;

    @OneToMany(mappedBy = "propietario")
    private Set<Vehiculo> vehiculos;

}