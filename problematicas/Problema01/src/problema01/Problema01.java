/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // declaración de variables
        String nombre;
        String posicion;
        double estatura;
        int edad;
        int contador = 0;
        int sumaEdad = 0;
        double sumaEstatura = 0;
        double promedioEdad;
        double promedioEstatura;
        String salida;
        String cadena1 = "Listado de jugadores\n";
        String cadena2 = "Listado de edades\n";
        boolean bandera = true;
        do {
            System.out.println("Ingrese el nombre de Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo que ocupa: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
            contador = contador + 1;
            cadena1 = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n",
                    cadena1,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            cadena2 = String.format("%s%d\n",
                    cadena2,
                    edad);
            System.out.println("Ingrese (si) para terminar de ingresar datos"
            );
            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
                } 
        }while (bandera);
         
        promedioEdad = (double) sumaEdad / contador;
        promedioEstatura = sumaEstatura / contador;
        System.out.printf("%s%sPromedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n",
                cadena1,
                cadena2,
                promedioEdad,
                promedioEstatura);
            }
        }
    
