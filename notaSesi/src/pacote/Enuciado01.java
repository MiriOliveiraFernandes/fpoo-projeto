package pacote;

import java.util.Scanner;

public class Enuciado01 {
	String plano;
	Scanner objScanner = new Scanner (System.in);
	
public void Valor(){
		
		System.out.println("Insira o nome do seu plano ");
		plano= objScanner.next();

		switch (plano) {
		case "b�sico":
			System.out.println(" O valor da sua mensalidade � de R$ 150,00");
			break;

		case "bronze":
			System.out.println(" O valor da sua mensalidade � de R$ 220,00");
			break;
			
		case "prata":
			System.out.println(" O valor da sua mensalidade � de R$ 310,00");
			break;
			
		case "ouro":
			System.out.println(" O valor da sua mensalidade � de R$ 450,00");
			break;
			
		default:
			System.out.println("Este plano n�o existe");
			break;
		}
		
	}

}
