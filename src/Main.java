
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int total = 0;
		float avarage;
		float limiter;
		
		
		double doubleTotal = 1;
		double doubleLimiter = 0;
		
		System.out.println("Digite a quantidade de n�meros para calcular: ");
		
		
		Scanner limitArray = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		int choiceLimit;
		int selectNumber;
		choiceLimit = limitArray.nextInt();/*Salvando o tamanho do vetor de acordo com oque o us�ario digitar*/
		limiter = choiceLimit;
		
		/*Cria��o do vetor*/
		int vetor[] = new int[choiceLimit]; 
		
		/*armazenando valores no vetor*/
		for(int i=0; i<= (choiceLimit - 1); i++) {/*Cria��o do vetor com menos 1 para come�ar de 0*/
			System.out.println("Digite um valor para a posi��o:" + (i + 1) + ": ");
			selectNumber = number.nextInt();
			vetor[i] = selectNumber;
			total = selectNumber + total;
			doubleTotal = selectNumber * doubleTotal;
		}
		
		avarage = (total / limiter);
		

		
		//mostrando o vetor
		for(int i=0; i<= (choiceLimit - 1); i++) {
			System.out.print(vetor[i] + " ||| ");
		}
		System.out.println(" ");//apenas para pular uma linha depois de mostrar o vetor
		System.out.println("Total: " + total);//checando o total
		System.out.println("M�dia Aritm�tica : " + avarage);
		
		/*calculo da m�dia geom�trica*/
		
		doubleLimiter = (1 / limiter);
		double geomed = Math.pow(doubleTotal, doubleLimiter);
		System.out.format("M�dia Geom�trica: %.2f", geomed);
		System.out.println(" ");
		
		
		System.out.println("Vetor de n�meros pares:");/*Mostra pares*/
		for(int i=0; i<= (choiceLimit - 1); i++) {
			if((vetor[i] % 2) == 0) {
				
				System.out.print(vetor[i] + " ||| ");
			}
		}
		System.out.println(" ");
		
		
		
		System.out.println("Vetor de n�meros impares:");/*Mostra impares*/
				for(int i=0; i<= (choiceLimit - 1); i++) {
					if((vetor[i] % 2) != 0) {
						
						System.out.print(vetor[i] + " ||| ");
					}
				}
		System.out.println(" ");
				
			
		
	}
}

