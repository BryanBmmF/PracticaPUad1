/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitariasjunit;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 *
 * @author bryan
 */
public class PruebasUnitariasJUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int opcion = 0 ;
        int num1=0;
        int num2=0;
        
        do {
            System.out.println("Calculadora Básica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("=>Ingrese una opcion");
            opcion = s.nextInt();
            System.out.println("=>Ingrese primer numero:");
            num1 = s.nextInt();
            System.out.println("=>Ingrese segundo numero:");
            num2 = s.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: "+Calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+Calculadora.sumar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+Calculadora.sumar(num1, num2));
                    break;
                case 4:
                    System.out.println("La division es: "+Calculadora.sumar(num1, num2));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("X Ingrese una opcion valida");
            }
            
        } while(opcion!=5);
       
        System.out.println("=== Fin programa ===");
    }
    
}
