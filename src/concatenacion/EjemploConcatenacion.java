package concatenacion;

public class EjemploConcatenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String curso = "Programacion Java";
		String profesor = "Itzel";
		
		String detalle = curso + "con el instructor " + profesor;
		System.out.println(detalle);
		int numeroA = 18;
		int numeroB = 5;
		
		System.out.println(detalle + numeroA + numeroB);
		System.out.println(detalle + (numeroA + numeroB));
		System.out.println(numeroA + numeroB + detalle);
		
		//concatenar pero sin usar el + sino el concat
		String detalle2 = curso.concat(profesor);
		String detalle3 = curso.concat("con").concat(profesor);
		
		System.out.println("detalle2 = "+ detalle2);
		System.out.println("detalle3 ="+ detalle3);
		
		//reemplazar las a minusculas por mayusculas
		String resultado3 = curso.replace("a", "A");
		System.out.println("resultado3 = "+ resultado3);
	
		
	}

}
