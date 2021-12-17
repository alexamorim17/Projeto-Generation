package Projeto;

public class Finalização {
	
	public static void main(String[] args) {
		Cadastro c = new Cadastro();
		Pagamento p = new Pagamento();
		
		
		if (c.confirmarCadastro() == true) {
			c.cadastrando();
			c.Concluido();
			
		}else {
			System.out.println("Cliente não aceitou");
		}
		
		System.out.println("Usuário: "+c.getUsuario());
		System.out.println("Senha: "+c.getSenha());
			
		}
		
	}
	
	
	
	

