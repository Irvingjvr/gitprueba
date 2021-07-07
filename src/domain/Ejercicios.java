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
public class Ejercicios {
    public static void main(String[] args) {
        int numMayor = 0;
        int arre[] = new int[5];
        Scanner sca = new Scanner(System.in);
        for (int i = 0; i < arre.length; i++) {
            arre[i]= sca.nextInt();
                    
        }
        for (int i = 0; i < arre.length; i++) {
            if(arre[i]>numMayor){
                numMayor=arre[i];
            }
        }
        System.out.println("numMayor = " + numMayor);
    }
}
