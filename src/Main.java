import java.util.Scanner;

/** PAC DESARROLLO M03B 1S2324
 *  Sigue las especificaciones del enunciado de la pac de Desarrollo
 *  No se puede importar ninguna otra clase, dentro de esta clase.
 *  Obligatorio utilizar esta plantilla
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Creación del usuario y sus datos
        Usuario usuario = LeerUsuario(scanner);

        // Paso 2: Creación de la cuenta
        Cuenta cuenta = new Cuenta(usuario);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    // Acción 1: Introduce un nuevo gasto
                    addGastos(cuenta, scanner);
                    break;
                case 2:
                    // Acción 2: Introduce un nuevo ingreso
                    addIngresos(cuenta, scanner);
                    break;
                case 3:
                    // Acción 3: Mostrar gastos
                    imprimirGastos(cuenta);
                    break;
                case 4:
                    // Acción 4: Mostrar ingresos
                    imprimirIngresos(cuenta);
                    break;
                case 5:
                    // Acción 5: Mostrar saldo
                    mostrarSaldo(cuenta);
                    break;
                case 0:
                    // Acción 0: Salir
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número del menú.");
            }
        } while (opcion != 0);

        mostrarMensajeFinal();

        scanner.close();
    }

    /**
     * Muestra las opciones válidas del menú.
     */
    public static void mostrarMenu() {
        System.out.println("\nRealiza una nueva acción");
        System.out.println("1 Introduce un nuevo gasto");
        System.out.println("2 Introduce un nuevo ingreso");
        System.out.println("3 Mostrar gastos");
        System.out.println("4 Mostrar ingresos");
        System.out.println("5 Mostrar saldo");
        System.out.println("0 Salir");
    }

    /**
     * Lee los datos del usuario por teclado y los devuelve como un objeto Usuario.
     * @param scanner Scanner para la entrada de datos.
     * @return Usuario creado con los datos ingresados.
     */
    private static Usuario LeerUsuario(Scanner scanner) {
        Usuario usuario = new Usuario();
        System.out.println("Paso 1: Creación del usuario y sus datos");
        System.out.println("a. Nombre:");
        String nombre = scanner.nextLine();
        usuario.setNombre(nombre);

        System.out.println("b. Edad:");
        int edad = scanner.nextInt();
        usuario.setEdad(edad);

        scanner.nextLine(); // Limpiar el salto de línea

        boolean dniValido = false;
        String dni;
        do {
            System.out.println("c. DNI:");
            dni = scanner.nextLine();
            dniValido = usuario.setDNI(dni);
            if (!dniValido) {
                System.out.println("DNI no válido. Debe tener el formato correcto (8 números seguidos de un guion opcional y una letra minúscula).");
            }
        } while (!dniValido);

        return usuario;
    }

    /**
     * Lee los datos de un ingreso por teclado, los agrega a la lista de ingresos y muestra un mensaje.
     * @param cuenta La cuenta en la que se registra el ingreso.
     * @param scanner Scanner para la entrada de datos.
     */
    private static void addIngresos(Cuenta cuenta, Scanner scanner) {
        System.out.println("Introduce la descripción del ingreso:");
        String descripcionIngreso = scanner.nextLine();
        System.out.println("Introduce la cantidad del ingreso:");
        double cantidadIngreso = scanner.nextDouble();

        cuenta.addIngresos(descripcionIngreso, cantidadIngreso);
        System.out.println("Ingreso registrado correctamente.");
    }

    /**
     * Muestra por pantalla el listado de ingresos.
     * @param cuenta La cuenta de la que se obtienen los ingresos.
     */
    private static void imprimirIngresos(Cuenta cuenta) {
        System.out.println("\nPaso 4: Mostrar ingresos");
        for (Ingreso ingreso : cuenta.getIngresos()) {
            System.out.printf("Descripción: %s, Cantidad: %.2f€%n", ingreso.getDescription(), ingreso.getDinero());
        }
        if (cuenta.getIngresos().isEmpty()) {
            System.out.println("No hay ingresos registrados.");
        }
    }

    /**
     * Lee los datos de un gasto por teclado, los agrega a la lista de gastos y muestra un mensaje.
     * @param cuenta La cuenta en la que se registra el gasto.
     * @param scanner Scanner para la entrada de datos.
     */
    private static void addGastos(Cuenta cuenta, Scanner scanner) {
        System.out.println("Introduce la descripción del gasto:");
        String descripcionGasto = scanner.nextLine();
        System.out.println("Introduce la cantidad del gasto:");
        double cantidadGasto = scanner.nextDouble();

        try {
            cuenta.addGastos(descripcionGasto, cantidadGasto);
            System.out.println("Gasto registrado correctamente.");
        } catch (GastoException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Muestra por pantalla el listado de gastos.
     * @param cuenta La cuenta de la que se obtienen los gastos.
     */
    private static void imprimirGastos(Cuenta cuenta) {
        System.out.println("\nPaso 3: Mostrar gastos");
        for (Gasto gasto : cuenta.getGastos()) {
            System.out.printf("Descripción: %s, Cantidad: %.2f€%n", gasto.getDescription(), gasto.getDinero());
        }
        if (cuenta.getGastos().isEmpty()) {
            System.out.println("No hay gastos registrados.");
        }
    }

    /**
     * Muestra por pantalla el saldo actual de la cuenta.
     * @param cuenta La cuenta de la que se obtiene el saldo.
     */
    private static void mostrarSaldo(Cuenta cuenta) {
        System.out.println("\nPaso 5: Mostrar saldo");
        System.out.printf("Saldo actual: %.2f€%n", cuenta.getSaldo());
    }

    /**
     * Muestra el mensaje final de la aplicación.
     */
    private static void mostrarMensajeFinal() {
        System.out.println("\nPaso 6: Fin del programa.");
        System.out.println("Gracias por utilizar la aplicación de M03B en el curso 1s2324.");
    }
}

