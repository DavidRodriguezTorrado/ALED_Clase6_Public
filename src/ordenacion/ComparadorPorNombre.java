package ordenacion;
import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.nombre.compareTo(o2.nombre);
	}

}
