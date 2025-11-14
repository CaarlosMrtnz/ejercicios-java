package ejercicios;

import java.util.Scanner;

/**
 * Clase que alberga el tercer ejercico, un cálculo del precio sin IVA y del IVA pagado a partir
 * del precio total con IVA y el porcentaje aplicado. Incluye validación
 * de rangos permitidos para el precio y el IVA.
 */
public class Ejercicio3 {

    // Scanner para capturar datos introducidos por el usuario.
    private final Scanner sc = new Scanner(System.in);

    /*
     * Permítase introducir el valor con IVA de una compra con dos
     * decimales (la compra no puede ser superior a 500€ ni inferior
     * a 0€) y el valor del IVA de dicha compra (valor entero entre
     * 0 y 25%).¿Cuánto costó la compra sin IVA? ¿Cuánto fue el IVA?
     * Muéstrese los resultados redondeados a dos decimales. (Compra)
     */
    public void ejercicio3() {

        double precioConIva, iva;

        // 1. Introducir valores.
        // 2. Guardar en variables.
        while (true) {
            System.out.println("Introduce el precio de compra: ");
            precioConIva = sc.nextDouble();
            if(precioConIva <= 500 && precioConIva >= 0) {
                break;
            }
            System.err.println("El precio debe ser inferior a 500 y superior a 0.");
        }

        while (true) {
            System.out.println("Introduce el iva de compra: ");
            iva = sc.nextDouble();
            if(iva < 25 && iva > 0) {
                break;
            }
            System.err.println("El iva debe ser inferior a 25 y superior a 0.");
        }

        // 3. Hacer cálculos.
        double valorSinIva = precioConIva / (1 + (iva / 100));
        double valorIva = precioConIva - valorSinIva;
        // 4. Mostrar datos.
        System.out.printf("El valor del IVA de esa compra es: %.2f%n", valorIva);
        System.out.printf("El valor de esa compra sin IVA es: %.2f%n", valorSinIva);
    }
}
