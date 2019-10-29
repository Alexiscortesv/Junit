package calculadora;

public class Calculadora {
	
	
	private int ans;//propiedad que guarda el ultimo resultado
	

	public Calculadora () {
		ans = 0;
		
	}
	
	//nmetodo suma
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	//metodo resta
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	
	public int div (int a, int b){
		
		if (b == 0) {
			throw new ArithmeticException("No puedes dividir por CERO.!!!");
		
	}
	
	
		ans = a / b;
		return ans;
		
	}
	
	//metodo que sume un valor unico a ans
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	//metodo que sume un valor unico a ans
		public int sub(int v) {
			ans -= v;
			return ans;
		}
		
		//metodo simple que nos devuelve ans
		public int ans() {
			return ans;
		}
		
		public void clear() {
			ans = 0;
		}
		
		public void operacionOptima () {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			} 
			
			
		}
}








