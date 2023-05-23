import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner objScanner = new Scanner(System.in);
		 
		 NumeroDeLados objNumeroDeLados = new NumeroDeLados();	

		 System.out.println(" INFORME UM VALOR PARA LADO 1 ");
		 objNumeroDeLados.setLado1(objScanner.nextInt());
		 
		 System.out.println(" INFORME UM VALOR PARA LADO 2 ");
		 objNumeroDeLados.setLado2(objScanner.nextInt());
		 
		 
		 System.out.println(" INFORME UM VALOR PARA LADO 3 ");
		 objNumeroDeLados.setLado3(objScanner.nextInt());
		 
		 objNumeroDeLados.CalcularLados();
		 		 
	}

}
