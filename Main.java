import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a CARDILIFE MONITOR");
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = scanner.nextLine();

        
        System.out.println("Ingrese la enfermedad principal del paciente:");
        String enfermedadPrincipal = scanner.nextLine();

        
        System.out.println("Ingrese otras enfermedades del paciente (separe con coma si hay varias, o escriba 'ninguna' si no hay más):");
        String otrasEnfermedades = scanner.nextLine();

        
        System.out.println("Ingrese la dirección de la casa del paciente:");
        String direccion = scanner.nextLine();

        
        System.out.println("Ingrese el contacto de emergencia del paciente:");
        String contactoEmergencia = scanner.nextLine();

        
        System.out.println("¿El paciente desea contactarse directamente con algún número de emergencia? (Sí/No)");
        String deseaContactoEmergencia = scanner.nextLine();

        
        System.out.println("\nInformación del paciente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Enfermedad principal: " + enfermedadPrincipal);
        System.out.println("Otras enfermedades: " + otrasEnfermedades);
        System.out.println("Dirección: " + direccion);
        System.out.println("Contacto de emergencia: " + contactoEmergencia);
        System.out.println("¿Desea contacto directo con número de emergencia? " + deseaContactoEmergencia);
    }
}
