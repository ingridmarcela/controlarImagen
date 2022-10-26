package com.example.controlarAnchoYLargo.controller;

import com.example.controlarAnchoYLargo.service.ControlarAnchoyAltoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/ControlImagen" )
public class ControllarAnchoyAltoController {
    private final ControlarAnchoyAltoService imagenConversion;

    public ControllarAnchoyAltoController ( @Autowired ControlarAnchoyAltoService x){

        this.imagenConversion = x;

    }

    @PostMapping
    public ResponseEntity<ControlarAnchoyAltoDTO> solucion(@RequestBody ControlarAnchoyAltoDTO imagenEntrada){
        return ResponseEntity.ok(imagenConversion.respuesta(imagenEntrada. getAncho(), imagenEntrada.getAlto()));

    }
}
