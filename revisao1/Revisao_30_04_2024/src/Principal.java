import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/* Entrada de dados
		 * Biblioteca Scanner
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		// calculo do perimetro de um circulo
		 double perimetro;
		 //perimetro_circulo = 2 * PI * raio
		 
		 System.out.println("Digite o valor do raio" );
		double raio = entrada.nextDouble();
		
		//calculo do perimetro
		perimetro = 2* 3.14 * raio;
		//exibindo o valor do perimetro
		SSystem.out.println("O valor do perimetro eh : " + perimetro);
		
		
		
		
		
		
		
		
		
		
		
		
		//pedir para o usuario digitar seu nome e idade
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		int idade = entrada2.nextInt();
		
		Scanner entrada3 =  new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome_usario = entrada3.nextLine();
		
		//exibir informacoes do usuario
		System.out.println("A idade do usuario eh: " +idade );
		System.out.println("O nome do usuario eh: " + nome_usario);
	}

}
