package com.consulta.automotores.mapper;

import com.consulta.automotores.dto.PropietarioDTO;
import com.consulta.automotores.entity.Propietario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropietarioMapper {

    PropietarioDTO toDto(Propietario propietario);

    Propietario toEntity(PropietarioDTO dto);
}
