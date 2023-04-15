
public class CalculadoraMedia {

	public static Resultado calcular(Aluno aluno) {
		Resultado resultado = new Resultado();

		double pesoUm = aluno.getNotaUm() * 1;
		double pesoDois = aluno.getNotaDois() * 2;
		double pesoTres = aluno.getNotaTres() * 3;

		double media = (pesoUm + pesoDois + pesoTres) / 6;

		resultado.setMedia(media);

		if (media > 30) {
			resultado.setSituacao("Reprovado por Falta");
		} else if (media >= 8) {
			resultado.setSituacao("Aprovado com Sucesso");
		} else if (media >= 6 && media < 8) {
			resultado.setSituacao("Aprovado");
		} else if (media >= 3 && media < 6) {
			resultado.setSituacao("Recuperação");
		} else if (media < 3) {
			resultado.setSituacao("Reprovado");
		} else if (media == 0) {
			resultado.setSituacao("Desistente");
		} else {
			resultado.setSituacao("Desistente");
		}
		return resultado;
	}
}
