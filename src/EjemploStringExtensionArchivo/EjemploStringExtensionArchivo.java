package EjemploStringExtensionArchivo;

public class EjemploStringExtensionArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String archivo = "alguna_imagen.jpg";
	
		
		//con el indexoff toma del punto en adelante
		int i = archivo.indexOf(".");
		
		
		//imprime el total de caracteres que tiene mi cadena, = 17
		System.out.println("archivo.length() = " + archivo.length());
		 
		//imprime los caracteres que hay despues del 14avo caracter, ej= jpg
		System.out.println("archivo.substring(14) = " + archivo.substring(14));
		
		//otra forma de obtener caracteres despues del 14avo caracter, ej: jpg
		//i+1 hace que imprima lo que hay despues del punto
		System.out.println("archivo.substring(archivo.length()-4 = " + archivo.substring(i+1));
		
		//que pasa si tenemos lo siguiente, va a imprimir .imagen.jpg y no solo la extension
		String archivo2 = "alguna.imagen.jpg";
		int init = archivo2.indexOf(".");
		System.out.println("archivo2.substring(archivo.length()-4 = " + archivo2.substring(init+1));
		
		//asi que se usa astIndexOf, que imprime lo que hay despues del ultimo punto de la cadena
		int inicializador = archivo.lastIndexOf(".");
		
		System.out.println("archivo2.substring(archivo.length()-4 = " + archivo.substring(inicializador+1));
		
	}

}
