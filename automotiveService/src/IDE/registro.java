package IDE;

import java.util.Scanner;

public class registro {
 public static void main(String[]args) {
	 
	Scanner leer= new Scanner(System.in);
	
	int n;
	System.out.println("Dijite el numero de vehiculo a registrar");
	n= leer.nextInt();
	
	
			DatRegistro e[] = new DatRegistro[n];
			                                  
		
			String marca= "";
			int modelo= 0;
			int año= 0;
			int chasis= 0;
			int placa= 0;
			
			
			for ( n=0;n<e.length;n++)
			{
				System.out.println("Registro del vehiculo");
				System.out.println("Marca: ");
				marca= leer.nextLine();
				System.out.println("Modelo: ");
				modelo= leer.nextInt();
				System.out.println("Año: ");
				año= leer.nextInt();
				System.out.println("Placa");
				placa= leer.nextInt();
			
				e[n]= new DatRegistro(marca,modelo,año,chasis,placa);
				
			
			}	 
			
			for(int i=0;i<e.length;i++) {
				System.out.println(e[i].getMarca()+"-"+e[i].getModelo()+"-"+e[i].getAño()+"-"
			+e[i].getChasis()+"-"+e[i].getPlaca());
			}
			
	
	}
	}
	
