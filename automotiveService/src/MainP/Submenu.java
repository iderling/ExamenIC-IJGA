package MainP;

import java.util.Scanner;

import IDE.diagnostico;
import IDE.enderezadopintura;
import IDE.mantenimiento;

public class Submenu {
	
	
public static void main(String[]args) {
		
		
		Scanner leer  = new Scanner(System.in);
		
		 int opc;
		
		System.out.println("AUTOSERVICE \n1. Mantenimiento Preventivo \n2.Enderezado y pintura \n3. Diagnostico");
		opc = leer.nextInt();
		
		
		 switch(opc) {
		 case 1:
			 mantenimiento.main(args);
			 break;
			 
		 case 2:
			 enderezadopintura.main(args);
			 break;
			 
		 case 3:
			 diagnostico.main(args);
			 break;
			 
		 case 4:
			 System.exit(0);
			 default:
			 break;
		 }
	}
}
