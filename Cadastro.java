package Projeto;
import java.util.Scanner;

 public class Cadastro extends LojaOnline{


	



		private String usuario;
		private String pagamento;
		private String senha;
		private String ID;
		
		
		 
		
		
	boolean confirmarCadastro() {
	
	Scanner ler = new Scanner (System.in);
	boolean cadastrar;
	int pergunta; 
	int pergunta2;
		
		
		
		
		
		
		System.out.println("Deseja se cadastrar ?: |1|Sim|2|Não ");
		pergunta = ler.nextInt();
	
	
		
		if(pergunta == 1) {
		
			cadastrar = true;
		
		}else {
			
			cadastrar = false;
		}
		
	return cadastrar;
	
	
}
	
	void cadastrando(){
		
		Scanner ler = new Scanner (System.in);
		
		
			
			System.out.println("Digite o usuário: ");
			String usuario1 = ler.nextLine();
			this.setUsuario(usuario1);
			
			System.out.println("Digite a senha: ");
			String senha1 = ler.nextLine();
			this.setSenha(senha1);
			

		
		
	}
		  
		  
		  
		
		  
		
			
			
		
	void Concluido(){
			
		System.out.println("Cliente cadastrado com sucesso !");
		
			
	}









	public String getUsuario() {
		return usuario;
	}









	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}









	public String getPagamento() {
		return pagamento;
	}









	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}









	public String getSenha() {
		return senha;
	}









	public void setSenha(String senha) {
		this.senha = senha;
	}

	





	
	
}

