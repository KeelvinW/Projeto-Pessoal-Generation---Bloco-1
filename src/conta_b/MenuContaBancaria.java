package conta_b;

import java.awt.Color;
import java.util.Scanner;

import conta_b.model.Conta;
import conta_b.model.ContaCorrente;
import conta_b.model.ContaPoupanca;
import conta_b.util.Cores;

public class MenuContaBancaria {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		/* Criamos o objeto conta c1
		Conta c1 = new Conta(1, 123, 1, "Kelvin Wesley", 30000.0f);
		
		//Visualizamos os dados da conta c1
		c1.visualizar();
		
		// Atualizamos o saldo da conta c1
		c1.setSaldo(35000.0f);
		
		// Visualizanos apenas o saldo da conta c1
		System.out.println("\n\n" + c1.getSaldo());
		
		
		
		
		// Criamos o objeto conta c2
		Conta c2 = new Conta(2, 123, 1, "Dener Cardoso", 50000.0f);
		
		//Visualizamos os dados da conta c2
		c2.visualizar();
		
		//Efetuamos um saque na conta c2 e visualzamos o novo saldo
		if (c2.sacar(1000.0f));
			System.out.println("\n\n" + c2.getSaldo());
		
		
		
			
		//Efetuamos um deposito na conta c1
		c1.depositar(10000.0f);
		
		//visualizamos os dados da conta c1 após o depósito
		c1.visualizar();*/
		
		//Teste conta corrente
		ContaCorrente c3 = new ContaCorrente(3, 123, 1, "Vitoria", 30000.0f, 1000.0f);
		c3.visualizar();
		c3.sacar(32000);
		c3.visualizar();
		
		//Teste conta poupança
		ContaPoupanca c4 = new ContaPoupanca(4, 123, 2, "Jose", 90000.0f, 15);
		c4.visualizar();
		c4.sacar(1000.0f);
		c4.visualizar();
		c4.depositar(5000.0f);
		c4.visualizar();
		
		int opcao;
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW_BRIGHT + Cores.ANSI_BLACK_BACKGROUND +"##################################################");
			System.out.println("                                                  ");
			System.out.println("                Kelcred Bank                      ");
			System.out.println("                                                  ");
			System.out.println("##################################################");
			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLACK_BACKGROUND + "                                                  ");
			System.out.println("           1 - Criar Conta                        ");
			System.out.println("           2 - Listar todas as Contas             ");
			System.out.println("           3 - Buscar Conta por Numero            ");
			System.out.println("           4 - Atualizar Dados da Conta           ");
			System.out.println("           5 - Apagar Conta                       ");
			System.out.println("           6 - Saque                              ");
			System.out.println("           7 - Depositar                          ");
			System.out.println("           8 - Transferir valores entre Contas    ");
			System.out.println("           9 - Sair                               ");
			System.out.println("                                                  "); 
			System.out.println("##################################################"); 
			System.out.println("Entre com a opção desejada:                       "); 
			System.out.println("                                                  " + Cores.TEXT_RESET); 
			opcao = leia.nextInt();
			
			if (opcao == 9) {
					System.out.println("\nKelcred Bank - Guarda dinheiro, jovem!");
					leia.close();
					System.exit(0);
			}
			switch (opcao) {
			case 1 -> System.out.println("Criar Conta\n\n");
			case 2 -> System.out.println("Listar todas as Contas\n\n");
			case 3 -> System.out.println("Consultar dados da Conta - por número\n\n");
			case 4 -> System.out.println("Atualizar dados da Conta\n\n");
			case 5 -> System.out.println("Apagar a Conta\n\n");
			case 6 -> System.out.println("Saque\n\n");
			case 7 -> System.out.println("Depositar\n\n");
			case 8 -> System.out.println("Transferir valores entre Contas\n\n");
			default -> System.out.println("\nOpção Inválida!\n");
			
			
			}
			
		}
		
	}

}
