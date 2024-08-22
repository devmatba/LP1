
public class Ex3 {

	public static void main(String[] args) {
		
		double salarioAtual = 2500.00;  
        double percentualReajuste = 10.0;  
  
        double novoSalario = salarioAtual + (salarioAtual * (percentualReajuste / 100));

        System.out.printf("O novo salário é: R$ %.2f", novoSalario);

	}

}
