package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public long numeroPrimosAMostrar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el numero de numeros primos a mostrar: ");
		long total = sc.nextLong();
		
		return total;
	}

}
