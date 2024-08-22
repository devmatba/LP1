
public class Ex9 {

	public static void main(String[] args) {
		
		int numMacas = 15;  
        double custoTotal;
        
        if (numMacas >= 12) {
            custoTotal = numMacas * 1.00;  
        } else {
            custoTotal = numMacas * 1.30;  
        }
  
        System.out.printf("O custo total da compra é: R$ %.2f", custoTotal);

	}

}
