package MainP;

import java.util.Scanner;

import IDE.registro;

public class Menuprincipal {
	
	public static void main(String[]args) {
		
		
		Scanner leer  = new Scanner(System.in);
		
		 int opc;
		
		System.out.println("MENU PREINCIPAL \n1.Agregar informacion del vehiculo \n2.Agregar Numero de servicios");
		opc = leer.nextInt();
		
		
		 switch(opc) {
		 case 1:
			 registro.main(args);
			 break;
			 
		 case 2:
			 Submenu.main(args);
			 break;
			 
		 case 3:
			 System.exit(0);
			 default:
			 break;
		 }
	}

}
