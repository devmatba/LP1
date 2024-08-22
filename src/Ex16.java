
public class Ex16 {

	public static void main(String[] args) {
		
		double janeiro = 15000.00;  
        double fevereiro = 23000.00; 
        double marco = 17000.00; 

        double gastoTotal = janeiro + fevereiro + marco;

        double mediaMensal = gastoTotal / 3;

        System.out.printf("O gasto total no trimestre foi: R$ %.2f\n", gastoTotal);
        System.out.printf("A média mensal de gastos foi: R$ %.2f", mediaMensal);
		
	}

}
