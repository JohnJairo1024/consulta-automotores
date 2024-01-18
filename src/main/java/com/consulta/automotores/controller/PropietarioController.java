package com.consulta.automotores.controller;

import com.consulta.automotores.dto.PropietarioDTO;
import com.consulta.automotores.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService service;

    @PostMapping
    public PropietarioDTO crear(@RequestBody PropietarioDTO dto) {
        return service.crear(dto);
    }

    @GetMapping
    public List<PropietarioDTO> buscarTodos() {
        return service.buscarTodos();
    }

    // Métodos para leer, actualizar y eliminar

}
