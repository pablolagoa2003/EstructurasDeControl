/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;
  import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Dia5Ej6V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner leer = new Scanner(System.in);
        String respuesta;
        
        boolean salir = true;
        
        int opcion, suma, resta, mult, div;

        System.out.print("Ingrese un número entero: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese otro número entero: ");
        int num2 = leer.nextInt();

        System.out.println("==============================");

        do {

            System.out.println("=====MENÚ=====");
            System.out.println("1] Sumar");
            System.out.println("2] Restar");
            System.out.println("3] Multiplicar");
            System.out.println("4] Dividir");
            System.out.println("5] Salir");
            System.out.print("Elija una Opción: ");
            
            opcion = leer.nextInt();

            switch (opcion) {
                
                case 1:
                    
                    System.out.println("==================");
                    System.out.println("Suma:");

                    suma = num1 + num2;

                    System.out.println("La suma de los números es: [" + suma + "]");
                    System.out.println("===============================");
                    
                    break;

                case 2:
                    
                    System.out.println("==================");
                    System.out.println("Resta:");

                    resta = num1 - num2;

                    System.out.println("La resta de los números es: [" + resta + "]");
                    System.out.println("===============================");
                    
                    break;

                case 3:
                    
                    System.out.println("==================");
                    System.out.println("Multiplicación:");

                    mult = num1 * num2;

                    System.out.println("La Multiplicación de los números es: [" + mult + "]");
                    System.out.println("=========================================");
                    
                    break;

                case 4:
                    System.out.println("==================");
                    System.out.println("División:");

                    div = num1 / num2;

                    System.out.println("La división de los números es: [" + div + "]");
                    System.out.println("==================================");
                    
                    break;
                    
                case 5:
                    
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    
                    respuesta = leer.next();
                    
                    if (respuesta.equalsIgnoreCase("S")) {
                        
                        salir = false;
                        
                        break;
                        
                    } else {
                        
                        continue;
                    }

                default:

                    System.out.println("Por favor, digite la opción correcta");
            }

        } while (salir);
    }
    
}
