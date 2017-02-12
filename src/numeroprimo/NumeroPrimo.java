/*
21. Leer un número y determinar si es o no es primo.
 */
package numeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static boolean numeroPrimo(int numero) {
        boolean encontrado = false;
        int divisor = 2;
        while (divisor < numero) {
            while (numero % divisor != 0) {
                divisor++;
            }
            if (numero == divisor) {
                encontrado = true;
            } else {
                encontrado = false;
            }

        }
        return (encontrado);
    }

    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));

        if (numeroPrimo(numero) == true) {
            System.out.println("Numero SI Primo");
        } else {
            System.out.println("Numero NO primo");
        }

    }
}
