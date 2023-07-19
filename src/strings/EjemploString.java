package strings;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//una forma de definir un string de forma directa para automatizar
		String curso = "Programacion java";
		
		//otra forma es, crea una instancia
		String curso2 = new String("programacion java");
		
		//ambos contienen lo mismo pero son objetos distintos
		
		boolean esIgual = curso == curso2;
		System.out.println("es igual =" + esIgual);
		
		esIgual = curso.equals(curso2);
		System.out.println("Es igual=" + esIgual);
		
		String curso3 = "Programacion Java";
		esIgual = curso == curso3;
		System.out.println("esIgual ="+ esIgual);
		
		
		
	}

}
