package estruturaPosCondicionada;

import java.util.Scanner;

public class DezNumeros {

	public static void main(String[] args) {
		int num = 0;
		int i=0;
		int som = 0, vl=0;


		Scanner ler = new Scanner (System.in);

		while (i<=9){
			System.out.println("insira um valor");
			num= ler.nextInt();
			i++;

			vl=num;
			som +=vl;
		}		
		System.out.println(" A soma total é "  +som);		

		ler.close();
	}

}
