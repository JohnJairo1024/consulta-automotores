package com.consulta.automotores.config;

import com.consulta.automotores.mapper.PropietarioMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public PropietarioMapper propietarioMapper() {
        return Mappers.getMapper(PropietarioMapper.class);
    }
}
