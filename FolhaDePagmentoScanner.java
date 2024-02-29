package Aula5;

import java.util.Scanner;

public class FolhaDePagmentoScanner {
	
	public static void main(String[] args) {
		
		FolhaDePagamento fp = new FolhaDePagamento();
		
		fp.salarioBruto = 0;
		fp.numeroDeDependentes = 0;
		fp.descontoINSS = 0;
		fp.valorPlanoDeSaude = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			
			System.out.println("Digite seu salário bruto: ");
			fp.salarioBruto = scan.nextDouble();
			
			System.out.println("Digite o número de dependentes: ");
			fp.numeroDeDependentes = scan.nextInt();
			
			System.out.println("Digite o valor do desconto do INSS: ");
			fp.descontoINSS = scan.nextDouble();
			
			System.out.println("Digite o valor do seu plano de saúde: ");
			fp.valorPlanoDeSaude = scan.nextDouble();
			
			System.out.println("\nO seu salário líquido é: R$" + fp.calcularSalarioLiquido());
			
		} catch (Exception e) {
			System.out.println("Formato incorreto tente novamente!");
		}
		
	}

}
