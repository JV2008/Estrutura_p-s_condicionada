package estruturaPosCondicionada;

public class SomaDe1a15 {
	
	public static void main(String[] args) {
	
	int num = 1;
	int som = 0,resul;
	

	while (num <=15) {
	System.out.println(num);
	
	resul = num++; 
	som += resul;
	}
	System.out.println ("Seu resultado é: "+som);
	}
	

}
