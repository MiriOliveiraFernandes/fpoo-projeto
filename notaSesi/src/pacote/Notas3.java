package pacote;

public class Notas3 {
	
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double media;

	
	nota1 = Double.parseDoubl(JOptionPane.showInputDialog("Informe a primeira nota:"));
	nota2 = Double.parseDoubl(JOptionPane.showInputDialog("Informe a segunda nota:"));
	nota3 = Double.parseDoubl(JOptionPane.showInputDialog("Informe a terceira nota:"));
	nota4 = Double.parseDoubl(JOptionPane.showInputDialog("Informe a quarta nota:"));
	
	
	media = (nota1 + nota2 +nota3 +nota4)/4;
	
	if(media>7) {
		
		System.out.println("Aluno Aprovado");
		
	}else if(media>=5 && media <=7) {
		
		System.out.println("Aluno de Recuperação");
		
	}else {
		
		System.out.println("Aluno Reprovado");
		
	}
}
}	
	

