package calculadora;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



//PRUEBAS PARAMETRIZADAS

@RunWith(value = Parameterized.class) //le digo a junit que corra prueba con un runner particular
public class CalculadoraParametroTest { //Parameterized es el constructor que se hace las pruebas parametrizadas y nececita el metodo siguiente del codigo llamado Iterable

	
	@Parameters
	public static Iterable<Object[]> getData(){
		
		return Arrays.asList(new Object[][] {
			{3, 1, 4}, {2, 3, 5}, {3, 3, 6}
		});
		
			/* ESTE CODIGO ES LO MISMO QUE EL ARRAY LIST DE ARRIBA
			List<Object[]> obj = new ArrayList<>();
			obj.add(new Object[] {3, 1, 4});
			obj.add(new Object[] {2,3,5});
			obj.add(new Object[] {3, 3, 6});
			return obj;
			*/
	}
	
	//constructor para mi prueba
	private int a, b, exp;
	
	
	public CalculadoraParametroTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	
	}
	
	@Test
	public void testAdd() {
	Calculadora calc = new Calculadora();
	int result = calc.add(a, b);
	assertEquals(exp, result);
	}
	
}
