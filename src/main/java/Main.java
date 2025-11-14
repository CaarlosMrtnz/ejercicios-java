import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;

import java.util.Scanner;

/**
 * Clase principal del proyecto que contiene el método main.
 * Se encarga de crear una instancia de {@link Ejercicio3} y ejecutar
 * uno de los métodos disponibles para realizar diferentes prácticas.
 */
public class Main {

    /**
     * Método de entrada de la aplicación. Permite ejecutar
     * distintos ejercicios instanciando la clase {@link Ejercicio3}.
     *
     * Inicializa el Scanner, y mantiene un bucle activo para mostrar
     * el menú y recoger la entrada del usuario
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        // Inicializa la dependencia
        Ejercicio1 ej1 = new Ejercicio1();
        Ejercicio2 ej2 = new Ejercicio2();
        Ejercicio3 ej3 = new Ejercicio3();

        // Bucle principal del menú
        while(!exit){
            System.out.println("\nMenú ejercicios: ");
            System.out.println("1. ejercicios.Ejercicio 1");
            System.out.println("2. ejercicios.Ejercicio 2");
            System.out.println("3. ejercicios.Ejercicio 3");
            System.out.println("5. Exit");
            System.out.println("Selecciona una opción: ");
            String opcion = sc.nextLine();

            // Delega la acción a la clase 'ejercicios.Ejercicio'
            switch (opcion){

                case "1" -> ej1.ejercicio1();
                case "2" -> ej2.ejercicio2();
                case "3" -> ej3.ejercicio3();
                case "5" -> exit = true;
                default -> System.out.println("Elige una opción entre 1 y 5.");

            }
        }

        System.out.println("Ejercicios finalizados.");

    }
}
