package estruturaPosCondicionada;

import java.util.Scanner;

public class NomeUser {

	public static void main(String[] args) {
		
		int i=1;
		String nome;
		Scanner ler = new Scanner (System.in); 
	    System.out.println("insira um nome");
	    nome= ler.nextLine();
	    
	     while(i<=20){
			 System.out.print( i++  );
			 System.out.println(   nome);
			    }
	    
	    

	ler.close();
	}
}


