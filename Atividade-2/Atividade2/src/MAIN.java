import java.util.Scanner;
public class MAIN {

	public static void main(String[] args) {
		Scanner objscanner = new Scanner(System.in);
		Enunciado1 objEnunciado1 = new Enunciado1();
		Enunciado2 objEnunciado2 = new Enunciado2();
		Enunciado3 objEnunciado3 = new Enunciado3();
		Enunciado4 objEnunciado4 = new Enunciado4();
		Enunciado5 objEnunciado5 = new Enunciado5();
		
						//ENUNCIADO1//
		
		/*System.out.println(" INFORME O PRIMEIRO N�MERO ");
		objEnunciado1.setN1(objscanner.nextInt());
		
		System.out.println("INFORME O SEGUNDO N�MERO");
		objEnunciado1.setN2(objscanner.nextInt());
		
		objEnunciado1.exibirMaior();*/
		
						// ENUNCIADO2//
		
		/*System.out.println(" INFORME O PRIMEIRO N�MERO ");
		objEnunciado2.setN1(objscanner.nextInt());
		
		System.out.println("INFORME O SUGUNDO N�MERO");
		objEnunciado2.setN2(objscanner.nextInt());
		
		System.out.println("INFORME O TERCEIRO N�MERO");
		objEnunciado2.setN3(objscanner.nextInt());
		
		objEnunciado2.exibirMaior();*/
		
						//ENUNCIADO3//
		
		/*System.out.println(" INFORME A PRIMEIRA NOTA: ");
		objEnunciado3.setN1(objscanner.nextDouble());
		
		System.out.println(" INFORME A SEGUNDO NOTA: ");
		objEnunciado3.setN2(objscanner.nextDouble());
		
		System.out.println(" INFORME A TERCEIRA NOTA: ");
		objEnunciado3.setN3(objscanner.nextDouble());
		
		System.out.println(" INFORME A QUARTA NOTA: ");
		objEnunciado3.setN4(objscanner.nextDouble());
		

		if (objEnunciado3.media1() >= 7) {
			
			
			objEnunciado3.CalcularMedia();
		}else {
			System.out.println(" INFORME A QUINTA NOTA: ");
			objEnunciado3.setN5(objscanner.nextDouble());
			
			objEnunciado3.CalcularMedia2();
			
			
		}*/
		
					//ENUNCIADO4//
		
		 /*System.out.println("INFORME UM N�MERO");
		 objEnunciado4.setN1(objscanner.nextInt());
		 
		objEnunciado4.MaiorQueZero();*/
		
		           //ENUNCIADO5//
		 
		System.out.println(" INFORME UM N�MERO");
		objEnunciado5.setN1(objscanner.nextInt());
		
		System.out.println(" INFORME UM OUTRO N�MERO");
		objEnunciado5.setN2(objscanner.nextInt());
		
		System.out.println(" INFORME UM OPERADOR");
		objEnunciado5.setOperador(objscanner.next());
		
		objEnunciado5.Calculadora();
		
		System.out.println("RESULTADO: " + objEnunciado5.getResultado());
		
		
		
	}

}

