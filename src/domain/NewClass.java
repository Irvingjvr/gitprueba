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
public class NewClass {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//tu código va aquí
		int x=1;
int pago= (int) (amount * .10);
    int cr=amount-pago;
  int total =0;

while(x<=3){
    System.out.println(cr);
   // System.out.println("pago: "+ x + " = " + pago);
    
    pago=(int) (cr * .10);
    cr=cr-pago;
    total=total + pago;
    
    
    x++;
}
//System.out.println("total: "+total);
	}
}
    
