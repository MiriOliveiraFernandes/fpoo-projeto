package pacote;
import java.util.Scanner;
public class Enunciado03 {
	
	Scanner objScanner = new Scanner(System.in);
	
	int cargo;
	double total; 
	double salario;
	double porcentagem;

	public void Cargo(){		
		System.out.println("1- Escritur�rio");
		System.out.println("2- Secret�rio");
		System.out.println("3- Caixa");
		System.out.println("4- Gerente");
		System.out.println("5- Diretor");
		
		System.out.println("Escolha o n�mero da profiss�es");
		cargo = objScanner.nextInt();
		
		System.out.println("Digite o seu sal�rio ? ");
		salario = objScanner.nextDouble();
		
		switch (cargo) {
		case 1:
			porcentagem = salario/100;
			total = (porcentagem*50)+ salario;
			System.out.println("O cargo selecionado �: " + cargo);
			System.out.println("Porcentagem de aumento �  de 50%");
			System.out.println("O sal�rio novo �: " + total);

			break;
		case 2:
			porcentagem = salario/100;
			total = (porcentagem*35)+ salario;
			System.out.println("O cargo selecionado �: " + cargo);
			System.out.println("Porcentagem de aumento �  de 35%");
			System.out.println("O sal�rio novo �: " + total);

			break;

		case 3:
			porcentagem = salario/100;
			total = (porcentagem*20)+ salario;
			System.out.println("O cargo selecionado �: " + cargo);
			System.out.println("Porcentagem de aumento �  de 20%");
			System.out.println("O sal�rio novo �: " + total);

			break;

		case 4:
			porcentagem = salario/100;
			total = (porcentagem*10)+ salario;
			System.out.println("O cargo selecionado �: " + cargo);
			System.out.println("Porcentagem de aumento �  de 10%");
			System.out.println("O sal�rio novo �: " + total);
			break;

		case 5:
			System.out.println("Diretor n�o tem aumento");
			break;
			
		default:
			System.out.println("C�digo Inv�lido");
			break;
		
		}
	}
}