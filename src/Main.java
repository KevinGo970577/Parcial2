import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc1;
        System.out.println("        VOTACIONES PREMIER");
        System.out.println("            MENÚ");
        System.out.println("1. Avanzar una cantidad de pasos.");
        System.out.println("2. Retroceder una cantidad de pasos.");
        System.out.println("3. Ver la energia actual.");
        System.out.println("4. Dormir al robot.");
        System.out.println("5. Despertar al robot.");
        System.out.println("6. Recargar la bateria.");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
        opc1 = teclado.nextInt();
    }
}