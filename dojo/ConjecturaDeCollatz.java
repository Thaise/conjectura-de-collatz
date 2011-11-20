package dojo;

import java.util.Scanner;
import java.util.Vector;

public class ConjecturaDeCollatz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		while(true){
			System.out.println("::Conjectura de Collatz::");
			System.out.print("Digite um número: ");
			int numero = entrada.nextInt();	
			if(numero < 0){
				System.out.println("O número deve ser positivo!\n");
				continue;
			}
			Object[] sequencia = calculaSequenciaDaConjecturaDeCollatz(numero);
			System.out.print("Sequencia numérica: ");
			for(int i = 0; i < sequencia.length; i++){
				System.out.print(sequencia[i]+" ");
			}
			System.out.println("\n");
		}
	}

	public static Object[] calculaSequenciaDaConjecturaDeCollatz(int numero) {
		Vector sequencia = new Vector();	
		sequencia.add(numero);//armazena o número passado pelo usuário no vector
		
		while(numero > 1){//encontra sua sequencia
			if(numero % 2 != 0){
				numero = 3 * numero + 1;			
				sequencia.add(numero);
			}else{
				numero = numero/2;	
				sequencia.add(numero);
			}
			
			if(numero == 1){
				break;
			}
		}
		return sequencia.toArray();//retorna o primeiro número e a sequencia
	}

}
