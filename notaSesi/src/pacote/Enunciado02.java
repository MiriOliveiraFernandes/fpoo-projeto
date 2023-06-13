package pacote;
import java.util.Scanner;
public class Enunciado02 {
	String codigo;
	double quant;
	double precoTotal;
	Scanner objScanner = new Scanner(System.in);
	
	public void Contagem(){
		System.out.println("Digite o código do produto: ");
		codigo= objScanner.next();
		
		System.out.println("Digite a quantidade comprada: ");
		quant = objScanner.nextDouble();
		
		switch (codigo) {
		case "A001":
			precoTotal = (quant*7.50);
			System.out.println("O valor total R$ "+ precoTotal);
			break;
		
		case "A002":
			precoTotal = (quant*9.90);
			System.out.println("O valor total R$ "+ precoTotal);
			break;
			
		case "A003":
			precoTotal = (quant*14.00);
			System.out.println("O valor total R$ "+ precoTotal);
			break;
			
		case "A004":
			precoTotal = (quant*19.99);
			System.out.println("O valor total: "+ precoTotal);
			break;

		default:
			System.out.println("Código inválido");
			break;
		}
		
	}
	

	
	

}
