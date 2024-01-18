package com.consulta.automotores.service;

import com.consulta.automotores.converter.PropietarioConverter;
import com.consulta.automotores.dto.PropietarioDTO;
import com.consulta.automotores.exception.ErrorCode;
import com.consulta.automotores.exception.NotFoundException;
import com.consulta.automotores.repository.PropietarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class PropietarioService {

    private static final Logger log = Logger.getLogger(PropietarioService.class.getName());

    private final PropietarioRepository repository;
    private final PropietarioConverter productConverter;


    public List<PropietarioDTO> buscarPropietarios() {
        try {
            log.info("Operación de búsqueda de propietarios exitosa.");
            return productConverter.toListDTO(repository.findAll());
        } catch (DataAccessException e) {
            log.severe("Error de acceso a datos al buscar propietarios");
            throw new NotFoundException(ErrorCode.DATA_ACCESS, e);
        } catch (Exception e) {
            log.severe("Error inesperado al buscar propietarios");
            throw new NotFoundException(ErrorCode.NOT_FOUND, e);
        }
    }


}

