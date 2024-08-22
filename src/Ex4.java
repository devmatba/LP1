
public class Ex4 {

	public static void main(String[] args) {
		
		double custoFabrica = 50000.00;  
        double percentualDistribuidor = 28.0;  
        double percentualImpostos = 45.0;  

        double valorDistribuidor = custoFabrica * (percentualDistribuidor / 100);
        double valorImpostos = custoFabrica * (percentualImpostos / 100);

        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.printf("O custo final ao consumidor é: R$ %.2f", custoFinal);

	}

}
