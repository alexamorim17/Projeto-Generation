package Projeto;


import java.util.Scanner;


public class Pagamento extends LojaOnline{
	
	Scanner ler = new Scanner(System.in);
	Cadastro c = new Cadastro();
	
	
    private String cor;
    private String tamanho;
    private int qnt;
    private double preco;
    private String produto;
    private int repetidor = 0;
    private double total;
    
	
	
		public void ProdutosOutlet() {
	    	
			Cadastro c = new Cadastro();
	    	Scanner ler = new Scanner(System.in);
	    	String escolha;
	    	int x = 0;
	    	String selecao;
	    	int quantidade = 0;
	    	double total = 0;
	    	double total2 = 0;
	    	int escolha2;
	    	int escolha3 = 0;
	    	int escolha4 = 0;
	    	String cor1;
	    	String tamanho1;
	    	String Cores = ("1-Preto,"+ " 2-Azul,"+" 3-Vermelho,"+" 4-Rosa,"+" 5-Branco");    
	    	String Tamanho = ("1-P,"+ " 2-M,"+" 3-G");
	    	
	 
	
	    	System.out.println("----------------------\nPedido\n----------------------");
	    	System.out.println("Digite 1-Camisa, 2-Mochila, 3-Boné ,4-Garrafa térmica ");
	    	System.out.println("Digite 0 para finalizar a compra.");
	    	escolha2 = ler.nextInt();
	    	
	       
	    	if (escolha2 != 0) {
	    		System.out.println("Escolha uma cor: "+Cores);
	    		escolha3 = ler.nextInt();
	        
	    		if(escolha2 == 1 || escolha2 == 3) {
	    			System.out.println("Escolha um tamanho: "+Tamanho);
	    			escolha4 = ler.nextInt();
	    		}else {
	    			System.out.println("Escolha um tamanho: "+"4-Tamanho Único");
	    			escolha4 = ler.nextInt();
	    		}
	        
	    		System.out.println("Digite a quantidade: ");
	    		quantidade = ler.nextInt();
	    		this.setQnt(quantidade);
	    	}
	        
	    	//Definindo Produto
	        if(escolha2 == 1) {
	        	this.setProduto("Camisa");
	        }else if (escolha2 == 2) {
	        	this.setProduto("Mochila");
	        }else if (escolha2 ==3) {
	        	this.setProduto("Boné");
	        }else if (escolha2 ==4){
	        	this.setProduto("Garrafa térmica");
	        }if(escolha2 == 0) {
	        	x= 1;
	        	this.setRepetidor(x);
	        	
	        }
	        //Definindo cor
	        
	        if(escolha3 == 1) {
	        	this.setCor("Preto");
	        }else if (escolha3 == 2) {
	        	this.setCor("Azul");
	        }else if (escolha3 ==3) {
	        	this.setCor("Vermelho");
	        }else if (escolha3 ==4){
	        	this.setCor("Rosa");
	        }else if (escolha3 == 5) {
	        	this.setCor("Branco");
	        }
	        
	        //Definindo tamanho
	        
	        if(escolha4 == 1) {
	        	this.setTamanho("P");
	        }else if (escolha4 == 2) {
	        	this.setTamanho("M");
	        }else if (escolha4 == 3) {
	        	this.setTamanho("G");
	  
	        }else {
	        	this.setTamanho("Tamanho Único");
	        }
	        //Definindo Preço
	        
	        if(escolha2 == 1) {
	        	this.setPreco(29.90); 
	        }else if (escolha2 == 2) {
	        	this.setPreco(80.00); 
	        }else if (escolha2 ==3) {
	        	this.setPreco(25.00); 
	        }else if (escolha2 ==4){
	        	this.setPreco(35.00); 
	        }
	        double n1 = this.getPreco();
	        double n2 = this.getQnt();
	        double valor = n1 * n2;
	        this.setTotal(valor + this.getTotal());
	        
	
	       
	        this.Concluido();
	        
	        
	        
	        
	        
	    	
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

	    public String getProduto() {
		return produto;
	}

	    public void setProduto(String produto) {
		this.produto = produto;
	}

		public int getRepetidor() {
			return repetidor;
		}

		public void setRepetidor(int repetidor) {
			this.repetidor = repetidor;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}
		@Override
		void Concluido() {
			if(this.getRepetidor() == 1) {
				System.out.println("----------------------\nConcluido\n----------------------");
		        System.out.println("Total: R$" + this.getTotal());
			}else {
			System.out.println("----------------------\nConcluido\n----------------------");
	        System.out.println("Produto selecionado: "+this.getProduto());
	        System.out.println("Cor selecionada: " +this.getCor());
	        System.out.println("Tamanho selecionado: "+this.getTamanho());
	        System.out.println("Quantidade: "+ this.getQnt());
	        System.out.println("Preço: R$" + this.getPreco());
	        System.out.println("Total: R$" + this.getTotal());}
	        
			
		}

	    
	    
	    
	    
	}
	
	
	
		
	


