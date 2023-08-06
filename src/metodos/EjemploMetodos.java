package metodos;

public class EjemploMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Itzel";
		
		//da el numero de letras que contiene el string
		System.out.println("nombre.length() = " + nombre.length());
		
		//convierte a mayusculas
		System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
		
		//convierte a minusculas
		System.out.println("nombre.toLowerCase = " + nombre.toLowerCase());
		
		//compara si es igual
		System.out.println("nombre.equals = " + nombre.equals("itzel"));
		System.out.println("nombre.equals = " + nombre.equals("Itzel"));
		
		//Compara dos strings para ver si son iguales ignorando las diferencias entre mayúsculas y minúsculas
		System.out.println("nombre.equalsIgnoreCase = " + nombre.equalsIgnoreCase("itzel"));
		
		//compara si los string son iguales, si son iguales regresa un 0, menos de 0 si el string tiene menos letras, y mayor que 0 si tiene mas
		System.out.println("nombre.compareTo = " + nombre.compareTo("Itzel"));
		System.out.println("nombre.compareTo = " + nombre.compareTo("itzola"));
		
		//regresa la letra segun la posicion que le indiques, por ejemplo aqui regresa la I
		System.out.println("nombre.chartAt = " + nombre.charAt(0));
		System.out.println("nombre.chartAt = " + nombre.charAt(1));
		System.out.println("nombre.chartAt = " + nombre.charAt(2));
		
		//retorna la letra de la ultima a la primera, ejemplo -1 sería la L, -2 la E
		System.out.println("nombre.chartAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-2 ));
		 
		//cuenta las letras desde el 0 y retorna las restantes
		System.out.println("nombre.subString(1) = " + nombre.substring(1));
		System.out.println("nombre.subString(1-4) = " + nombre.substring(1,4));
		System.out.println("nombre.subString(3-3) = " + nombre.substring(4,4));
		System.out.println("nombre.subString(nombre.length()-2 = " + nombre.substring(nombre.length()-2));
		
		
		String trabalenguas = "trabalenguas";
		System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
		System.out.println("trabalenguas = " + trabalenguas);
		System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
		System.out.println("trabalenguas.lastIndexOf = " + trabalenguas.lastIndexOf('a'));
		
		//
		System.out.println("trabalenguas.indexOf('lenguas') = " + trabalenguas.indexOf("lenguas"));
		
		//busca si en el string existen los caracteres ingresados
		System.out.println("trabalenguas.contains = " + trabalenguas.contains("lenguas"));
		
		//compara si las primeras letras del string son iguales
		System.out.println("trabalenguas.startsWith = " + trabalenguas.startsWith("tr"));
		
		//compara si las ultimas letras del string son iguales
		System.out.println("trabalenguas.endsWith = " + trabalenguas.endsWith("as"));
		
		//respeta los espacios
		System.out.println("  trabalenguas  ");
		//quita los espacios
		System.out.println("  trabalenguas  ".trim());
		
		
		
		
		
		
		

	}

}
