package EjemploStringMetodosArreglos;

public class EjemploStringMetodoArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String trabalenguas = "trabalenguas";
		//toCharArray convierte trabalenguas en un arreglo de tipo char
		System.out.println("trabalenguas = " + trabalenguas.toCharArray());
		
		char[] arreglo = trabalenguas.toCharArray();
		int largo = arreglo.length;
		System.out.println("largo = " + largo);
		
		for(int i = 0; i< largo; i++) {
			System.out.println("arreglo = " + arreglo[i]);
		}
		
		//
		System.out.println("trabalenguas = " + trabalenguas.split("a"));
		
		
		
		//convierte un arreglo de tipo string
		//la letra a va a ser el separador entre la palabra trabalenguas convirtiendolas en un arreglo de tipo string
		String[] arreglo2 = trabalenguas.split("a");
		int l = arreglo2.length;
		for (int j=0; j<l; j++) {
			System.out.println("arreglo2[j] = " + arreglo2[j]);
		}
		
		
		String archivo = "alguna.imagen.pdf";
		//usar . solo no funciona porque es palabra clave o reservada de expresiones regulares, por eso se usa \\ antes del punto
		//split separa por tipo de caracter
		String[] archivoArray = archivo.split("\\.");
		l = archivoArray.length;
		for (int j=0; j<l; j++) {
			System.out.println("arreglo2[j] = " + archivoArray[j]);
		}
		//imprime el ultimo elemento del arreglo
		System.out.println("extension = " + archivoArray[l-1]);
		
	}

}
