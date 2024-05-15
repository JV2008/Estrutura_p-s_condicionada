package estruturaPosCondicionada;

import java.util.Scanner;

public class NomeNumero {

	public static void main(String[] args) {
		
        int num;
        int i=1;
        String nome;
        
		Scanner ler = new Scanner (System.in);
		System.out.println("digite seu nome");
		nome= ler.nextLine();
		System.out.println("digite um número");
		num= ler.nextInt();
		
		

		while(i<=num){
			 System.out.print(i++);
			 System.out.println(nome);
		}
	
	ler.close();
  }
}
