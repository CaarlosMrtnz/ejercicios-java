package ejercicios;

import java.util.Scanner;

/**
 * Clase que alberga el segundo ejercicio, una conversión de segundos a horas, minutos y segundos.
 * Se solicita al usuario introducir un valor en segundos y se realiza
 * la conversión aplicando divisiones y restos.
 */
public class Ejercicio2 {

    // Scanner para capturar datos introducidos por el usuario.
    private final Scanner sc = new Scanner(System.in);

    /*
     * Hágase un programa que convierta segundos en horas,
     * minutos y segundos.
     */
    public void ejercicio2() {

        // 1. Introducir valores.
        // 2. Guardar en variables.
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int segundosTotal = sc.nextInt(); // 24973
        // 3. Hacer cálculos.
        // segundos -> 1 hora -> 3600
        // minutos -> 1 hora -> 60
        // segundos -> 1 minuto -> 60
        int horas = segundosTotal/3600;
        int minutos = (segundosTotal%3600)/60;
        int segundo = segundosTotal%60;
        // 4. Mostrar datos.
        System.out.println("El numero de horas es " + horas);
        System.out.println("El numero de minutos es " + minutos);
        System.out.println("El numero de segundos es " + segundo);
    }
}
