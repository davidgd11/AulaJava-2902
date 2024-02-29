package br.com.fiap;

import javax.swing.JOptionPane;

public class FolhaDePagamentoJOP {

	public static void main(String[] args) {
		
		FolhaDePagamento fp = new FolhaDePagamento();
		
		fp.salarioBruto = 0;
		fp.numeroDeDependentes = 0;
		fp.descontoINSS = 0;
		fp.valorPlanoDeSaude = 0;
		String aux;
		
		try {
			fp.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário bruto: "));
			
			fp.numeroDeDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));
			
			fp.descontoINSS = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto do INSS: "));
			
			fp.valorPlanoDeSaude = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do plano de saúde: "));
			
			JOptionPane.showMessageDialog(null, "O seu salário líquido é: R$" + fp.calcularSalarioLiquido());
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto, tente novamente!");
		}

	}

}
