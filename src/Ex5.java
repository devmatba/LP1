
public class Ex5 {

	public static void main(String[] args) {
		
		int carrosVendidos = 10;          
        double valorTotalVendas = 150000.00; 
        double salarioFixo = 2000.00;      
        double comissaoPorCarro = 300.00;  
       
        double comissaoFixa = carrosVendidos * comissaoPorCarro;        
        double comissaoPercentual = valorTotalVendas * 0.05;        
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

        System.out.printf("O salário final do vendedor é: R$ %.2f", salarioFinal);

	}

}
