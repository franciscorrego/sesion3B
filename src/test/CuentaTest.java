package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta cta = new Cuenta(0);
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
		int ingreso = cta.ingreso(25);
		assertEquals(cta.getSaldo(), 25);
	}
	
	@Test
	void testRetirar() {
		int ingreso = cta.retirar(25);
		assertEquals(cta.getSaldo(), 0);
	}
}
