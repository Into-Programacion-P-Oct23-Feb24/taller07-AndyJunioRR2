/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 0;
        int denominador = 3;
        int contador = 0;
        String cadenaA = "1";
        
        while (contador <= 6){ 
            if (contador %2 == 0){
            numerador = +1 / denominador;
            cadenaA = String.format("%s- 1/%d ", cadenaA,  denominador);
            
            } else {
                
            numerador = -1 / denominador;
 
            cadenaA = String.format("%s+ 1/%d ", cadenaA, denominador);
            }
            denominador = denominador + 2;
            contador = contador + 1;
        }
        System.out.printf("%s\n", cadenaA);
    }   
}
