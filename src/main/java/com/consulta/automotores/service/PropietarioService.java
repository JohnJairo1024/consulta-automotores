package com.consulta.automotores.service;

import com.consulta.automotores.dto.PropietarioDTO;
import com.consulta.automotores.entity.Propietario;
import com.consulta.automotores.mapper.PropietarioMapper;
import com.consulta.automotores.repository.PropietarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService {

    private PropietarioRepository repo;
    private PropietarioMapper mapper;

    public PropietarioService(PropietarioRepository repo, PropietarioMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public PropietarioDTO crear(PropietarioDTO dto) {
        Propietario entidad = mapper.toEntity(dto);
        entidad = repo.save(entidad);
        return mapper.toDto(entidad);
    }

    public List<PropietarioDTO> buscarTodos() {
        return repo.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    // Métodos para leer, actualizar y eliminar

}

