
public class DadosContato {

	private String Email;
	
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		if(email.isEmpty()) {
			System.out.println("SEU EMAIL NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else {
			this.Email = email;	
		}
		
	}

	private String Telefone;

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone.isEmpty()) {
			System.out.println("O NOME NÃO PODE FICAR VAZIO");
			System.exit(0);
		}else {
			if(telefone.length()>=15) {
				this.Telefone = telefone;
			}else {
				System.out.println("TEM QUE TER 15 CARACTERES");
				System.exit(0);
			}
		}
	}
	}
