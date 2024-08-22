
public class Ex14 {

	public static void main(String[] args) {
		
		int horaInicio = 22;  
        int horaFim = 2;     

        int duracao;
        
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio; //Jogo termina no mesmo dia
        } else {
            duracao = (24 - horaInicio) + horaFim;  // Jogo termina no dia seguinte
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");
	}

}
