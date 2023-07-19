package entradaEscaner;

import java.util.Scanner;

public class EntradaDatosEscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		 System.out.println("dame un numero entero:");
		//  String numeroStr = scanner.nextLine();
		 int numeroDecimal = 0;
		 
		 try {
			 numeroDecimal =  scanner.nextInt(); //Integer.parseInt(numeroStr);
		 }catch(NumberFormatException e){
			 System.out.println("Error, dame numero entero");
			 main(args);
			 System.exit(0);
			 
		 }

	}

}
