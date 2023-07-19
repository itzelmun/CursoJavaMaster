package ejercicioFactura;

import java.util.Scanner;

public class DetalleDeFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ejemplo  = new Scanner(System.in);
		System.out.println("Dame el nombre de la factura");
		String nombreFactura = "";
		try{
			nombreFactura = ejemplo.nextLine();
			double productoUno = 0;
			double productoDos = 0;
			System.out.println("dame el precio de un producto en decimal");
			
			System.out.println("dame otro precio en decimal");
			
		}catch(Exception e){
			System.out.println("dame un nombre valido");
		}
	}

}
