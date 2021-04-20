package pacoteprova2;

import java.util.Scanner;

public class Medalhas {

	public static void main(String[] args) {
		/*A natação foi um dos esportes mais emocionantes das Olimpíadas do Rio. Houve até uma prova na qual três atletas chegaram
		 empatados, cada um recebendo uma medalha de prata! Normalmente, porém, os três primeiros colocados terminam a prova em tempos 
		 distintos e, portanto, temos a distribuição mais comum de medalhas: o nadador que terminou no menor tempo recebe medalha de 
		 ouro; o nadador que terminou com o segundo menor tempo recebe medalha de prata; e o que terminou com o terceiro menor tempo 
		 recebe medalha de bronze. Neste problema, dados os três tempos distintos de finalização da prova, dos três nadadores que 
		 ganharam medalhas, seu programa deve dizer quem ganhou medalha de ouro, quem ganhou prata e quem ganhou bronze.*/
		
		//declarando vetor que vai ler os tempos dos nadadores
		 int nadador[] = new int[3];
		 int podium[] = new int [3];
		 
		 int i;
		 //leitura dos tempos(t1,t2,t3)
		 for (i=0 ; i<3 ; i++) {
		 	System.out.println("Digite o tempo do nadador "+i+"!");
		 	Scanner in = new Scanner(System.in);
		 	
		 	//cada posição do vetor é um tempo de cada nadador
		 	nadador[i] = in.nextInt();
		 }

		 /*identificando o 1°,2° e 3° lugar*/
		 
		 //testando o nadador 1 como primeiro menor tempo
		 if(nadador[0]<nadador[1] && nadador[0]<nadador[2]){
		 		podium[0]=1;
		 		
		 		//o segundo menor tempo
		 		if (nadador[1]<nadador[2]) {
		 			podium[1]=2;
		 			podium[2]=3;
		 		}else{
		 			//o terceiro menor tempo
		 			podium[2]=2;
		 			podium[1]=3;
		 		}

		 }else{
			//testando o nadador 2 como primeiro menor tempo
		 	if (nadador[1]<nadador[0] && nadador[1]<nadador[2]) {
		 		podium[1]=1;
		 		
		 		//o segundo menor tempo
		 		if (nadador[0]<nadador[2]) {
		 			podium[0]=2;
		 			podium[2]=3;
		 		}else{
		 			//o terceiro menor tempo
		 			podium[2]=2;
		 			podium[0]=3;
		 		}

		 	}else{
		 		//testando o nadador 3 como primeiro menor tempo
		 		podium[2]=1;
		 		//o segundo menor tempo
		 		if (nadador[1]<nadador[0]) {
		 			podium[1]=2;
		 			podium[0]=3;
		 		}else{
		 			//o terceiro menor tempo
		 			podium[0]=2;
		 			podium[1]=3;
		 		}
		 	}
		 }

		 //exibindo
		 for (i=0 ; i<3 ; i++){
		 	System.out.println(podium[i]);
		 }
	}

}
