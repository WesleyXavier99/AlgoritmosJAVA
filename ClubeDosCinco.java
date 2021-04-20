package pacoteprova2;

import java.util.Scanner;

public class ClubeDosCinco {

	public static void main(String[] args) {
		/*No Clube dos Cinco s�o oferecidos tr�s esportes aos associados: tiro com arco, badminton e canoagem. 
		Cada associado pode participar de no m�ximo dois esportes, mas a administra��o do clube suspeita que 
		algumas pessoas estejam ultrapassando esse limite. A fim de descobrir a verdade, perguntaram aos treinadores 
		quantas pessoas estavam frequentando suas aulas, resultando nos seguintes dados:

		O n�mero A de pessoas que praticam tiro com arco;
		O n�mero B de pessoas que praticam badminton;
		O n�mero C de pessoas que praticam canoagem.
		Al�m disso, perguntaram aos membros quais esportes eles praticam. 
		Obviamente, os associados que praticam tr�s esportes mentiram, mas 
		considere que outros falaram a verdade. Os dados dos associados foram 
		resumidos nas seguintes informa��es:
		O n�mero D de pessoas que praticam tiro com arco e badminton;
		O n�mero E de pessoas que praticam tiro com arco e canoagem;
		O n�mero F de pessoas que praticam badminton e canoagem;
		O n�mero G de pessoas que n�o praticam nenhum esporte.
		Voc� ficou encarregado da a tarefa de descobrir se a suspeita � verdadeira. 
		Dados o n�mero N de associados do clube e os n�meros A, B, C, D, E, F e G descritos acima, 
		descubra se existe alguma pessoa que faz tr�s esportes.*/
		
		//Declara��o das vari�veis
		int a,b,c,d,e,f,g,n,somaA,somaB,somaC,somaTotal=0;
		
		//Leitura do N
		System.out.println("Digite o numero de Associados:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		//Leitura de a � g
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
