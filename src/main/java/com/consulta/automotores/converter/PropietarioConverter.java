package com.consulta.automotores.converter;


import com.consulta.automotores.dto.PropietarioDTO;
import com.consulta.automotores.entity.Propietario;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PropietarioConverter {


    public Propietario toEntity(PropietarioDTO dto) {
        return Propietario.builder()
                .id(dto.getId())
                .nombre(dto.getNombre())
                .direccion(dto.getDireccion())
                .identificacion(dto.getIdentificacion())
                .build();
    }

    public PropietarioDTO toDTO(Propietario entity) {
        return PropietarioDTO.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .direccion(entity.getDireccion())
                .identificacion(entity.getIdentificacion())
                .build();

    }

    public List<PropietarioDTO> toListDTO(List<Propietario> entityList) {
        return entityList.stream().map(this::toDTO).toList();
    }

}
