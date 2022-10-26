package com.example.controlarAnchoYLargo.service.impl;

import org.springframework.stereotype.Service;
import com.example.controlarAnchoYLargo.controller.ControlarAnchoyAltoDTO;
import com.example.controlarAnchoYLargo.service.ControlarAnchoyAltoService;

@Service
public class ControlarAnchoyAltoImpl implements ControlarAnchoyAltoService {
    @Override

    public ControlarAnchoyAltoDTO respuesta (int anchoImagen, int altoImagen) {
//public controlAnchoyAltoDTO respuesta (controlAnchoyAltoDTO objeto) {
        Integer anchoHoja = 2480;
        Integer altoHoja = 3508;

        ControlarAnchoyAltoDTO imagenRetorno = new ControlarAnchoyAltoDTO(anchoImagen, altoImagen);
        
        if ((anchoImagen <= anchoHoja ) && ( altoImagen <= altoHoja)){
            //voy a retornar un objeto controlAnchoyAltoDTO
            imagenRetorno.setAncho(anchoImagen);
            imagenRetorno.setAlto(altoImagen);
            return (imagenRetorno);
        }   
        else if ((anchoImagen <= anchoHoja ) && ( altoImagen > altoHoja)){
            if (anchoImagen < anchoHoja){
                imagenRetorno.setAncho(anchoHoja);
            }
            imagenRetorno.setAlto(altoHoja);
            return (imagenRetorno);
        }
        else if ((anchoImagen > anchoHoja ) && ( altoImagen <= altoHoja)){
            imagenRetorno.setAncho(anchoHoja);
            return (imagenRetorno);
        }
        else if ((anchoImagen > anchoHoja ) && ( altoImagen > altoHoja)){
            imagenRetorno.setAlto(altoHoja);
            imagenRetorno.setAncho(anchoHoja);
            return (imagenRetorno);
        }
        return(imagenRetorno);        
    }    
    
}
