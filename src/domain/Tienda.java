/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Scanner;

/**
 *
 * @author irvin
 */
public class Tienda {
    public static void main(String[] args) {
        int contadorVentas = 0;
       double ventas[] = new double[10];
       Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese las ventas del mes");
        for (int i = 0; i <ventas.length; i++) {
            ventas[i]=scanner.nextDouble();
        }
        for (int i = 0;i < ventas.length; i++) {
            if(ventas[i]>2000){
                System.out.println(ventas[i]);
                contadorVentas++;
            }
        }
        System.out.println(contadorVentas);
        
    }
      

    
    
    
   
    
}
