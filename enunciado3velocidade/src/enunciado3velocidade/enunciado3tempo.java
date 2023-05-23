package enunciado3velocidade;
import java.util.Scanner;

public class enunciado3tempo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double tempo, velocidade, litrosUsados, distancia;
		
		System.out.println("Bem vindo ao conversor");
		System.out.println("Digite o tempo gasto para a viagem:");
		tempo=scanner.nextDouble();
		
		System.out.println("Digite a velocidade média:");
		velocidade= scanner.nextDouble();
		
		distancia= velocidade*tempo;
		
		litrosUsados= distancia/12;
		
		System.out.println("Velocidade média: "+ velocidade);
		
		System.out.println("Tempo gasto na viagem: " + tempo);
		
		System.out.println("Distância percorrida: " + distancia);
		
		System.out.println("Quantidade de litros gatos na viagem: " + litrosUsados);
		
		
		System.out.println(" Muito Obrigado por utilizar o conversor");
		


		
		
		
		
	}

}
