import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroDeUsuariosUnicos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> listaNomnbre = new HashSet<>();

        System.out.println("Cuantos usuarios a registrar?");
        int cantidad = input.nextInt();
        input.nextLine();
        System.out.println();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del usuario " + (i + 1) + ":");
            String nombreIngresado = input.nextLine();

            if (listaNomnbre.contains(nombreIngresado)) {
                System.out.println("Usuario repetido. El nombre ya está registrado.");
                i--;
            } else {
                listaNomnbre.add(nombreIngresado);
                System.out.println("Agregado correctamente.");
            }
        }

        System.out.println("\n--- Lista Final ---");
        for (String nombreFinal : listaNomnbre) {
            System.out.println(nombreFinal);
        }
    }
}