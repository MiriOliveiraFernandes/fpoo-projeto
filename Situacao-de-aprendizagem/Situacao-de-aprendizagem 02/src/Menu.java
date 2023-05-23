import java.util.Scanner;

public class Menu {
	DadosPessoais objDadosPessoais;
	DadosEndereco objDadosEndereco;
	DadosContato objDadosContatos;
	
	public void exibirMenu(){
		
		int opcao = 0 ;
		Scanner objScanner = new Scanner(System.in);
		
		while(opcao != 5) {
			System.out.println("ESCOLHA UMA DAS OP��ES ");
			System.out.println("1 - DADOS PESSOAIS ");
			System.out.println("2 - DADOS DE CONTATO ");
			System.out.println("3 - DADOS DE ENDERE�O ");
			System.out.println("4 - EXBIBIR DADOS ");
			System.out.println("5 - SAIR");
			
			opcao = objScanner.nextInt();
			
			switch (opcao) {
			case 1: 
				
				objDadosPessoais = new DadosPessoais();
				
				
				System.out.println("DIGITE UM NOME:");
				objDadosPessoais.setNome(objScanner.next());
			
				System.out.println("DIGITE SEU SOBRENOME ");
				objDadosPessoais.setsobreNome(objScanner.next());
		
				System.out.println("DIGITE A SUA DATA DE NASCIMENTO COMPLETA");
				objDadosPessoais.setdataNascimento(objScanner.next());
		
				System.out.println("DIGITE SEU G�NERO");
				objDadosPessoais.setgenero(objScanner.next());
				
				break;
				
			case 2: 
				
				objDadosContatos = new DadosContato();
				
				 System.out.println("DIGITE SEU EMAIL");
				 objDadosContatos.setEmail(objScanner.next());
				   
				 System.out.println("DIGITE SEU TELEFONE");
				 objDadosContatos.setTelefone(objScanner.next());
				   
				break;
			case 3: 
				
				objDadosEndereco = new DadosEndereco();
				
				System.out.println("DIGITE SEU CEP");
			    objDadosEndereco.setCep(objScanner.next());
			    
			    System.out.println("DIGITE SEU LOUGADORO");
			    objDadosEndereco.setLogadouro(objScanner.next());
			    
			    System.out.println("DIGITE O N�MERO DA CASA");
			    objDadosEndereco.setNumero(objScanner.next());
			    
			    System.out.println("DIGITE O BAIRRO");
			    objDadosEndereco.setBairro(objScanner.next());
			    
			    System.out.println("DIGITE A SUA CIDADE");
			    objDadosEndereco.setCidade(objScanner.next());
			    
			    System.out.println("DIGITE O ESTADO");
			    objDadosEndereco.setEstado (objScanner.next());
			    
				break;
			case 4:
				System.out.println(" DADOS PESSOAIS :");
				System.out.println(" NOME : " + objDadosPessoais.getNome());
				System.out.println(" SOBRENOME : " + objDadosPessoais.getSobreNome());
				System.out.println(" DATA DE NASCIMENTO : " + objDadosPessoais.getDataNascimento());
				System.out.println(" G�NERO : " + objDadosPessoais.getGenero());
				
				System.out.println(" DADOS DE CONTATO :");
				System.out.println(" EMAIL: " + objDadosContatos.getEmail());
				System.out.println(" TELEFONE : " + objDadosContatos.getTelefone());
				
				System.out.println("DADOS DE ENDERE�O:");
				System.out.println(" CEP : " + objDadosEndereco.getCep());
				System.out.println(" LOGADOURO : " + objDadosEndereco.getLogadouro());
				System.out.println(" N�MERO : " + objDadosEndereco.getNumero());
				System.out.println(" BAIRRO : " + objDadosEndereco.getBairro());
				System.out.println(" ENDERE�O : " + objDadosEndereco.getCidade());
				System.out.println(" ESTADO : " + objDadosEndereco.getEstado());
				break;
				
			case 5:
				System.out.println(" OBRIGADA POR USAR O PROGRAMA ");
				
			    
				break;

			default: 
				System.out.println(" OP��O INV�LIDA ");
				break;
			}
		}
		
	}
	
}
