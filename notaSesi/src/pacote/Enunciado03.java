package pacote;
import java.util.Scanner;
public class Enunciado03 {
	
	Scanner objScanner = new Scanner(System.in);
	
	int cargo;
	double total; 
	double salario;
	double porcentagem;

	public void Cargo(){		
		System.out.println("1- Escriturário");
		System.out.println("2- Secretário");
		System.out.println("3- Caixa");
		System.out.println("4- Gerente");
		System.out.println("5- Diretor");
		
		System.out.println("Escolha o número da profissões");
		cargo = objScanner.nextInt();
		
		System.out.println("Digite o seu salário ? ");
		salario = objScanner.nextDouble();
		
		switch (cargo) {
		case 1:
			porcentagem = salario/100;
			total = (porcentagem*50)+ salario;
			System.out.println("O cargo selecionado é: " + cargo);
			System.out.println("Porcentagem de aumento é  de 50%");
			System.out.println("O salário novo é: " + total);

			break;
		case 2:
			porcentagem = salario/100;
			total = (porcentagem*35)+ salario;
			System.out.println("O cargo selecionado é: " + cargo);
			System.out.println("Porcentagem de aumento é  de 35%");
			System.out.println("O salário novo é: " + total);

			break;

		case 3:
			porcentagem = salario/100;
			total = (porcentagem*20)+ salario;
			System.out.println("O cargo selecionado é: " + cargo);
			System.out.println("Porcentagem de aumento é  de 20%");
			System.out.println("O salário novo é: " + total);

			break;

		case 4:
			porcentagem = salario/100;
			total = (porcentagem*10)+ salario;
			System.out.println("O cargo selecionado é: " + cargo);
			System.out.println("Porcentagem de aumento é  de 10%");
			System.out.println("O salário novo é: " + total);
			break;

		case 5:
			System.out.println("Diretor não tem aumento");
			break;
			
		default:
			System.out.println("Código Inválido");
			break;
		
		}
	}
}