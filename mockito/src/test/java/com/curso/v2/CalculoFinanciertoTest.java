package com.curso.v2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CalculoFinanciertoTest {
	
	@Mock
	CalculoFinancieroCloud cfc;
	
	CalculoFinanciero calc;
	
	@BeforeEach
	public void setUp() {
		cfc = mock(CalculoFinancieroCloud.class);
		calc = new CalculoFinanciero(cfc);
	}
	
    @Test
    void testCalculoFinancieroBasico() {
    	when(cfc.calculoExterno(1000000L,10,5.0f,(byte)4))
    	        .thenReturn(954453.58);
		
        double resultado = calc.calcula(1000000L, 10, 5.0f, (byte) 4);
        
        assertEquals(954453.58, resultado, 0.01, "El cálculo financiero básico no coincide con el valor esperado");
        
        //Verificamos que se llamó al mock con los argumentos correctos
        verify(cfc).calculoExterno(1000000L, 10, 5.0f, (byte) 4);
    }

}
