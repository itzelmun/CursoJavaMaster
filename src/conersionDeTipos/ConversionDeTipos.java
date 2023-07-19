package conersionDeTipos;

public class ConversionDeTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//se convierte un string a entero 
		//se puede usar parseInt
		String numeroStr = "50";
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt="+ numeroInt);
		
		//tambien se puede un string a decimales
		String realStr = "98465.43";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("realDouble=" + realDouble);
		
	
		//convertir de tipo prmitivo a string
		int otronumeroInt = 1000;
		System.out.println("otronumeroInt=" + otronumeroInt);
		String otronumeroStr = Integer.toString(otronumeroInt);
		
		System.out.println("otro numero= "+ otronumeroStr);
		//se convierte de integer astring usando sobrecarga de métodos con valueOf
		otronumeroStr = String.valueOf(otronumeroInt+10);
		System.out.println("otroNumeroStr="+otronumeroStr);
		
		//otra forma es
		//lo concatena
		otronumeroStr = String.valueOf(otronumeroStr+10);
		System.out.println("otroNumeroStr="+otronumeroStr);
		
		//convertir de decimal a string
		double otroRealDouble = 2.33445;
		String otroRealStr = Double.toString(otroRealDouble);
		System.out.println("otroRealDouble= "+ otroRealStr);
		
		//otra forma es con valueOf
		otroRealStr = String.valueOf(12.33445);
		System.out.println("otroRealStr = "+ otroRealStr);
		
		//convertir un integer a un short
		int i = 32600;
		//se forza la conversion con comillas
		short s = (short)i;
		System.out.println("s = "+ s);
		long l = 1;
		System.out.println("l = "+ l);
		//te dice cual es el maximo valor que soporta un short
		System.out.println(Short.MAX_VALUE);
		
		
	}

}
