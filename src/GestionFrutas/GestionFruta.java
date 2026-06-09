package GestionFrutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFruta{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> frutas = new ArrayList<>();

        agregarFrutas(frutas, sc);

        System.out.println("Lista de frutas");
        mostrarFrutas(frutas);

        mostrarCantidad(frutas);

        System.out.println("Reemplazo");
        reemplazarFruta(frutas, sc);

        System.out.println(" Eliminación");
        eliminarFruta(frutas, sc);

        System.out.println("Resultado Final");
        mostrarFrutas(frutas);

        sc.close();
    }

    public static void agregarFrutas(List<String> frutas, Scanner sc) {
        System.out.println("Ingresa frutas a la lista (escribe 'fin' para detenerse):");
        while (true) {
            String fruta = sc.nextLine();
            if (fruta.equalsIgnoreCase("fin")) {
                break;
            }
            frutas.add(fruta);
        }
    }

    public static void mostrarFrutas(List<String> frutas) {
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }

    public static void mostrarCantidad(List<String> frutas) {
        System.out.println("Cantidad total de frutas: " + frutas.size());
    }

    public static void reemplazarFruta(List<String> frutas, Scanner sc) {
        System.out.print("¿Qué fruta deseas reemplazar?: ");
        String frutaAntigua = sc.nextLine();

        int indice = frutas.indexOf(frutaAntigua);

        if (indice != -1) {
            System.out.print("Ingresa la nueva fruta: ");
            String frutaNueva = sc.nextLine();
            frutas.set(indice, frutaNueva);
        } else {
            System.out.println("La fruta ingresada no está en la lista.");
        }
    }

    public static void eliminarFruta(List<String> frutas, Scanner sc) {
        System.out.print("¿Qué fruta deseas eliminar?: ");
        String frutaAEliminar = sc.nextLine();

        if (!frutas.remove(frutaAEliminar)) {
            System.out.println("La fruta ingresada no se encontró en la lista.");
        }
    }
}
