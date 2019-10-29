package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	
	static Calculadora calc;
	
	@BeforeClass //sirve para ejecutar código antes de cualquier prueba en una clase.
	public static void beforeClass () {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@Before //se ejecuta despues de todo metodo dentro de la clase 
	public void before() {
	System.out.println("before()");
	calc.clear();
	
	}
	
	@After //se ejecuta antes de todo metodo dentro de la clase
	public void after () {
	System.out.println("after()");
	calc.clear();
	}
	
	
	@AfterClass //sirve para ejecutar código despues de cualquier prueba en una clase.
	public static void afterClass() {
	System.out.println("afterClass()");
	
	}
	
	
	@Test	
	public void testSum() {
	System.out.println("sum()");
	int resul = calc.add(3, 2);
	int esper = 5;
	assertEquals(esper, resul);
	
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("antSum()");
		calc.add(2, 3);
		int resul = calc.ans();
	    int esper = 5; 
		assertEquals(esper, resul);
		
	}
	
	
	
	
	@Test
	public void testDivid() {
		System.out.println("div()");
		calc.div(5, 2);
	}
	
	
	//expected se usa para esperar una determinada exepcion en un metodo, la prueba unitaria falla si no se da la exepcion que se espera
	//arroja error por que si se espera division por cero
	@Test (expected = ArithmeticException.class )
	public void testDivPorCero() {
		System.out.println("div () Exception");
		calc.div(5, 0);
	}
	
	/*
	//timeOut se usa para arrojar error si un metodo se demora mas de lo normal haciendo la prueba
	@Test(timeout = 2000) //este es el parametro esperado, si es menor la prueba falla ya que se espera que el tiempo de respuesta sea este parametro
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
	
	*/
}
