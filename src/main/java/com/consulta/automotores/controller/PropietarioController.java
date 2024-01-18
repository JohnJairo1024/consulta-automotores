package com.consulta.automotores.controller;

import com.consulta.automotores.dto.PropietarioDTO;
import com.consulta.automotores.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService service;

    @GetMapping
    public List<PropietarioDTO> buscarTodos() {
        return service.buscarPropietarios();
    }

//    @PostMapping
//    public PropietarioDTO crear(@RequestBody PropietarioDTO dto) {
////        return service.crear(dto);
//    }


    // Métodos para leer, actualizar y eliminar

}
