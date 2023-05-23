package conversordetemperatura;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("DIGITE O VALOR EM GRAUS CELSIUS");
		celsius = scanner.nextDouble();
        fahrenheit = (celsius*1.8+32);
        
        System.out.println(" RESULTADO EM FAHRENHEIT " + fahrenheit);
        
	}
}

