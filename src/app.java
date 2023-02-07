import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaSalario, rendaServico, rendaCapital, gastosMedicos, gastosEducacao,
		salarioMensal, gastosDedutiveis, maximoDedutivel;
		double impostoSalario = 0;
		double impostoServico = 0;
		double impostoCapital = 0;
		double impostoBruto = 0;
		double impostoDevido = 0;
		double totalAbater = 0;
		
		System.out.print("Renda anual com salário: ");
		rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacao = sc.nextDouble();
		
		//Calculo de imposto sobre salário
		salarioMensal = rendaSalario / 12;
		
		if (salarioMensal > 3000 && salarioMensal <= 5000) {
			impostoSalario = rendaSalario * 0.1;
		} else {
			impostoSalario = rendaSalario * 0.2;
		}
		
		//Calculo de imposto sobre prestação de serviço
		if (rendaServico > 0) {
			impostoServico = rendaServico * 0.15;
		}
		
		//Calculo de imposto sobre ganho de capital
		if (rendaCapital > 0) {
			impostoCapital = rendaCapital * 0.2;
		}
		
		//Calculo total imposto
		impostoBruto = impostoSalario + impostoServico + impostoCapital;
		
		//Calculo deducao
		gastosDedutiveis = gastosMedicos + gastosEducacao;
		
		maximoDedutivel = impostoBruto * 0.3;
		
		if(gastosDedutiveis <= maximoDedutivel) {
			totalAbater = gastosDedutiveis;
		} else {
			totalAbater = maximoDedutivel;
		}
		
		//Calculo imposto devido
		impostoDevido = impostoBruto - totalAbater;
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
		System.out.println();
		
		System.out.println("DEDUÇÕES");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
		System.out.println();
		
		System.out.println("RESUMO");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", totalAbater);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
	}

}
