
/*
 * TODO:
 * solicitar dois numeros para o usuário
 * utilizar for para imprimir os 18 números entre os fornecidos pelo usario
 * criar uma exceção customizada para se o numero1 for um numero maior que o numero2
 */

import java.util.InputMismatchException;
import java.util.Scanner;
//importa o scanner do java
 public class contador {
	public static void main(String[] args) {
		
        //metodo que solicita os dois parametros ao usuário
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			//usa o terminal para pegar o parametro1
			System.out.println("Digite o segundo parâmetro:");
			int parametroDois = terminal.nextInt();
			
			//bloco da exceção
			try{
				contar(parametroUm,parametroDois);	
			 if (parametroUm>parametroDois){
			   throw new parametrosInvalidosException();
			   //lançador da exceção
			}
			System.out.println("Erro numerico");

		}
		catch(parametrosInvalidosException exception){
			//trata a exceção
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");	
		}
		  
			
		}
		
		//metodo que faz a contagem do intervalo entre os parametros um e dois
		static void contar(int parametroUm,int parametroDois ) throws parametrosInvalidosException {
			//lança a exceção de parametro vazio 
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
	       for(contagem =1; contagem<=18;contagem++){
               System.out.println("Numero" + contagem);
		   }

		   }
	
		}
	


 
	