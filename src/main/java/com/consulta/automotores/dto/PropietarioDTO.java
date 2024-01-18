package com.consulta.automotores.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropietarioDTO {

    @JsonProperty("id")
    Integer id;
    String nombre;
    String direccion;
    String identificacion;

}

