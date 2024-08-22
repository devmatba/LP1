
public class Ex17 {

	public static void main(String[] args) {
		
		double P1 = 7.5;
        double E1 = 6.0; 
        double E2 = 8.0;
        double API = 9.0;
        double X = 1.0;  
        double SUB = 7.0;
        
        //médai parcial
        double mediaParcial = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);

        //primeira parte da média
        double primeiraParte = mediaParcial * 0.5;

        //segunda parte
        double diferenca = mediaParcial - 5.9;
        double segundaParte = Math.max(diferenca, 0) / diferenca * (API * 0.5);

        //média final
        double mediaFinal = primeiraParte + segundaParte + X + (SUB * 0.2);

        System.out.printf("A média final de LP1 é: %.2f\n", mediaFinal);

	}

}
