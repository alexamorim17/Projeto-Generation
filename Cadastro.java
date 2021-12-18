package Projeto;
import java.util.Scanner;

 public class Cadastro extends LojaOnline{
	
		private String pagamento;
		private String ID;
		
	boolean confirmarCadastro() {
	
	Scanner ler = new Scanner (System.in);
	boolean cadastrar = false;
	int pergunta; 
	
		
		
		
		
		
		
		System.out.println("Deseja se cadastrar ?: |1|Sim|2|Não ");
		pergunta = ler.nextInt();
	
	
		
		if(pergunta == 1) {
		
			cadastrar = true;
		
		}else {
			
			System.out.println("Cliente não desejou se cadastrar");
			cadastrar = false;
		}
		
	return cadastrar;
	
	
}
	
	void cadastrando(){
		
		Scanner ler = new Scanner(System.in);
			if(this.confirmarCadastro()) {
				System.out.println(this.confirmarCadastro());
			System.out.println("Digite o usuário: ");
			String usuario1 = ler.nextLine();
			this.setUsuario(usuario1);
			
			System.out.println("Digite a senha: ");
			String senha1 = ler.nextLine();
			this.setSenha(senha1);
			
	
			System.out.println("Usuario: " + this.getUsuario());
			System.out.println("Senha: "+ this.getSenha());
			System.out.println("Bem vindo!");
			}else {
				this.confirmarCadastro();
			}

		
	
	}
		  
		  
		 












	public String getPagamento() {
		return pagamento;
	}









	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}




	
	
}

