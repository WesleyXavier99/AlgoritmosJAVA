package pacoteprova2;

import java.util.Scanner;

public class ClubeDosCinco {

	public static void main(String[] args) {
		/*No Clube dos Cinco são oferecidos três esportes aos associados: tiro com arco, badminton e canoagem. 
		Cada associado pode participar de no máximo dois esportes, mas a administração do clube suspeita que 
		algumas pessoas estejam ultrapassando esse limite. A fim de descobrir a verdade, perguntaram aos treinadores 
		quantas pessoas estavam frequentando suas aulas, resultando nos seguintes dados:

		O número A de pessoas que praticam tiro com arco;
		O número B de pessoas que praticam badminton;
		O número C de pessoas que praticam canoagem.
		Além disso, perguntaram aos membros quais esportes eles praticam. 
		Obviamente, os associados que praticam três esportes mentiram, mas 
		considere que outros falaram a verdade. Os dados dos associados foram 
		resumidos nas seguintes informações:
		O número D de pessoas que praticam tiro com arco e badminton;
		O número E de pessoas que praticam tiro com arco e canoagem;
		O número F de pessoas que praticam badminton e canoagem;
		O número G de pessoas que não praticam nenhum esporte.
		Você ficou encarregado da a tarefa de descobrir se a suspeita é verdadeira. 
		Dados o número N de associados do clube e os números A, B, C, D, E, F e G descritos acima, 
		descubra se existe alguma pessoa que faz três esportes.*/
		
		//Declaração das variáveis
		int a,b,c,d,e,f,g,n,somaA,somaB,somaC,somaTotal=0;
		
		//Leitura do N
		System.out.println("Digite o numero de Associados:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		//Leitura de a à g
		System.out.println("Digite a:");
		a = in.nextInt();
		System.out.println("Digite b:");
		b = in.nextInt();
		System.out.println("Digite c:");
		c = in.nextInt();
		System.out.println("Digite d:");
		d = in.nextInt();
		System.out.println("Digite e:");
		e = in.nextInt();
		System.out.println("Digite f:");
		f = in.nextInt();
		System.out.println("Digite g:");
		g = in.nextInt();
		
		n = n-g;

		somaA = (a - d) - e;
		somaB = (b - d) - f;
		somaC = (c - e) - f;

		somaTotal = somaA + somaB + somaC + d + e + f;

		if(somaTotal==n){
			System.out.println("N");
		}else{
			System.out.println("S");
		}
		in.close();
	}

}
