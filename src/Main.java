import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Aluno aluno = new Aluno();
		System.out.println("Programa Situação Auno");

		System.out.println("Insira primeira nota do Aluno: ");
		aluno.setNotaUm(input.nextDouble());

		System.out.println("Insira segunda nota do Aluno: ");
		aluno.setNotaDois(input.nextDouble());

		System.out.println("Insira terceira nota do Aluno: ");
		aluno.setNotaTres(input.nextDouble());

		System.out.println("Insira o número de faltas do Aluno: ");
		aluno.setQtdFaltas(input.nextInt());

		Resultado resultado = new Resultado();
		resultado = CalculadoraMedia.calcular(aluno);

		System.out.println("A média do aluno é: " + resultado.getMedia());
		System.out.println("A situacao do aluno é: " + resultado.getSituacao());
		
		input.close();
	}
}
