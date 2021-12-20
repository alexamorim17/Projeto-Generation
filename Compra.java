package Projeto;


	
	import java.util.Scanner;

	import javax.swing.JOptionPane;

	public class Compra extends LojaOnline {

		void FazendoPagamento() {
			
			// ATRIBUTOS
			
			String dataValidade;
			String cpf;
			String nome;
			String sobrenome;
			String email;
			String whatsapp;
			String cep;
			String endereço;
			
			int cartao = 1, boleto = 2, pix = 3;
			int formaPagamento = 0, numeroCartao1, numeroCartao2, numeroCartao3, numeroCartao4, codigoSeguranca;
			
			// INTERAÇÃO
			
			Scanner ler = new Scanner(System.in);
			
		
			Pagamento p = new Pagamento();
			
			
			
			
			System.out.println(
			
					"==========================" + "\n       Generation Outlet\n          Pagamento"+"\n==========================");
			System.out.println("=   Agora vamos para a parte final, ok?   =");
		
			System.out.println("Para escolher uma forma de pagamento, por favor:");
			System.out.println("Selecione |1| para CARTÃO:");
			System.out.println("Selecione |2| para BOLETO:");
			System.out.println("Selecione |3| para PIX:");
			formaPagamento = ler.nextInt();
			System.out.println();
			
			// PAGAMENTO CARTÃO
			
			if (formaPagamento == cartao) {
				
				System.out.println("Vamos te encaminhar para as informações sobre o cartão!");
				System.out.println();
				System.out.println("Insira os primeiros 4 números do cartão:");
				numeroCartao1 = ler.nextInt();
				System.out.println("Insira os próximos 4 números do cartão:");
				numeroCartao2 = ler.nextInt();
				System.out.println("Insira os próximos 4 números do cartão:");
				numeroCartao3 = ler.nextInt();
				System.out.println("Insira os 4 últimos números do cartão:");
				numeroCartao4 = ler.nextInt();
				System.out.println("Insira a data de validade (mês/ano):");
				dataValidade = ler.next();
				System.out.println("Insira o código de segurança:");
				codigoSeguranca = ler.nextInt();
				System.out.println();
				System.out.println("Confirmando...");
				System.out.println();
				System.out.println("O número do seu cartão é:");
				System.out.println(numeroCartao1 + " - " + numeroCartao2 + " - " + numeroCartao3 + " - " + numeroCartao4);
				System.out.println("Data de validade: " + dataValidade);
				System.out.println("Código de segurança: " + codigoSeguranca);
				System.out.println();
				System.out.println("Aguarde a confirmação do pagamento...");
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("Pagamento processado e aprovado!");
			}
			
			// PAGAMENTO BOLETO

			if (formaPagamento == boleto) {

				System.out.println("Devido às novas regulamentações, agora é necessário solicitar o CPF ao gerar o boleto/QR Code.");
				System.out.println("Isso tornará o ambiente de compra mais seguro!");
				System.out.println();
				System.out.println("Digite o seu CPF:");
				cpf = ler.next();
				System.out.println("Digite seu primeiro nome:");
				nome = ler.next();
				System.out.println("Digite seu sobrenome:");
				sobrenome = ler.next();
				System.out.println();
				System.out.println("Confirmando...");
				System.out.println();
				System.out.println("CPF: " + cpf + "\nNome: " + nome + " " + sobrenome);
				System.out.println();
				System.out.println("Digite o seu email para recebimento do boleto:");
				email = ler.next();
				System.out.println();
				System.out.println("Sua compra foi efetuada com sucesso!");
				System.out.println("Valor: " /*, <TOTAL>*/);
				System.out.println("O boleto será enviado ao email: " + email);
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("Boleto gerado com sucesso!");
				System.out.println("Enviamos para o seu email (Confira também a sua caixa de Spam!)");
				System.out.println("O prazo de vencimento do pagamento é de 2 dias úteis");
				
			}
			
			// PAGAMENTO PIX
			
			if (formaPagamento == pix) {

				System.out.println("Devido às novas regulamentações, agora é necessário solicitar o CPF ao gerar o boleto/QR Code.");
				System.out.println("Isso tornará o ambiente de compra mais seguro!");
				System.out.println();
				System.out.println("Digite o seu CPF:");
				cpf = ler.next();
				System.out.println("Digite seu primeiro nome:");
				nome = ler.next();
				System.out.println("Digite seu sobrenome:");
				sobrenome = ler.next();
				System.out.println("Digite o seu número de telefone para recebimento do código PIX:");
				whatsapp = ler.next();
				System.out.println();
				System.out.println("Confirmando...");
				System.out.println();
				System.out.println("CPF: " + cpf + "\nNome: " + nome + " " + sobrenome + "\nTelefone: " + whatsapp);
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("...");
			
				System.out.println();
				System.out.println("QR Code enviado via WhatsApp!");
				System.out.println("O prazo de vencimento do pagamento é de 2 dias úteis");

			}
			
		
			System.out.println("Obrigado por comprar conosco!");
			
			// ENTREGA
	        
	        System.out.println();
	        System.out.println("Muito bem! Agora vamos para a parte de entrega, ok?");
	        System.out.println();
	        System.out.println("Digite o seu CEP:");
	        cep = ler.next();
	        System.out.println("Digite o seu endereço:");
	        endereço = ler.nextLine();
	        System.out.println();
			System.out.println("Confirmando...");
			System.out.println();
	        System.out.println("O seu pedido será enviado para o CEP: " + cep);        
	        System.out.println("Endereço: " + endereço);
	        System.out.println();
	        this.Concluido();
	        
		}

		@Override
		void Concluido() {
			System.out.println("Parabéns! Frete gratis para a primeira compra :");
	        System.out.println("O pedido será enviado para o seu endereço em até 5 dias úteis");
	        System.out.println("Volte sempre!");
			
		}
		
	}

	



