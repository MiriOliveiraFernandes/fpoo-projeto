package enunciado2temperatura;
import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double fahrenheit,celsius;
		System.out.println("DIGITE O VALOR EM FAHRENHEIT");
		fahrenheit = scanner.nextDouble();
		celsius = (fahrenheit-32)/1.8;
		System.out.println(" RESULTADO EM CELSIUS: " + celsius);
		
	
	
	}

}
