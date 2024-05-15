package estruturaPosCondicionada;

import java.util.Scanner;

public class Idade20 {

	public static void main(String[] args) {
		int idade =0;
		int i=0;
		int som = 0;
		 Scanner ler = new Scanner (System.in);
		 while (i<5){
		System.out.println("insira uma idade");
	     idade= ler.nextInt();
	     i++;
		 
		
		 
        if (idade >=18 ) {
        som++;}
		 }
       System.out.println("Pessoas maiores de idade:" + som++);
        
	
	ler.close();
		 
	}
}

