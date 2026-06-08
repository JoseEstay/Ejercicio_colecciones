import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productos = new ArrayList<>();

        System.out.println("--- Sistema de Registro de Productos ---");
        System.out.print("¿Cuántos productos deseas registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            String producto = scanner.nextLine();
            productos.add(producto);
        }
        System.out.println("\n--- Lista de Productos Registrados ---");
        for (String producto : productos) { // Recorrer la lista
            System.out.println("- " + producto);
        }
        System.out.println("\nResumen: Fueron ingresados un total de " + productos.size() + " productos.");

        scanner.close();
    }
}