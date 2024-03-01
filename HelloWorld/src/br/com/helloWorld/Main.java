package br.com.helloWorld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Declarando Variáveis
		
		String nome = "";
		Integer codigo = 7;
		boolean status = true;
		int codigoSetor =  3;
		int meses = 5;
		double salario = 0.0;
		
		//saída de dados
				
		System.out.println("Digite o seu Nome: ");
			nome = scan.next();
			System.out.println("Digite o codigo de aluno: ");
			codigo = scan.nextInt();
			System.out.println("Informe o status:");
			status = scan.nextBoolean();
			System.out.println("Informe o codigo do setor: ");
			codigoSetor = scan.nextInt();
			System.out.println("Digite o salãrio de usuário");
			salario = scan.nextDouble();
			
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: "+ nome);
		System.out.println("Status: " + status);
		
		// estrutura condicional if
		
		if(status) {
			System.out.println("Cadastro Ativo");
		} else {
			System.out.println("Cadastro Inativo!");
		}
		
		
		// estrutura condicional SWHICH ....CASE
		
		switch (codigoSetor) {
		case 1:
			System.out.println("Setor: tecnologia");
			break;
		case 2: 
			System.out.println("Setor: Compras");
			break;
		case 3: 
			System.out.println("Setor: Desenvolvimento");
			break;
		default:
			System.out.println("Setor não encontrado!");
		}
		
		
	// estrutura de repetição For
		
		System.out.println("******Extrato de Pagamento******");
		
		for(int cont=1; cont <= meses; cont++) {
			
			System.out.println("Mês [" + cont + "]: Salário - R$" + salario);
		}
		
	}

}
