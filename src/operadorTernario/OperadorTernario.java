package operadorTernario;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//variable = condicion ? si es verdadero: si es falso;
		String variable = 7 == 7 ? "si, es verdadero": "es falso";
		System.out.println("variable: " + variable);
		
		String estado = "";
		double promedio = 6.2;
		
		estado = promedio >= 5.49 ? "Aprobado" : "reprobado";
		System.out.println("estado: " + estado);
		
		if (promedio >= 5.49 ) {
			estado = "aprobado";
		}else {
			estado= "reprobado";
		}
	}

}
