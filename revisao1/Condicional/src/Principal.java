import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Condicionais
		//para passar na materia, a nota tinha que ser 5 ou mais
		
		double nota;
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno");
		nota = entrada.nextDouble();
		
		System.out.println("A nota do aluno eh " + nota);
		
		if(nota>4.9) { System.out.println("Passo de ano!!!, Parabens");
			
		};
		if(nota <5) { System.out.println("Recuperacao... Estude mais");
			
		}

	}

}