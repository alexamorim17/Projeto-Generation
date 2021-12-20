package Projeto;
import java.util.Scanner;

 public class Cadastro extends LojaOnline{
	
		private String pagamento;
		
		
	
	void cadastrando(){
		
		Scanner ler = new Scanner(System.in);
			System.out.println("Bem vinde ao Outlet Generation!");
			System.out.println("Digite o usuário: ");
			String usuario1 = ler.nextLine();
			this.setUsuario(usuario1);
			
			System.out.println("Digite a senha: ");
			String senha1 = ler.nextLine();
			this.setSenha(senha1);
			
	
			System.out.println("Usuario: " + this.getUsuario());
			System.out.println("Senha: "+ this.getSenha());
			this.Concluido();

		
	
	}
	


		  
		 












	public String getPagamento() {
		return pagamento;
	}









	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}















	@Override
	void Concluido() {
		System.out.println("Bem vinde!");
		
	}




	
	
}

