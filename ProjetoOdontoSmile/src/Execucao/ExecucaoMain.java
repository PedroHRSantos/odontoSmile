package Execucao;
import java.util.Scanner;

import java.util.ArrayList;
import entidades.Pessoas;
import entidades.Usuario;
import entidades.Funcionario;
import entidades.Paciente;

public class ExecucaoMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		ArrayList<Pessoas> pessoas = new ArrayList<>();
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		ArrayList<Paciente> pacientes = new ArrayList<>();
		
		//est�nciando as viri�veis
		Funcionario fun1 = new Funcionario("Bem-vindo a central de cadastramento do funcion�rio");
		Funcionario fun2 = new Funcionario(); //vari�vel funcion�rio 1
		Paciente pac1 = new Paciente("Bem-vindo a cental de assinemte do paciente");
		Paciente pac2 = new Paciente();
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
		Usuario usuario = new Usuario();
		System.out.println("====== Tela inicial de Login =====");
		System.out.println("1 para realizer o login \n2 para realizer o cadastro");
		System.out.print("====== ===================== ===== \n>>");
		
		
		String realizarLogin = entrada.next();		
		if (realizarLogin.equals("1")) {
			usuario.efetuandoLogin();
			
			usuario.verificadorLogin();
			
			
			
		}else if (realizarLogin.equals("2")) {
			usuario.cadastroSenha();
			
			
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		
	
			
		String pf = entrada.next(); //tecla de entrada para informar se ser� paciente ou funcionario de acordo com o menu
			
		
		while (!pf.equals("0")) {
				
			// FUNCION�RIO		
			if (pf.equals("1")) {
				if (true) { //primeiro cadastro de funcion�rio
					System.out.println(fun1.bemVindo);
					System.out.println("Nome Funcionario");
					String nada = entrada.nextLine(); // sever para nada
					fun1.setNome(entrada.nextLine());
					System.out.println("cpf Funcion�rio");
					fun1.setCpf(entrada.nextInt());										
					fun1.contato();
					fun1.endereco();
					fun1.profissao();
					funcionarios.add(fun1);
					
					System.out.println("Deseja finalizar? [sim/nao]");
					String continua = entrada.next();
						if (continua.equals("sim")|| continua.equals("s")) {
							break;
						}
						
				}
				if (true) { //primeiro cadastro de funcion�rio
					
					System.out.println("Nome Funcionario");
					String nada = entrada.nextLine(); // sever para nada
					fun2.setNome(entrada.nextLine());
					System.out.println("cpf Funcion�rio");
					fun2.setCpf(entrada.nextInt());
					fun2.contato();
					fun2.endereco(); //m�todo com todos os endere�os
					fun2.profissao();
					funcionarios.add(fun2);
					
					System.out.println("Deseja finalizar? [sim/nao]");
					String continua = entrada.next();
						if (continua.equals("sim")|| continua.equals("s")) {
							break;
						}
						
				}
				
			}
			// PACIENTE
			if (pf.equals("2")) { 
					if (true) {// primeiro cadastro do paciente
						
						System.out.println(pac1.bemVindo);
						System.out.println("Nome do paciente: ");
						String nada = entrada.nextLine();
						pac1.setNome(entrada.nextLine());
						System.out.println("CPF paciente: ");
						pac1.setCpf(entrada.nextInt());
						pac1.endereco();//endere�o em geral
						pac1.contato(); // contato email e telefone
						pac1.planoSaude();//tipos de servi�o que o cliente ira escolher com seus valors
						pacientes.add(pac1); // processamento para ser adicionado no arraylist
												
						System.out.println("Deseja finalizar? [sim/nao]");
						String continua = entrada.next();
							if (continua.equals("sim")|| continua.equals("s")) {
								break;
							}
					}
					if (true) {//segundo cadastro de pacientes
						System.out.println("Nome do paciente");
						String nada = entrada.nextLine(); // sever para nada
						pac2.setNome(entrada.nextLine());
						
						System.out.println("CPF paciente");
						pac2.setCpf(entrada.nextInt());
						
						pac2.endereco();
						pac2.contato();
						pac2.planoSaude();
						
						pacientes.add(pac2);
						
						System.out.println("Deseja finalizar? [sim/nao] ");
						String continua = entrada.next();
							if (continua.equals("sim")|| continua.equals("s")) {
								break;
							}
					}
			}else {
				System.out.print("Finalizando o programa... ");
				break;
			}
			
				
				
		}
		
		for (Funcionario fu: funcionarios) {
			System.out.println("----------------------------------------");
			System.out.println("Nome Funcionario: " + fu.getNome());
			System.out.println("CPF Funcionario: " + fu.getCpf());
			fu.retornoEndereco();
			fu.profissaoRetorno();
			System.out.println("----------------------------------------");

		}
		for (Paciente pa: pacientes) {
			System.out.println("----------------------------------------");
			System.out.println("Nome: " + pa.getNome());
			System.out.println("CPF: " + pa.getCpf());
			pa.retornoEndereco();
			pa.contatoRetorno();
			pa.planoSaudeRetorno();
			System.out.println("\n---------------------------------------");
			

		}
		
		
	}
	
}