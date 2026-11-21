import java.util.Scanner;

import static negocio.service.CrearCuenta.crearNegocio;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Bienvenido a OrdenRapida.");
        System.out.println("Para empezar inicie sesion o cree una cuenta.");

        do {

            System.out.println("1. Crear cuenta.");
            System.out.println("2. Iniciar sesion.");
            System.out.println("0. Salir.");

            System.out.print("Ingrese su opcion: ");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    crearNegocio();
                    break;
                case 2:
                    break;
                case 0:
                    salir = true;
                    break;
            }

            if (opc < 0 || opc > 2) {
                System.out.println("Error: la opcion ingresada no es valida.");
            }

        } while (!salir);

        System.out.println("Salio del sistema. Adios.");

    }

}









