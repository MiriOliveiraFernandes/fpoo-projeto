import java.util.Scanner;

public class enunciado1 {
	String[] nomes = new String[10];
	Scanner objScanner = new Scanner(System.in);
	
	public void exibirNome(){
		for(int indice = 0; indice< nomes.length; indice++) {
			System.out.println( " Digite o "+ (indice+1)+ " nome : ");
			nomes[indice]= objScanner.next();
			
		}
		
		System.out.println(" NOMES ");
		
		int indice=0; 
		
		while (indice < nomes.length) {
			System.out.println((indice +1) + " Nomes " + nomes[indice]);
			indice++;
		}
		
	}
	
}