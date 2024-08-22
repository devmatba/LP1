
public class Ex15 {

	public static void main(String[] args) {
		
		int horasTrabalhadas = 180;  
        double salarioPorHora = 25.00;  
        
        int horasNormaisPorSemana = 40;  
        int semanasPorMes = 4;  
        int horasNormaisPorMes = horasNormaisPorSemana * semanasPorMes;  
        double salarioTotal;
        if (horasTrabalhadas > horasNormaisPorMes) {
            
            int horasExtras = horasTrabalhadas - horasNormaisPorMes;
            double salarioHorasNormais = horasNormaisPorMes * salarioPorHora;
            double salarioHorasExtras = horasExtras * salarioPorHora * 1.5;  // 50% de acréscimo
            salarioTotal = salarioHorasNormais + salarioHorasExtras;
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;  // Sem horas extras
        }

    
        System.out.printf("O salário total do funcionário é: R$ %.2f", salarioTotal);

	}

}
