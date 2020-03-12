package DiaAtivo;

public class ExercicioUm {
	public static void main(String[] args) {
		//tem que ter isso sempre no main
		// sempre começar com public static
		System.out.println(ehDiaSemana("segunda"));
	}
	public static boolean ehDiaSemana(String dia)
	{
		boolean odia =(dia == "segunda" || dia == "terca" || dia == "quarta" || dia == "quinta" || dia == "sexta" || dia == "sabado" || dia == "domingo");
			return odia;
		}
	
	
}
