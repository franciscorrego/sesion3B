package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 {

	private static Cuenta cuenta12345;
	private static Cuenta cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345 = new Cuenta(50);
		cuenta67890 = new Cuenta(0);
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
	void test0014() {
		cuenta12345.retirar(200);
		cuenta67890.retirar(350);
		cuenta12345.ingresar(100);
		cuenta67890.retirar(200);
		cuenta67890.retirar(150);
		cuenta12345.retirar(200);
	}

}
