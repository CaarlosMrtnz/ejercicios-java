package ejercicios;

import java.util.Scanner;

/**
 * Clase que alberga el primer ejercicio: el cálculo del coste en un bar escolar.
 * Incluye lectura de cantidades, precios, operaciones de coste total
 * y división entre alumnos. Los comentarios del ejercicio explican
 * el procedimiento detallado paso a paso.
 */
public class Ejercicio1 {

    // Scanner para capturar datos introducidos por el usuario.
    private final Scanner sc = new Scanner(System.in);

    /*
     * Hágase una aplicación que permita introducir el número de bebidas y bocadillos
     * comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
     * bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
     * €). También se podrá introducir el número de alumnos que realizaron la compra
     * (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
     * bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
     * redondeado a 2 decimales. (CosteBar)
     *
     * Para resolverlo dividiremos el problema:
     * 1. Introducir valores.
     * 2. Guardar en variables.
     * 3. Realizar cálculos.
     * 4. Mostrar datos.
     */

    public void ejercicio1() {

        // 1. Introducir valores.
        // 2. Guardar en variables.
        System.out.println("Indica el número de bocatas: ");
        int numBocatas = sc.nextInt();
        System.out.println("Indica el número de bebidas: ");
        int numBebidas = sc.nextInt();
        System.out.println("Indica el precio de bocata: ");
        double precioBocata = sc.nextDouble();
        System.out.println("Indica el precio de bebida: ");
        double precioBebida = sc.nextDouble();
        System.out.println("Personas: ");
        int numPersonas = sc.nextInt();

        // 3. Hacer cálculos.
        double precioBocatas = precioBocata * numBocatas;
        double precioBebidas = precioBebida * numBebidas;
        double costeTotal = precioBebidas + precioBocatas;
        double precioxPers = costeTotal / numPersonas;

        // 4. Mostrar datos.
        System.out.printf("El precio de los bocatas es %.2f%n", precioBocatas);
        System.out.printf("El precio de los bebidas es %.2f%n",precioBebidas);
        System.out.printf("El precio total es %.2f%n",costeTotal);
        System.out.printf("El precio x persona es %.2f%n",precioxPers);
    }
}
