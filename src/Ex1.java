
public class Ex1 {

	public static void main(String[] args) {
	
		int anos = 24;
		int meses = 8;
		int dias = 21;

		int diasDoAno = 365;
		int diasDoMes = 30;

		int idadeEmDias = (anos * diasDoAno) + (meses * diasDoMes) + dias;

		System.out.println("A idade total em dias é: " + idadeEmDias);

	}

}
