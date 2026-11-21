package negocio.service;

import negocio.domain.entity.Negocio;
import negocio.domain.entity.Usuario;
import negocio.domain.enums.Rol;

import java.time.Instant;
import java.util.Scanner;

public class CrearCuenta {

    public static void crearNegocio() {

        Scanner sc = new Scanner(System.in);
        boolean valido = true;

        String nombreNegocio = "";
        String alias = "";
        String clave = "";
        String clave2 = "";

        System.out.println("Para crear una cuenta, complete el formulario.");
        System.out.println("Estos datos no se podran cambiar luego.");

        do {
            System.out.print("Ingrese el nombre de su negocio: ");
            nombreNegocio = sc.nextLine().toLowerCase().trim();

            if (nombreNegocio.matches("^[\\p{L}\\p{N}_-]+(?: [\\p{L}\\p{N}_-]+)*$")) {

                System.out.println("Error: El nombre del negocio es invalido.");
                valido = false;

            } else if (nombreNegocio.length() > 30) {

                System.out.println("Error: El nombre del negocio es muy largo.");
                valido = false;

            }

        } while (!valido);

        do {

            System.out.print("Ingrese un alias para su cuenta: ");
            alias = sc.nextLine().toLowerCase().trim();

            if (alias.matches("^[a-zA-Z0-9_-]+$")) {

                System.out.println("Error: El alias es invalido.");
                valido = false;

            } else if (alias.length() > 15) {

                System.out.println("Error: El alias es muy largo.");
                valido = false;

            }

        } while (!valido);

        do {

            System.out.print("Ingrese una contraseña de 8 digitos con al menos una Mayuscula, una Minuscula y un numero: ");

            clave = sc.nextLine().toLowerCase().trim();
            valido = valido(clave);

        } while (!valido);

        do {

            System.out.print("Ingrese nuevamente la contraseña: ");
            clave2 = sc.nextLine().toLowerCase().trim();
            valido = valido(clave2);

            if (!clave.equals(clave2)) {

                System.out.println("Error: Las claves son distintas.");
                valido = false;

            }

        } while (!valido);


        // CREAR Y GUARDAR

        Negocio negocio = new Negocio(
                1, nombreNegocio, false, false, Instant.now()
        );

        Usuario usuario = new Usuario(
                1, negocio.getId(), alias, clave, Rol.ADMIN, true, 0, Instant.now()
        );


        // Guardar





    }


    private static boolean valido(String clave) {

        if (clave.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)$")) {

            System.out.println("Error: El clave es invalido.");
            return false;

        } else if (clave.length() != 8) {

            System.out.println("Error: El clave es menor a 8 digitos.");
            return false;

        }

        return true;

    }

}
