
public class Ex2 {

	public static void main(String[] args) {
		      
		int totalEleitores = 1000;  
        int votosBrancos = 150;     
        int votosNulos = 50;        
        int votosValidos = 800;     
           
        double percentualBrancos = (votosBrancos / (double)totalEleitores) * 100;
        double percentualNulos = (votosNulos / (double)totalEleitores) * 100;
        double percentualValidos = (votosValidos / (double)totalEleitores) * 100;
                
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%", percentualValidos);
						
	}

}
