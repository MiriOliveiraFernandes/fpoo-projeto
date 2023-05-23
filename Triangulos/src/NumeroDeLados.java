
public class NumeroDeLados {

	int lado1;
	int lado2;
	int lado3;
	
	public void CalcularLados() {
		
		if((getLado1()==getLado2()) && (getLado2()==getLado3())){
			System.out.println(" É UM TRIÂNGULO EQUILÁTERO");
	
		}
		if((getLado1() == getLado2()) && (getLado1()!=getLado3())){
			System.out.println(" É UM TRIÃNGULO ISÓSCELES");
		}
		if((getLado1()!=getLado2()) && (getLado2()!=getLado3())){
			System.out.println(" É UM TRIÂNGULO ESCALENO");
		}
	}
	
	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	
	}
