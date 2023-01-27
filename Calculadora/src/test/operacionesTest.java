package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class operacionesTest {

	@Test
	void testSumar() {
		Operaciones objetoOperaciones =new Operaciones();
		int numero1 = 3, numero2 =5;
		int resultado = objetoOperaciones.sumar(numero1,numero2);
		assertEquals(8,resultado);
	}

	@Test
	void testRestar() {
		Operaciones objetoOperaciones =new Operaciones();
		int numero1 = 4, numero2 =2;
		int resultado = objetoOperaciones.restar(numero1,numero2);
		assertEquals(2,resultado);
	}

	@Test
	void testMultiplicar() {
		Operaciones objetoOperaciones =new Operaciones();
		int numero1 = 5, numero2 =2;
		int resultado = objetoOperaciones.multiplicar(numero1,numero2);
		assertEquals(10,resultado);
	}

	@Test
	void testDividir() {
		Operaciones objetoOperaciones =new Operaciones();
		int numero1 = 8, numero2 =2;
		int resultado = objetoOperaciones.dividir(numero1,numero2);
		assertEquals(4,resultado);
	}

	@Test
	void testResto() {
		Operaciones objetoOperaciones =new Operaciones();
		int numero1 = 12, numero2 =5;
		int resultado = objetoOperaciones.resto(numero1,numero2);
		assertEquals(2,resultado);
	}

}
