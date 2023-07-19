package entradaDeDatos;

import javax.swing.*;

public class VentanaDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numeroStr = JOptionPane.showInputDialog(null, "dame un numero entero");
			int numeroDecimal = 	Integer.parseInt(numeroStr);
			String mensaje = "numero binario de "+ numeroDecimal + "= "+ Integer.toHexString(numeroDecimal);
			JOptionPane.showInternalMessageDialog(null, numeroStr);
	}
	}


