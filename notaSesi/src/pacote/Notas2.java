package pacote;
import java.util.Scanner;
public class Notas2 {

	Scanner objScanner = new Scanner (System.in);
	
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double media;

	public void ReceberNotas(){
		
		System.out.println("Insira o valor de Nota 1");
		nota1=objScanner.nextInt();
		
		System.out.println("Insira o valor de Nota 2");
		nota2 = objScanner.nextInt();
		
		System.out.println("Insira o valor de Nota 3");
		nota3 = objScanner.nextInt();
		
		System.out.println("Insira o valor de Nota 4");
		nota4 = objScanner.nextInt();
	}
	
	
	
	public void CalculoMedia(){
		
		media = (nota1+ nota2 + nota3 + nota4 )/4;
		
		if (media > 7) {
			
			System.out.println("Aluno aprovado");
			System.out.println("Média " + media);
		} else if(media >=5 && media <= 7){
			
			System.out.println("Aluno de recuperação");
			System.out.println("Média " + media);
		
		}else{
			
			System.out.println("Aluno reprovado");
			System.out.println("Média: " + media);
		}
		


	}
}
