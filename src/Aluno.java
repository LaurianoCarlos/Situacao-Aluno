
public class Aluno {

	public String nome;
	public double notaUm;
	public double notaDois;
	public double notaTres;
	public int qtdfaltas;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaUm() {
		return this.notaUm;
	}

	public void setNotaUm(double nota) {
		this.notaUm = nota;
	}

	public double getNotaDois() {
		return this.notaDois;
	}

	public void setNotaDois(double nota) {
		this.notaDois = nota;
	}

	public double getNotaTres() {
		return this.notaTres;
	}

	public void setNotaTres(double nota) {
		this.notaTres = nota;
	}

	public int getQtdFaltas() {
		return this.qtdfaltas;
	}

	public void setQtdFaltas(int faltas) {
		this.qtdfaltas = faltas;
	}
}
