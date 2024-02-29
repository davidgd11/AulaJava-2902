package br.com.fiap;

public class FolhaDePagamento {
	
	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	public double calcularSalarioLiquido() {
		double inss, planoSaude;
		inss = (salarioBruto / descontoINSS);
		planoSaude = valorPlanoDeSaude * (numeroDeDependentes + 1);
		return salarioBruto - (inss + planoSaude);
	};

}
