package DiaAtivo;
import DiaAtivo.ExercicioUm;

public class ExercicioDois {
	public static void main(String[] args) {
		System.out.println(possoIrAoBanco("segunda", 9));
		}
			public static boolean possoIrAoBanco (String dia, int hora)
				{
					boolean diaAberto = !(dia == "sabado" || dia == "domingo");
					boolean horaFuncional = (hora >= 10 && hora <=16);
					boolean indoAoBanco = (diaAberto && horaFuncional && ExercicioUm.ehDiaSemana(dia));
					return indoAoBanco;
				}
	

}
