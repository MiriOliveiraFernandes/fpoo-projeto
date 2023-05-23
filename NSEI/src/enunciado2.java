import java.util.Scanner;

public class enunciado2 {
	int[] valor1 = new int[10];
	int[] valor2 = new int[10];
	Scanner objScanner = new Scanner(System.in);
	
	public void listarNumeros() {
		
		int cont = 0;
		
		while(cont < valor1.length) {
			System.out.println(" VALOR : " + (cont + 1));
			valor1[cont]= objScanner.nextInt();
			cont++;
		}

		cont= 0;
		while(cont < valor2.length) {
			valor2[cont]= valor1[cont]*3;
			cont++;
		
		}
		
		System.out.println(" VALORES ");
		cont =0;
		while (cont < valor1.length) {
			
			System.out.println((cont+1) + " valor - array valor 1: " + valor1[cont]);
			System.out.println((cont+1) + "valor - array valor 2: " + valor2[cont]);
			cont++;
		}
	
	}
}


	
