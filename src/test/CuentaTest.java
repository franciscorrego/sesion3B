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
		cta = new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

	}

	@Test
	void testIngreso() {
		cta.ingresar(25);
		assertEquals(cta.getSaldo(), 25);
	}
	
	@Test
	void testRetirar() {
		cta.retirar(25);
		assertEquals(cta.getSaldo(), 0);
	}
}
