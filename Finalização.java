package Projeto;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Finalização extends LojaOnline{
	
	public static void main(String[] args) {
		
		boolean repetir = true;
		
		
		Pagamento p = new Pagamento ();
		Cadastro c = new Cadastro();
		Compra co = new Compra();
		
		
		
		Collection<String> nomes = new ArrayList<String>();
		
		
		
		
		c.cadastrando();
		while(p.getRepetidor() == 0) {
			p.ProdutosOutlet();
			nomes.add(p.getProduto());
		
		}
	
		System.out.println("Lista de compras: "+nomes);
		co.FazendoPagamento();
		
	}

	@Override
	void Concluido() {
		// TODO Auto-generated method stub
		
	}

}
	
	
	
	
	

