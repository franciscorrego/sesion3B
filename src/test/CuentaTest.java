package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	private static Cuenta cta; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cta = new Cuenta(20);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

	}

	@Test
	void testIngreso() {
		cta.ingresar(15);
		assertEquals(cta.getSaldo(), 35);
	}
	
	@Test
	void testRetirar() {
		cta.retirar(10);
		assertEquals(cta.getSaldo(), 10);
	}
}
