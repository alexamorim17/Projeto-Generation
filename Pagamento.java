package Projeto;

import java.util.Scanner;

public class Pagamento extends LojaOnline{
	
	Scanner ler = new Scanner(System.in);
	Cadastro c = new Cadastro();
	
	
	int total = 0;
    private String cor;
    private String tamanho;
    private int qnt;
    private double preco;
    private String produto;
	
	
		public void ProdutosOutlet() {
	    	
			Cadastro c = new Cadastro();
	    	Scanner ler = new Scanner(System.in);
	    	String escolha;
	    	int x;
	    	String selecao;
	    	int quantidade = 0;
	    	String cor1;
	    	String tamanho1;
	 
	    	
	 
	    	c.cadastrando();
	    	System.out.println("Digite Camisa, Mochila, Boné ou Garrafa térmica: ");
	    	escolha = ler.nextLine();
	    	this.setProduto(escolha);
	    	
	    	
	       String Cores = ("Preto,"+ " Azul,"+" Vermelho,"+" Rosa,"+" Branco");
	       String Tamanho = ("P,"+ "M,"+" G");
	        
	        
	        
	        
	    
	        System.out.println("Escolha uma cor: "+Cores);
	        cor1 = ler.nextLine();
	        this.setCor(cor1);
	        System.out.println("Escolha um tamanho: "+Tamanho);
	        tamanho1 = ler.nextLine();
	        this.setTamanho(tamanho1);
	        
	        System.out.println("Digite a quantidade: ");
	        quantidade = ler.nextInt();
	        this.setQnt(quantidade);
	        
	        
	        System.out.println("----------------------\nPedido\n----------------------");
	        System.out.println("Produto selecionado: "+this.getProduto());
	        System.out.println("Cor selecionada: " +this.getCor());
	        System.out.println("Tamanho selecionado: "+this.getTamanho());
	        System.out.println("Quantidade: "+ this.getQnt());
	        
	    }

	    private void escolha() {
			// TODO Auto-generated method stub
			
		}

		public String getCor() {
	        return cor;
	    }


	    public void setCor(String cor) {
	        this.cor = cor;
	    }


	    public String getTamanho() {
	        return tamanho;
	    }


	    public void setTamanho(String tamanho) {
	        this.tamanho = tamanho;
	    }


	    public int getQnt() {
	        return qnt;
	    }


	    public void setQnt(int qnt) {
	        this.qnt = qnt;
	    }


	    public double getPreco() {
	        return preco;
	    }


	    public void setPreco(double preco) {
	        this.preco = preco;
	    }


		public int getTotal() {
			return total;
		}


		public void setTotal(int total) {
			this.total = total;
		}


	    public String getProduto() {
		return produto;
	}

	    public void setProduto(String produto) {
		this.produto = produto;
	}


	    
	    
	    
	    
	}
	
	
	
		
	


