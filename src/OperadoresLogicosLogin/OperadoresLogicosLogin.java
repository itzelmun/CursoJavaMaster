package OperadoresLogicosLogin;

import java.util.Scanner;

public class OperadoresLogicosLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "andres";
		String password = "12345";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("dame el nombre de usuario");
		String u = scanner.next();
		System.out.println("dame la contraseña del usuario");
		String p = scanner.next();
		
		boolean esAutenticado = false;
		
		if (username.equals(u) && password.equals(p)) {
			esAutenticado = true;
			
		}
		
		if(esAutenticado == true) {
			System.out.println("el registro es correcto");
		}else {
			System.out.println("incorrecto");
		}
	}

}
