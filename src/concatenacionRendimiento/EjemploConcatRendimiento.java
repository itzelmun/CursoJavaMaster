package concatenacionRendimiento;

public class EjemploConcatRendimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a";
		String b = "b";
		String c = a;
		
		//se crea la clase stringBuilder
		StringBuilder sb = new StringBuilder(a);
		
		//creamos variable para mostrar los milisegundos que se tarda en compilar 
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 500; i++) {
			//se usa el metodo concat
			// c = c.concat(a).concat(b).concat("\n"); //3 mili segundos
			//se usa el metodo +
			// c += a + b + "\n"; 
			//se usa la clase stringBuilder
			sb.append(a); //se demora 0 milisegundos
			sb.append(b);
			sb.append("\n");
			
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - inicio);
		System.out.println("c= "+ c);
		System.out.println("sb ="+ sb.toString());
		
		//con esto se comprueba que con la clase stringbuilder tarda menos en compilar
		}

}
