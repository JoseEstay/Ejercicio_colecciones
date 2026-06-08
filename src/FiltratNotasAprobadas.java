import java.util.ArrayList;
import java.util.List;

public class FiltratNotasAprobadas {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(3.5);
        notas.add(4.0);
        notas.add(6.8);
        notas.add(2.1);
        notas.add(5.5);
        notas.add(7.0);

        System.out.println("--- Notas Aprobadas (>= 4.0) ---");

        notas.stream()
                .filter(nota -> nota >= 4.0)
                .forEach(System.out::println);

        long cantidadAprobadas = notas.stream()
                .filter(nota -> nota >= 4.0)
                .count();

        System.out.println("\nTotal de notas aprobadas: " + cantidadAprobadas);
    }
}
