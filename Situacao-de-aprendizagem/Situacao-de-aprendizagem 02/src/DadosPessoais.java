
public class DadosPessoais {
	
	private String Nome;
	
	public void setNome(String Nome ) {
		if (Nome.isEmpty()) {
			System.out.println(" O NOME N�O PODE FICAR VAZIO ");
		}else { 
			if (Nome.length()>= 3) {
				this.Nome = Nome;
			}else {
				System.out.println("TEM QUE TER NO MIN�MO 3 LETRAS");
				System.exit(0);
			} 
		}
	}
	
	private String sobreNome;
	
	public void setsobreNome(String sobreNome) {
		if(sobreNome.isEmpty()) {
			System.out.println("O NOME N�O PODE FICAR VAZIO");
			System.exit(0);
		}else {
				if(sobreNome.length()>=3) {
					this.sobreNome = sobreNome;
				}else {
					System.out.println("TEM QUE TER NO MINIMO 3 LETRAS");
					System.exit(0);
				}
		}
	}
	
	private String dataNascimento;
	
	public void setdataNascimento(String dataNascimento) {
		if(dataNascimento.isEmpty()) {
			System.out.println("A DATA DE NASCIMENTO N�O PODE FICAR VAZIO");
			System.exit(0);
		}else {
			if(dataNascimento.length()==10) {
				this.dataNascimento = dataNascimento;
			}else {
				System.out.println("TEM QUE TER NO MINIMO 10 CARACTERES");
				System.exit(0);
			}
		}
	}
	
	private String genero;
	
	public void setgenero(String genero) {
		if(genero.isEmpty()) {
			System.out.println("DIGITE SEU G�NERO");
			
		}else {
			if(genero.equalsIgnoreCase("Feminino")) {
				this.genero = genero;
			}else {
				if(genero.equalsIgnoreCase(" Masculino")) {
					this.genero = genero;
				}else {
					if(genero.equalsIgnoreCase("Outros")) {
						this.genero = genero;
					} else {
						System.out.println(" ESSE G�NERO N�O � V�LIDO") ;
						System.exit(0);
			
					}
				}
			}
		}
	}

			public String getNome() {
				return Nome;
			}

			public String getSobreNome() {
				return sobreNome;
			}

			public String getDataNascimento() {
				return dataNascimento;
			}

			public String getGenero() {
				return genero;
			}
				
				}
