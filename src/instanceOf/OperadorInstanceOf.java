package instanceOf;

public class OperadorInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = new String ("creando un objeto");
		Integer num = 7;
		
		boolean b1 = texto instanceof String;
		
		//object es la clase padre de todos los objetos, toda clase hereda de object aunque no se ve
		//boolean b1 = texto instanceof Object;
		
		System.out.println("texto de tipo String : "+b1);
		
		b1 = texto instanceof Object;
		System.out.println("texto de tipo Object : "+b1);
		
		b1 = num instanceof Integer;
		System.out.println("texto de tipo: "+b1);
		
		b1 = num instanceof Number;
		System.out.println("texto de tipo number : "+b1);
		
		b1 = num instanceof Object;
		System.out.println("texto de tipo Object : "+b1);
		
	}

}
