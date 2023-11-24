package Controladores;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {

		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		long totalNumero = mi.numeroPrimosAMostrar();
		
		long control = 1;
		for(long numero =1; control <=totalNumero; numero++) {
			
			if(oi.esPrimo(numero)) {
				System.out.println(numero);
				control++;
			}
		}

	}

}
