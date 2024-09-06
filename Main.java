import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Object>> listaPersonas = new ArrayList<>();
        while (true) {
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar lista de personas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    ArrayList<Object> persona = new ArrayList<>();
                    persona.add(nombre);
                    
                    persona.add(apellido);
                    persona.add(edad);
                    persona.add(salario);
                    listaPersonas.add(persona);
                    System.out.println("Persona agregada con éxito.");
                    break;
                case 2:
                    // Mostrar la lista de personas
                    System.out.println("Lista de Personas:");
                    for (ArrayList<Object> p : listaPersonas) {
                    System.out.println("Nombre: " + p.get(0) + ", Apellido: " + p.get(1) + ", Edad: " +
                    p.get(2) + ", Salario: " + p.get(3));
                    }
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    default:
                    System.out.println("Opción no válida. Introduce un número válido.");
                    break;
            }
        }
    }
}
