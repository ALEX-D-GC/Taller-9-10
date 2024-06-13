package problema5;


import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorEntradas {
    private Map<Integer, Entrada> entradasVendidas = new HashMap<>();
    private Map<String, Zona> zonasDisponibles = new HashMap<>();

    public GestorEntradas() {
        zonasDisponibles.put(normalize("Principal"), new ZonaPrincipal());
        zonasDisponibles.put(normalize("PalcoB"), new ZonaPalcoB());
        zonasDisponibles.put(normalize("Central"), new ZonaCentral());
        zonasDisponibles.put(normalize("Lateral"), new ZonaLateral());
    }

    private String normalize(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                         .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                         .toLowerCase();
    }

    public void venderEntrada(String nombreComprador, String nombreZona, String tipoEntrada) {
        nombreZona = normalize(nombreZona.trim());
        tipoEntrada = tipoEntrada.trim().toLowerCase();

        Zona zona = zonasDisponibles.get(nombreZona);
        if (zona == null) {
            System.out.println("Error: Zona no encontrada.");
            return;
        }

        if (zona.getNumLocalidades() > 0) {
            Entrada entrada = new Entrada(nombreComprador, zona, tipoEntrada);
            entradasVendidas.put(entrada.getId(), entrada);
            zona.reducirLocalidad();
            System.out.println("Entrada vendida con éxito:\n" + entrada);
        } else {
            System.out.println("Error: No hay localidades disponibles en la zona " + nombreZona + ".");
        }
    }

    public void consultarEntrada(int id) {
        Entrada entrada = entradasVendidas.get(id);
        if (entrada == null) {
            System.out.println("Error: Entrada no encontrada.");
        } else {
            System.out.println("Detalles de la entrada:\n" + entrada);
        }
    }

    public static void main(String[] args) {
        GestorEntradas gestor = new GestorEntradas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Vender entrada");
            System.out.println("2. Consultar entrada");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del comprador: ");
                String nombreComprador = scanner.nextLine();

                System.out.print("Ingrese el nombre de la zona (Principal, PalcoB, Central, Lateral): ");
                String nombreZona = scanner.nextLine();

                System.out.print("Ingrese el tipo de entrada (normal, abonado, reducido): ");
                String tipoEntrada = scanner.nextLine();

                gestor.venderEntrada(nombreComprador, nombreZona, tipoEntrada);
            } else if (opcion == 2) {
                System.out.print("Ingrese el identificador de la entrada: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                gestor.consultarEntrada(id);
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }
}