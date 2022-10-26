package com.example.controlarAnchoYLargo.controller;

public class ControlarAnchoyAltoDTO {
    Integer ancho;
    Integer alto;
    //función que me permite a través del objeto ControlarAnchoyAltoDTO conocer el ancho y el alto de la imagen
    public ControlarAnchoyAltoDTO(Integer ancho, Integer alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public Integer getAncho() {
        return ancho;
    }
    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }
    public Integer getAlto() {
        return alto;
    }
    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    
    
}
