import java.util.Scanner;

public class Conver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double conversion = 55.95;
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Elige una opcion:");
            System.out.println("1. Pesos a JeringaCoins");
            System.out.println("2. JeringaCoins a pesos");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa cantidad en pesos: ");
                    double pesos = scanner.nextDouble();
                    double jeringa = pesos / conversion;
                    System.out.println("Tienes " + jeringa + " JeringaCoins.");
                    break;

                case 2:
                    System.out.print("Ingresa cantidad en JeringaCoins: ");
                    double jeringaCoins = scanner.nextDouble();
                    double pesos2 = jeringaCoins * conversion;
                    System.out.println("Tienes " + pesos2 + " pesos.");
                    break;

                default:
                    System.out.println("Opcion Teleton.");
                    break;
            }

            System.out.print("Quieres hacer otra conversion? (si/no): ");
            scanner.nextLine(); 
            respuesta = scanner.nextLine();
        }

        System.out.println("Programa Finalizado, asi como tu relacion.");
    }
}