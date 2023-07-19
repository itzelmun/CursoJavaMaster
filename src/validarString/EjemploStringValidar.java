package validarString;

public class EjemploStringValidar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curso = null; 
		boolean esNulo = curso == null;
		
		System.out.println("esNulo =" + esNulo);
		
		
		if(esNulo) {
		curso = " ";//"programacion JAVA";
			
		}
		boolean esVacio = curso.length() ==0;
		System.out.println("es vacio ="+ esVacio);
		
		//el metodo empty evalua que el largo de un string sea == 0
		boolean esVacio2 = curso.isEmpty();
		System.out.println("es vacio 2 ="+ esVacio2);
		
		
		if(esVacio2) {
		//if(curso.isEmpty() == false) {
			//se convierte a mayusculas
			System.out.println(curso.toUpperCase());
			System.out.println(curso.concat("desde cero!"));
				
			
		}
		
		
		//NullPointerException
	}

}
