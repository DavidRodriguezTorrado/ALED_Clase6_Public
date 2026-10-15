package ordenacion;
import java.util.Comparator;

public class ComparadorPorNota implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		return Double.compare(o1.nota, o2.nota);
	}

}
