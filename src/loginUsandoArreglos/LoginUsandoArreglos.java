package loginUsandoArreglos;

import java.util.Scanner;

public class LoginUsandoArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] usernames = new String[2];
		String[] passwords = new String[2];
		
		usernames[0] = "itzel";
		passwords[0] = "12345";
		
		usernames[1] = "rodrigo";
		passwords[1] = "54321";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("dame el nombre de usuario");
		
		String u = scanner.next();
		System.out.println("dame la contraseña del usuario");
		String p = scanner.next();
		
		boolean esAutenticado = false;
		
		for(int i = 0; i< usernames.length; i++ ) {
			if (usernames[i].equals(u) && passwords[i].equals(p)) {
				esAutenticado = true;
				System.out.println("el registro es correcto");
				break;
			}else {
				System.out.println("usuario incorrecto");
			}
		}
		
		
		if(esAutenticado) {
			System.out.println("Bienvenido usuario " .concat(u).concat(" !!"));
		}
	}

}
