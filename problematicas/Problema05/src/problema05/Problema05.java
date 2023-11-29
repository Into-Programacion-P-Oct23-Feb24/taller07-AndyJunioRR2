/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 0;
        int denominador = 3;
        int contador = 0;
        String cadena1 = "1";

        do {
            if (contador % 2 == 0) {
                numerador = +1 / denominador;
                cadena1 = String.format("%s- 1/%d ",
                        cadena1,
                        denominador);
            } else {
                numerador = -1 / denominador;
                cadena1 = String.format("%s+ 1/%d ",
                        cadena1,
                        denominador);
            }
            denominador = denominador + 2;

            contador = contador + 1;
        } while (contador <= 6);

        System.out.printf("%s\n", cadena1);
    }
}
