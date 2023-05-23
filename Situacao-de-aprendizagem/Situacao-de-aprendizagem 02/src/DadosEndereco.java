
public class DadosEndereco {

	private String cep;
	
	private String Logadouro;
	
	private String Numero;
	
    private String Bairro;
    
    private String Cidade;
    
    private String Estado;

    //Processamento//
    
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		if (cep.isEmpty()) {
			System.out.println(" O CEP NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else { 
			if (cep.length()>= 3) {
				this.cep = cep;
			}else {
				System.out.println("TEM QUE TER NO MINÍMO 3 LETRAS");
				System.exit(0);
			} 
		}
	}
	

	public String getLogadouro() {
		return Logadouro;
	}

	public void setLogadouro(String logadouro) {
		if (logadouro.isEmpty()) {
			System.out.println(" O LOGADOURO NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else{ 
			if (logadouro.length()>= 3) {
				this.Logadouro = logadouro;
			}else {
				System.out.println("TEM QUE TER NO MINÍMO 3 LETRAS");
				System.exit(0);
			} 
		}
	}
	
	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		if (numero.isEmpty()) {
			System.out.println(" O NÚMERO NÃO PODE FICAR VAZIO");
			System.exit(0); 
		}
		this.Numero= numero;
	}
	
	

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		if(bairro.isEmpty()) {
			System.out.println("SEU BAIRRO NÃO PODE FICAR VAZIO");
			System.exit(0);

		}else {
			this.Bairro = bairro;
		}
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		if(cidade.isEmpty()) {
			System.out.println("SEU CIDADE NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else { 
			this.Cidade = cidade;
		}
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		if (estado.isEmpty()) {
			System.out.println(" O ESTADO NÃO PODE FICAR VAZIO");
			System.exit(0);

		}else { 
			if (estado.length()== 2) {
				this.Estado = estado;
			}else {
				System.out.println("TEM QUE TER NO MINÍMO 2 LETRAS");
				System.exit(0);
			} 
		}
	}
    
	}