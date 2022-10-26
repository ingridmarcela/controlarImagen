package com.example.controlarAnchoYLargo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.controlarAnchoYLargo.controller.ControlarAnchoyAltoDTO;
import com.example.controlarAnchoYLargo.service.ControlarAnchoyAltoService;

@SpringBootTest
class ControlarAnchoYLargoApplicationTests {

	@Autowired
	private ControlarAnchoyAltoService controlarAnchoYLargoService;

	@Test
	void contextLoads() {
	}

	@Test
	void testImagencabe(){
		ControlarAnchoyAltoDTO test = new ControlarAnchoyAltoDTO(1, 1); //inicializo el objeto
		test = controlarAnchoYLargoService.respuesta(2480, 3508);
		assertEquals(2480, test.getAncho());
		assertEquals(3508, test.getAlto()); //la expectativa
	}

	@Test
	void testImagenReduceAncho(){
		ControlarAnchoyAltoDTO test = new ControlarAnchoyAltoDTO(1, 1); //inicializo el objeto
		test = controlarAnchoYLargoService.respuesta(2600, 3508);
		assertEquals(2480, test.getAncho());
		assertEquals(3508, test.getAlto()); //la expectativa
	}

	@Test
	void testImagenReduceAlto(){
		ControlarAnchoyAltoDTO test = new ControlarAnchoyAltoDTO(1, 1); //inicializo el objeto
		test = controlarAnchoYLargoService.respuesta(2480, 3800);
		assertEquals(2480, test.getAncho());
		assertEquals(3508, test.getAlto()); //la expectativa

	}
	    
	@Test
	void testImagenReduceAnchoYAlto(){
		ControlarAnchoyAltoDTO test = new ControlarAnchoyAltoDTO(1, 1); //inicializo el objeto
		test = controlarAnchoYLargoService.respuesta(2300, 3800);
		assertEquals(2480, test.getAncho());
		assertEquals(3508, test.getAlto()); //la expectativa
	}

  
}
